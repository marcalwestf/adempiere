/******************************************************************************
 * Product: iDempiere Free ERP Project based on Compiere (2006)               *
 * Copyright (C) 2014 Redhuan D. Oon All Rights Reserved.                     *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *  FOR NON-COMMERCIAL DEVELOPER USE ONLY                                     *
 *  @author Redhuan D. Oon  - red1@red1.org  www.red1.org  www.sysnova.com    *
 *****************************************************************************/

package org.adempiere.model;

import java.lang.reflect.Method;

import org.adempiere.budget.BudgetUtils;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MBudgetPlanLine;
import org.compiere.model.MClient;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MMessage;
import org.compiere.model.MNote;
import org.compiere.model.MOrder;
import org.compiere.model.MPayment;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class BudgetDocEvent implements ModelValidator
{
	private static CLogger	log				= CLogger.getCLogger(BudgetDocEvent.class);
	private int				m_AD_Client_ID	= -1;
	private int				timing;
	private boolean			isSOTrx;

	@Override
	public void initialize(ModelValidationEngine engine, MClient client)
	{
		if (client != null)
		{
			m_AD_Client_ID = client.getAD_Client_ID();
		}
		engine.addDocValidate(MOrder.Table_Name, this);
		engine.addDocValidate(MInvoice.Table_Name, this);
		engine.addDocValidate(MPayment.Table_Name, this);
		engine.addDocValidate(MJournal.Table_Name, this);
		log.info("<<BUDGET>> MODULE INITIALIZED");
	}

	@Override
	public int getAD_Client_ID()
	{
		return m_AD_Client_ID;
	}

	@Override
	public String login(int AD_Org_ID, int AD_Role_ID, int AD_User_ID)
	{
		Env.setContext(Env.getCtx(), "#isBudgetValidatorEnabled", true);
		return null;
	}

	@Override
	public String modelChange(PO po, int type) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String docValidate(PO po, int timing)
	{

		// Check if any budget plan detail rules available
		MBudgetPlanLine budgetPlanLine = new Query(po.getCtx(), MBudgetPlanLine.Table_Name, "", po.get_TrxName())
				.setOnlyActiveRecords(true).setClient_ID().first();
		if (budgetPlanLine != null)
		{
			this.timing = timing;
			BudgetUtils bg = new BudgetUtils();
			// using utils for reuse by adempiere 361 modelvalidator
			if (BudgetUtils.budgetCONFIGinstance == null)
			{
				log.info("<<BUDGET>> RULES ONE-TIME SETTING STARTED");
				bg.initBudgetConfig(po);
				bg.setupCalendar(po);
				bg.revenueFlag = true;
				BudgetUtils.RevenueEstimate = bg.revenueEstimate();
				BudgetUtils.RevenueEstimate = bg.budgetTrend(null, BudgetUtils.RevenueEstimate, BudgetUtils.revenueKey);// OBTAIN
																														// REVENUE
																														// 4XXX
																														// AMOUNT
				bg.revenueFlag = false;
				log.info("<<BUDGET>> RULES ONE-TIME SETTING SUCCESSFUL");
			}

			// order document validation before complete
			if ((po instanceof MOrder || po instanceof MInvoice || po instanceof MPayment)
					&& timing == TIMING_BEFORE_PREPARE)
			{
				log.info(" topic=" + timing + " po=" + po);
				// SET VARIABLES FOR MATCHED BUDGETLINE PERCENT OR AMOUNT
				String response = bg.eventPurchasesSales(po);
				if (response != null)
					handleResponse(response, po);
			}

			// journal document validation before complete
			// budget control over accounting element to either percent or
			// amount
			// access gl budget lines for matching to journal-lines criteria
			else if (po instanceof MJournal && timing == TIMING_BEFORE_COMPLETE
					&& po.get_Value(MJournal.COLUMNNAME_PostingType).equals(MJournal.POSTINGTYPE_Actual))
			{

				log.info(" topic=" + timing + " po=" + po);
				// set variables for matched budgetline percent or amount
				String error = bg.eventGLJournal(po);
				if (error != null)
					handleResponse(error, po);
			}
		}
		return null;
	}

	/**
	 * allow for option to continue operations but notice will be issued sales
	 * performance target check with issotrx
	 * 
	 * @param notice
	 */
	private void handleResponse(String notice, PO po)
	{
		// differentiate between purchasing budget excess and sales target
		// performance measure
		isSOTrx = false;
		if (po instanceof MPayment)
		{
			MPayment payment = new MPayment(po.getCtx(), po.get_ID(), po.get_TrxName());
			if (payment.getC_DocType().isSOTrx())
				isSOTrx = true;
		}
		else
		{
			if (!(po instanceof MJournal) && po.get_ValueAsBoolean(MOrder.COLUMNNAME_IsSOTrx))
				isSOTrx = true;
		}
		// make it work with ZK webui -- Logilite
		if (BudgetUtils.budgetCONFIGinstance.isValid())
		{
			try
			{
				ClassLoader loader = Thread.currentThread().getContextClassLoader();
				if (loader == null)
					loader = BudgetDocEvent.class.getClassLoader();
				Class<?> clazz = loader.loadClass("org.adempiere.webui.window.FDialog");
				Method m = clazz.getMethod("warn", Integer.TYPE, String.class);
				m.invoke(null, 0, notice);
				if (!isSOTrx && notice.contains("Short"))
					throw new AdempiereException("Could not complete document, it exceeds defined Budget!");
			}
			catch (Exception e)
			{
				throw new AdempiereException(e);
			}
			// throw new AdempiereException(notice);
		}
		if (isSOTrx || !BudgetUtils.budgetCONFIGinstance.isValid())
		{
			log.warning(notice);
			MMessage msg = MMessage.get(po.getCtx(), "BudgetEvent");
			MNote note = new MNote(po.getCtx(), msg.getAD_Message_ID(), po.get_ValueAsInt("CreatedBy"),
					po.get_Table_ID(), po.get_ID(), po.get_ValueAsString(MOrder.COLUMNNAME_DocumentNo), // reference
					notice, // text message
					po.get_TrxName());
			note.setAD_Org_ID(po.getAD_Org_ID());
			note.saveEx();
			log.fine("budget system - notice created");
		}
	}

}
