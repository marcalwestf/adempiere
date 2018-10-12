/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for I_BudgetPlan
 *  @author Adempiere (generated) 
 *  @version 1.7.07 - $Id$ */
public class X_I_BudgetPlan extends PO implements I_I_BudgetPlan, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20180518L;

    /** Standard Constructor */
    public X_I_BudgetPlan (Properties ctx, int I_BudgetPlan_ID, String trxName)
    {
      super (ctx, I_BudgetPlan_ID, trxName);
      /** if (I_BudgetPlan_ID == 0)
        {
			setI_BudgetPlan_ID (0);
        } */
    }

    /** Load Constructor */
    public X_I_BudgetPlan (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_I_BudgetPlan[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_A_Asset_Group getA_Asset_Group() throws RuntimeException
    {
		return (I_A_Asset_Group)MTable.get(getCtx(), I_A_Asset_Group.Table_Name)
			.getPO(getA_Asset_Group_ID(), get_TrxName());	}

	/** Set Asset Group.
		@param A_Asset_Group_ID 
		Group of Assets
	  */
	public void setA_Asset_Group_ID (int A_Asset_Group_ID)
	{
		if (A_Asset_Group_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_Group_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
	}

	/** Get Asset Group.
		@return Group of Assets
	  */
	public int getA_Asset_Group_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_A_Asset getA_Asset() throws RuntimeException
    {
		return (I_A_Asset)MTable.get(getCtx(), I_A_Asset.Table_Name)
			.getPO(getA_Asset_ID(), get_TrxName());	}

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ElementValue getAccount() throws RuntimeException
    {
		return (I_C_ElementValue)MTable.get(getCtx(), I_C_ElementValue.Table_Name)
			.getPO(getAccount_ID(), get_TrxName());	}

	/** Set Account.
		@param Account_ID 
		Account used
	  */
	public void setAccount_ID (int Account_ID)
	{
		if (Account_ID < 1) 
			set_Value (COLUMNNAME_Account_ID, null);
		else 
			set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
	}

	/** Get Account.
		@return Account used
	  */
	public int getAccount_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Key.
		@param AccountValue 
		Key of Account Element
	  */
	public void setAccountValue (String AccountValue)
	{
		set_Value (COLUMNNAME_AccountValue, AccountValue);
	}

	/** Get Account Key.
		@return Key of Account Element
	  */
	public String getAccountValue () 
	{
		return (String)get_Value(COLUMNNAME_AccountValue);
	}

	/** Set Activity Value.
		@param ActivityValue Activity Value	  */
	public void setActivityValue (String ActivityValue)
	{
		set_Value (COLUMNNAME_ActivityValue, ActivityValue);
	}

	/** Get Activity Value.
		@return Activity Value	  */
	public String getActivityValue () 
	{
		return (String)get_Value(COLUMNNAME_ActivityValue);
	}

	/** Set Document Org.
		@param AD_OrgDoc_ID 
		Document Organization (independent from account organization)
	  */
	public void setAD_OrgDoc_ID (int AD_OrgDoc_ID)
	{
		if (AD_OrgDoc_ID < 1) 
			set_Value (COLUMNNAME_AD_OrgDoc_ID, null);
		else 
			set_Value (COLUMNNAME_AD_OrgDoc_ID, Integer.valueOf(AD_OrgDoc_ID));
	}

	/** Get Document Org.
		@return Document Organization (independent from account organization)
	  */
	public int getAD_OrgDoc_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgDoc_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Trx Organisation.
		@param AD_OrgTrx_ID 
		Performing or initiating organisation
	  */
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
	{
		if (AD_OrgTrx_ID < 1) 
			set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
		else 
			set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
	}

	/** Get Trx Organisation.
		@return Performing or initiating organisation
	  */
	public int getAD_OrgTrx_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Accounted Credit.
		@param AmtAcctCr 
		Accounted Credit Amount
	  */
	public void setAmtAcctCr (BigDecimal AmtAcctCr)
	{
		set_Value (COLUMNNAME_AmtAcctCr, AmtAcctCr);
	}

	/** Get Accounted Credit.
		@return Accounted Credit Amount
	  */
	public BigDecimal getAmtAcctCr () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Accounted Debit.
		@param AmtAcctDr 
		Accounted Debit Amount
	  */
	public void setAmtAcctDr (BigDecimal AmtAcctDr)
	{
		set_Value (COLUMNNAME_AmtAcctDr, AmtAcctDr);
	}

	/** Get Accounted Debit.
		@return Accounted Debit Amount
	  */
	public BigDecimal getAmtAcctDr () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Asset Value.
		@param AssetValue Asset Value	  */
	public void setAssetValue (String AssetValue)
	{
		set_Value (COLUMNNAME_AssetValue, AssetValue);
	}

	/** Get Asset Value.
		@return Asset Value	  */
	public String getAssetValue () 
	{
		return (String)get_Value(COLUMNNAME_AssetValue);
	}

	public I_B_BudgetPeriod getB_BudgetPeriod() throws RuntimeException
    {
		return (I_B_BudgetPeriod)MTable.get(getCtx(), I_B_BudgetPeriod.Table_Name)
			.getPO(getB_BudgetPeriod_ID(), get_TrxName());	}

	/** Set B_BudgetPeriod ID.
		@param B_BudgetPeriod_ID B_BudgetPeriod ID	  */
	public void setB_BudgetPeriod_ID (int B_BudgetPeriod_ID)
	{
		if (B_BudgetPeriod_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_B_BudgetPeriod_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_B_BudgetPeriod_ID, Integer.valueOf(B_BudgetPeriod_ID));
	}

	/** Get B_BudgetPeriod ID.
		@return B_BudgetPeriod ID	  */
	public int getB_BudgetPeriod_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_B_BudgetPeriod_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_B_BudgetPlan getB_BudgetPlan() throws RuntimeException
    {
		return (I_B_BudgetPlan)MTable.get(getCtx(), I_B_BudgetPlan.Table_Name)
			.getPO(getB_BudgetPlan_ID(), get_TrxName());	}

	/** Set B_BudgetPlan ID.
		@param B_BudgetPlan_ID B_BudgetPlan ID	  */
	public void setB_BudgetPlan_ID (int B_BudgetPlan_ID)
	{
		if (B_BudgetPlan_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_B_BudgetPlan_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_B_BudgetPlan_ID, Integer.valueOf(B_BudgetPlan_ID));
	}

	/** Get B_BudgetPlan ID.
		@return B_BudgetPlan ID	  */
	public int getB_BudgetPlan_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_B_BudgetPlan_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_B_BudgetPlanLine getB_BudgetPlanLine() throws RuntimeException
    {
		return (I_B_BudgetPlanLine)MTable.get(getCtx(), I_B_BudgetPlanLine.Table_Name)
			.getPO(getB_BudgetPlanLine_ID(), get_TrxName());	}

	/** Set B_BudgetPlanLine.
		@param B_BudgetPlanLine_ID B_BudgetPlanLine	  */
	public void setB_BudgetPlanLine_ID (int B_BudgetPlanLine_ID)
	{
		if (B_BudgetPlanLine_ID < 1) 
			set_Value (COLUMNNAME_B_BudgetPlanLine_ID, null);
		else 
			set_Value (COLUMNNAME_B_BudgetPlanLine_ID, Integer.valueOf(B_BudgetPlanLine_ID));
	}

	/** Get B_BudgetPlanLine.
		@return B_BudgetPlanLine	  */
	public int getB_BudgetPlanLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_B_BudgetPlanLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Business Partner Key.
		@param BPartnerValue 
		Key of the Business Partner
	  */
	public void setBPartnerValue (String BPartnerValue)
	{
		set_Value (COLUMNNAME_BPartnerValue, BPartnerValue);
	}

	/** Get Business Partner Key.
		@return Key of the Business Partner
	  */
	public String getBPartnerValue () 
	{
		return (String)get_Value(COLUMNNAME_BPartnerValue);
	}

	/** Set Budget Name.
		@param BudgetName 
		Budget Name
	  */
	public void setBudgetName (String BudgetName)
	{
		set_Value (COLUMNNAME_BudgetName, BudgetName);
	}

	/** Get Budget Name.
		@return Budget Name
	  */
	public String getBudgetName () 
	{
		return (String)get_Value(COLUMNNAME_BudgetName);
	}

	public I_C_Activity getC_Activity() throws RuntimeException
    {
		return (I_C_Activity)MTable.get(getCtx(), I_C_Activity.Table_Name)
			.getPO(getC_Activity_ID(), get_TrxName());	}

	/** Set Activity.
		@param C_Activity_ID 
		Business Activity
	  */
	public void setC_Activity_ID (int C_Activity_ID)
	{
		if (C_Activity_ID < 1) 
			set_Value (COLUMNNAME_C_Activity_ID, null);
		else 
			set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
	}

	/** Get Activity.
		@return Business Activity
	  */
	public int getC_Activity_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Campaign Value.
		@param CampaignValue Campaign Value	  */
	public void setCampaignValue (String CampaignValue)
	{
		set_Value (COLUMNNAME_CampaignValue, CampaignValue);
	}

	/** Get Campaign Value.
		@return Campaign Value	  */
	public String getCampaignValue () 
	{
		return (String)get_Value(COLUMNNAME_CampaignValue);
	}

	public I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Campaign getC_Campaign() throws RuntimeException
    {
		return (I_C_Campaign)MTable.get(getCtx(), I_C_Campaign.Table_Name)
			.getPO(getC_Campaign_ID(), get_TrxName());	}

	/** Set Campaign.
		@param C_Campaign_ID 
		Marketing Campaign
	  */
	public void setC_Campaign_ID (int C_Campaign_ID)
	{
		if (C_Campaign_ID < 1) 
			set_Value (COLUMNNAME_C_Campaign_ID, null);
		else 
			set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
	}

	/** Get Campaign.
		@return Marketing Campaign
	  */
	public int getC_Campaign_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_DocType getC_DocType() throws RuntimeException
    {
		return (I_C_DocType)MTable.get(getCtx(), I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Period getC_Period() throws RuntimeException
    {
		return (I_C_Period)MTable.get(getCtx(), I_C_Period.Table_Name)
			.getPO(getC_Period_ID(), get_TrxName());	}

	/** Set Period.
		@param C_Period_ID 
		Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID)
	{
		if (C_Period_ID < 1) 
			set_Value (COLUMNNAME_C_Period_ID, null);
		else 
			set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
	}

	/** Get Period.
		@return Period of the Calendar
	  */
	public int getC_Period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Project getC_Project() throws RuntimeException
    {
		return (I_C_Project)MTable.get(getCtx(), I_C_Project.Table_Name)
			.getPO(getC_Project_ID(), get_TrxName());	}

	/** Set Project.
		@param C_Project_ID 
		Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID)
	{
		if (C_Project_ID < 1) 
			set_Value (COLUMNNAME_C_Project_ID, null);
		else 
			set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
	}

	/** Get Project.
		@return Financial Project
	  */
	public int getC_Project_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_SalesRegion getC_SalesRegion() throws RuntimeException
    {
		return (I_C_SalesRegion)MTable.get(getCtx(), I_C_SalesRegion.Table_Name)
			.getPO(getC_SalesRegion_ID(), get_TrxName());	}

	/** Set Sales Region.
		@param C_SalesRegion_ID 
		Sales coverage region
	  */
	public void setC_SalesRegion_ID (int C_SalesRegion_ID)
	{
		if (C_SalesRegion_ID < 1) 
			set_Value (COLUMNNAME_C_SalesRegion_ID, null);
		else 
			set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
	}

	/** Get Sales Region.
		@return Sales coverage region
	  */
	public int getC_SalesRegion_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_UOM getC_UOM() throws RuntimeException
    {
		return (I_C_UOM)MTable.get(getCtx(), I_C_UOM.Table_Name)
			.getPO(getC_UOM_ID(), get_TrxName());	}

	/** Set UOM.
		@param C_UOM_ID 
		Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get UOM.
		@return Unit of Measure
	  */
	public int getC_UOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getC_ValidCombination() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getC_ValidCombination_ID(), get_TrxName());	}

	/** Set Combination.
		@param C_ValidCombination_ID 
		Valid Account Combination
	  */
	public void setC_ValidCombination_ID (int C_ValidCombination_ID)
	{
		if (C_ValidCombination_ID < 1) 
			set_Value (COLUMNNAME_C_ValidCombination_ID, null);
		else 
			set_Value (COLUMNNAME_C_ValidCombination_ID, Integer.valueOf(C_ValidCombination_ID));
	}

	/** Get Combination.
		@return Valid Account Combination
	  */
	public int getC_ValidCombination_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ValidCombination_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Date.
		@param DateAcct 
		Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct)
	{
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
	}

	/** Set Document Date.
		@param DateDoc 
		Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getDocumentNo());
    }

	public I_GL_Budget getGL_Budget() throws RuntimeException
    {
		return (I_GL_Budget)MTable.get(getCtx(), I_GL_Budget.Table_Name)
			.getPO(getGL_Budget_ID(), get_TrxName());	}

	/** Set Budget.
		@param GL_Budget_ID 
		General Ledger Budget
	  */
	public void setGL_Budget_ID (int GL_Budget_ID)
	{
		if (GL_Budget_ID < 1) 
			set_Value (COLUMNNAME_GL_Budget_ID, null);
		else 
			set_Value (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
	}

	/** Get Budget.
		@return General Ledger Budget
	  */
	public int getGL_Budget_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set I_BudgetPlan ID.
		@param I_BudgetPlan_ID I_BudgetPlan ID	  */
	public void setI_BudgetPlan_ID (int I_BudgetPlan_ID)
	{
		if (I_BudgetPlan_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_I_BudgetPlan_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_I_BudgetPlan_ID, Integer.valueOf(I_BudgetPlan_ID));
	}

	/** Get I_BudgetPlan ID.
		@return I_BudgetPlan ID	  */
	public int getI_BudgetPlan_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_I_BudgetPlan_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Import Error Message.
		@param I_ErrorMsg 
		Messages generated from import process
	  */
	public void setI_ErrorMsg (String I_ErrorMsg)
	{
		set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
	}

	/** Get Import Error Message.
		@return Messages generated from import process
	  */
	public String getI_ErrorMsg () 
	{
		return (String)get_Value(COLUMNNAME_I_ErrorMsg);
	}

	/** Set Imported.
		@param I_IsImported 
		Has this import been processed
	  */
	public void setI_IsImported (boolean I_IsImported)
	{
		set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
	}

	/** Get Imported.
		@return Has this import been processed
	  */
	public boolean isI_IsImported () 
	{
		Object oo = get_Value(COLUMNNAME_I_IsImported);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sales Transaction.
		@param IsSOTrx 
		This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx)
	{
		set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
	}

	/** Get Sales Transaction.
		@return This is a Sales Transaction
	  */
	public boolean isSOTrx () 
	{
		Object oo = get_Value(COLUMNNAME_IsSOTrx);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_M_Product getM_Product() throws RuntimeException
    {
		return (I_M_Product)MTable.get(getCtx(), I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Operator AD_Reference_ID=54031 */
	public static final int OPERATOR_AD_Reference_ID=54031;
	/** - = - */
	public static final String OPERATOR_Minus = "-";
	/** + = + */
	public static final String OPERATOR_Plus = "+";
	/** * = * */
	public static final String OPERATOR_Multiply = "*";
	/** / = / */
	public static final String OPERATOR_Divide = "/";
	/** Set Operator.
		@param Operator Operator	  */
	public void setOperator (String Operator)
	{

		set_Value (COLUMNNAME_Operator, Operator);
	}

	/** Get Operator.
		@return Operator	  */
	public String getOperator () 
	{
		return (String)get_Value(COLUMNNAME_Operator);
	}

	/** Set Document Org Name.
		@param OrgDocName 
		Document Org Name
	  */
	public void setOrgDocName (String OrgDocName)
	{
		set_Value (COLUMNNAME_OrgDocName, OrgDocName);
	}

	/** Get Document Org Name.
		@return Document Org Name
	  */
	public String getOrgDocName () 
	{
		return (String)get_Value(COLUMNNAME_OrgDocName);
	}

	/** Set Org Key.
		@param OrgValue 
		Key of the Organization
	  */
	public void setOrgValue (String OrgValue)
	{
		set_Value (COLUMNNAME_OrgValue, OrgValue);
	}

	/** Get Org Key.
		@return Key of the Organization
	  */
	public String getOrgValue () 
	{
		return (String)get_Value(COLUMNNAME_OrgValue);
	}

	/** Set Percent.
		@param Percent 
		Percentage
	  */
	public void setPercent (BigDecimal Percent)
	{
		set_Value (COLUMNNAME_Percent, Percent);
	}

	/** Get Percent.
		@return Percentage
	  */
	public BigDecimal getPercent () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percent);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ElementValue getPercentageBase() throws RuntimeException
    {
		return (I_C_ElementValue)MTable.get(getCtx(), I_C_ElementValue.Table_Name)
			.getPO(getPercentageBase_ID(), get_TrxName());	}

	/** Set PercentageBase_ID.
		@param PercentageBase_ID PercentageBase_ID	  */
	public void setPercentageBase_ID (int PercentageBase_ID)
	{
		if (PercentageBase_ID < 1) 
			set_Value (COLUMNNAME_PercentageBase_ID, null);
		else 
			set_Value (COLUMNNAME_PercentageBase_ID, Integer.valueOf(PercentageBase_ID));
	}

	/** Get PercentageBase_ID.
		@return PercentageBase_ID	  */
	public int getPercentageBase_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PercentageBase_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** PercentageBaseName AD_Reference_ID=182 */
	public static final int PERCENTAGEBASENAME_AD_Reference_ID=182;
	/** Set PercentageBase Name.
		@param PercentageBaseName PercentageBase Name	  */
	public void setPercentageBaseName (String PercentageBaseName)
	{

		set_Value (COLUMNNAME_PercentageBaseName, PercentageBaseName);
	}

	/** Get PercentageBase Name.
		@return PercentageBase Name	  */
	public String getPercentageBaseName () 
	{
		return (String)get_Value(COLUMNNAME_PercentageBaseName);
	}

	public I_C_Period getPeriodFrom() throws RuntimeException
    {
		return (I_C_Period)MTable.get(getCtx(), I_C_Period.Table_Name)
			.getPO(getPeriodFrom_ID(), get_TrxName());	}

	/** Set PeriodFrom_ID.
		@param PeriodFrom_ID 
		Starting Period of Fact Accts selected
	  */
	public void setPeriodFrom_ID (int PeriodFrom_ID)
	{
		if (PeriodFrom_ID < 1) 
			set_Value (COLUMNNAME_PeriodFrom_ID, null);
		else 
			set_Value (COLUMNNAME_PeriodFrom_ID, Integer.valueOf(PeriodFrom_ID));
	}

	/** Get PeriodFrom_ID.
		@return Starting Period of Fact Accts selected
	  */
	public int getPeriodFrom_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PeriodFrom_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Period From Name.
		@param PeriodFromName 
		Period From Name
	  */
	public void setPeriodFromName (String PeriodFromName)
	{
		set_Value (COLUMNNAME_PeriodFromName, PeriodFromName);
	}

	/** Get Period From Name.
		@return Period From Name
	  */
	public String getPeriodFromName () 
	{
		return (String)get_Value(COLUMNNAME_PeriodFromName);
	}

	/** Set Period Name.
		@param PeriodName 
		Period Name
	  */
	public void setPeriodName (String PeriodName)
	{
		set_Value (COLUMNNAME_PeriodName, PeriodName);
	}

	/** Get Period Name.
		@return Period Name
	  */
	public String getPeriodName () 
	{
		return (String)get_Value(COLUMNNAME_PeriodName);
	}

	public I_C_Period getPeriodTo() throws RuntimeException
    {
		return (I_C_Period)MTable.get(getCtx(), I_C_Period.Table_Name)
			.getPO(getPeriodTo_ID(), get_TrxName());	}

	/** Set PeriodTo_ID.
		@param PeriodTo_ID 
		End Period in Fact Accts selected
	  */
	public void setPeriodTo_ID (int PeriodTo_ID)
	{
		if (PeriodTo_ID < 1) 
			set_Value (COLUMNNAME_PeriodTo_ID, null);
		else 
			set_Value (COLUMNNAME_PeriodTo_ID, Integer.valueOf(PeriodTo_ID));
	}

	/** Get PeriodTo_ID.
		@return End Period in Fact Accts selected
	  */
	public int getPeriodTo_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PeriodTo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Period To Name.
		@param PeriodToName 
		Period To Name
	  */
	public void setPeriodToName (String PeriodToName)
	{
		set_Value (COLUMNNAME_PeriodToName, PeriodToName);
	}

	/** Get Period To Name.
		@return Period To Name
	  */
	public String getPeriodToName () 
	{
		return (String)get_Value(COLUMNNAME_PeriodToName);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Product Key.
		@param ProductValue 
		Key of the Product
	  */
	public void setProductValue (String ProductValue)
	{
		set_Value (COLUMNNAME_ProductValue, ProductValue);
	}

	/** Get Product Key.
		@return Key of the Product
	  */
	public String getProductValue () 
	{
		return (String)get_Value(COLUMNNAME_ProductValue);
	}

	/** Set Project Key.
		@param ProjectValue 
		Key of the Project
	  */
	public void setProjectValue (String ProjectValue)
	{
		set_Value (COLUMNNAME_ProjectValue, ProjectValue);
	}

	/** Get Project Key.
		@return Key of the Project
	  */
	public String getProjectValue () 
	{
		return (String)get_Value(COLUMNNAME_ProjectValue);
	}

	/** Set Quantity.
		@param Qty 
		Quantity
	  */
	public void setQty (BigDecimal Qty)
	{
		set_Value (COLUMNNAME_Qty, Qty);
	}

	/** Get Quantity.
		@return Quantity
	  */
	public BigDecimal getQty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Sales Region Value.
		@param SalesRegionValue Sales Region Value	  */
	public void setSalesRegionValue (String SalesRegionValue)
	{
		set_Value (COLUMNNAME_SalesRegionValue, SalesRegionValue);
	}

	/** Get Sales Region Value.
		@return Sales Region Value	  */
	public String getSalesRegionValue () 
	{
		return (String)get_Value(COLUMNNAME_SalesRegionValue);
	}

	public I_C_ElementValue getSubAccount() throws RuntimeException
    {
		return (I_C_ElementValue)MTable.get(getCtx(), I_C_ElementValue.Table_Name)
			.getPO(getSubAccount_ID(), get_TrxName());	}

	/** Set Sub Account.
		@param SubAccount_ID 
		Account used
	  */
	public void setSubAccount_ID (int SubAccount_ID)
	{
		if (SubAccount_ID < 1) 
			set_Value (COLUMNNAME_SubAccount_ID, null);
		else 
			set_Value (COLUMNNAME_SubAccount_ID, Integer.valueOf(SubAccount_ID));
	}

	/** Get Sub Account.
		@return Account used
	  */
	public int getSubAccount_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SubAccount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sub Account Key.
		@param SubAccountValue 
		Key of Account Element
	  */
	public void setSubAccountValue (String SubAccountValue)
	{
		set_Value (COLUMNNAME_SubAccountValue, SubAccountValue);
	}

	/** Get Sub Account Key.
		@return Key of Account Element
	  */
	public String getSubAccountValue () 
	{
		return (String)get_Value(COLUMNNAME_SubAccountValue);
	}
}