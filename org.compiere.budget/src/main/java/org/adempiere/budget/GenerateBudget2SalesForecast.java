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
package org.adempiere.budget;

import java.sql.Timestamp;
import java.util.List;

import org.compiere.model.MBudgetPlanLine;
import org.compiere.model.MCalendar;
import org.compiere.model.MForecast;
import org.compiere.model.MForecastLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MWarehouse;
import org.compiere.model.Query;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

/**
 * Generate Purchase Orders in bulk (refer another class that handles InfoWindow
 * process T_selection records to generate)
 * 
 * @author red1
 */
public class GenerateBudget2SalesForecast extends SvrProcess
{

	@Override
	protected void prepare()
	{
	}

	@Override
	protected String doIt() throws Exception
	{
		String whereClause = "EXISTS (SELECT T_Selection_ID FROM T_Selection WHERE  T_Selection.AD_PInstance_ID=? "
				+ "AND T_Selection.T_Selection_ID=B_BudgetPlanLine.B_BudgetPlanLine_ID) AND C_Period_ID IS NOT NULL";

		List<MBudgetPlanLine> lines = new Query(Env.getCtx(), MBudgetPlanLine.Table_Name, whereClause, get_TrxName())
				.setClient_ID().setParameters(new Object[] { getAD_PInstance_ID() }).list();
		if (lines.isEmpty() || lines == null)
			return "no lines";

		MCalendar calendar = MCalendar.getDefault(Env.getCtx());
		// create Sales Forecast header with each line included
		MForecast header = new MForecast(Env.getCtx(), 0, get_TrxName());
		header.setName("PO Forecast from SalesForecast");
		header.setC_Calendar_ID(calendar.getC_Calendar_ID());
		MPeriod period = MPeriod.findByCalendar(Env.getCtx(), header.getCreated(), calendar.getC_Calendar_ID(),
				get_TrxName());
		header.setC_Year_ID(period.getC_Year_ID());
		header.saveEx(get_TrxName());
		int noperiod = 0;
		int nobp = 0;
		int noqty = 0;
		int cnt = 0;
		for (MBudgetPlanLine line : lines)
		{
			MForecastLine forecastline = new MForecastLine(Env.getCtx(), 0, get_TrxName());
			forecastline.setM_Forecast_ID(header.getM_Forecast_ID());

			// DatePromised taken from Budget Plan Line Period if any.
			Timestamp datepromised = line.getC_Period().getStartDate();
			if (datepromised == null)
			{
				java.util.Date date = new java.util.Date();
				datepromised = new Timestamp(date.getTime());
			}
			forecastline.setDatePromised(datepromised);
			// check qty not to be zero
			// set Qty with Reserved/Ordered from future orders by DatePromised
			forecastline.setQty(line.getQty());
			
			forecastline.setAD_Org_ID(line.getAD_Org_ID());
			// set warehouse from org
			MWarehouse[] wh = MWarehouse.getForOrg(Env.getCtx(), line.getAD_Org_ID());
			
			// set product and save
			forecastline.setC_Period_ID(line.getC_Period_ID());
			forecastline.setM_Product_ID(line.getM_Product_ID());
			forecastline.setM_Warehouse_ID(wh[0].get_ID());
			forecastline.saveEx(get_TrxName());

			// checking counters
			cnt++;
			if (line.getC_Period_ID() == 0 || line.getC_Period() == null)
				noperiod++;
			if (line.getC_BPartner_ID() == 0 || line.getC_BPartner() == null)
				nobp++;
			if (line.getQty() == Env.ZERO)
				noqty++;
		}
		return "Total Sales Forecast Lines = " + cnt + ", No Qty = " + noqty + ", No Period = " + noperiod
				+ ", No Customer = " + nobp;

	}

}
