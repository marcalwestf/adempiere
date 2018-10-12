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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for I_BudgetPlan
 *  @author Adempiere (generated) 
 *  @version 1.7.07
 */
public interface I_I_BudgetPlan 
{

    /** TableName=I_BudgetPlan */
    public static final String Table_Name = "I_BudgetPlan";

    /** AD_Table_ID=54413 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name A_Asset_Group_ID */
    public static final String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";

	/** Set Asset Group.
	  * Group of Assets
	  */
	public void setA_Asset_Group_ID (int A_Asset_Group_ID);

	/** Get Asset Group.
	  * Group of Assets
	  */
	public int getA_Asset_Group_ID();

	public I_A_Asset_Group getA_Asset_Group() throws RuntimeException;

    /** Column name A_Asset_ID */
    public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";

	/** Set Asset.
	  * Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID);

	/** Get Asset.
	  * Asset used internally or by customers
	  */
	public int getA_Asset_ID();

	public I_A_Asset getA_Asset() throws RuntimeException;

    /** Column name Account_ID */
    public static final String COLUMNNAME_Account_ID = "Account_ID";

	/** Set Account.
	  * Account used
	  */
	public void setAccount_ID (int Account_ID);

	/** Get Account.
	  * Account used
	  */
	public int getAccount_ID();

	public I_C_ElementValue getAccount() throws RuntimeException;

    /** Column name AccountValue */
    public static final String COLUMNNAME_AccountValue = "AccountValue";

	/** Set Account Key.
	  * Key of Account Element
	  */
	public void setAccountValue (String AccountValue);

	/** Get Account Key.
	  * Key of Account Element
	  */
	public String getAccountValue();

    /** Column name ActivityValue */
    public static final String COLUMNNAME_ActivityValue = "ActivityValue";

	/** Set Activity Value	  */
	public void setActivityValue (String ActivityValue);

	/** Get Activity Value	  */
	public String getActivityValue();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_OrgDoc_ID */
    public static final String COLUMNNAME_AD_OrgDoc_ID = "AD_OrgDoc_ID";

	/** Set Document Org.
	  * Document Organization (independent from account organization)
	  */
	public void setAD_OrgDoc_ID (int AD_OrgDoc_ID);

	/** Get Document Org.
	  * Document Organization (independent from account organization)
	  */
	public int getAD_OrgDoc_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organisation.
	  * Organisational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organisation.
	  * Organisational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_OrgTrx_ID */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

	/** Set Trx Organisation.
	  * Performing or initiating organisation
	  */
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID);

	/** Get Trx Organisation.
	  * Performing or initiating organisation
	  */
	public int getAD_OrgTrx_ID();

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public BigDecimal getAmount();

    /** Column name AmtAcctCr */
    public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

	/** Set Accounted Credit.
	  * Accounted Credit Amount
	  */
	public void setAmtAcctCr (BigDecimal AmtAcctCr);

	/** Get Accounted Credit.
	  * Accounted Credit Amount
	  */
	public BigDecimal getAmtAcctCr();

    /** Column name AmtAcctDr */
    public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

	/** Set Accounted Debit.
	  * Accounted Debit Amount
	  */
	public void setAmtAcctDr (BigDecimal AmtAcctDr);

	/** Get Accounted Debit.
	  * Accounted Debit Amount
	  */
	public BigDecimal getAmtAcctDr();

    /** Column name AssetValue */
    public static final String COLUMNNAME_AssetValue = "AssetValue";

	/** Set Asset Value	  */
	public void setAssetValue (String AssetValue);

	/** Get Asset Value	  */
	public String getAssetValue();

    /** Column name B_BudgetPeriod_ID */
    public static final String COLUMNNAME_B_BudgetPeriod_ID = "B_BudgetPeriod_ID";

	/** Set B_BudgetPeriod ID	  */
	public void setB_BudgetPeriod_ID (int B_BudgetPeriod_ID);

	/** Get B_BudgetPeriod ID	  */
	public int getB_BudgetPeriod_ID();

	public I_B_BudgetPeriod getB_BudgetPeriod() throws RuntimeException;

    /** Column name B_BudgetPlan_ID */
    public static final String COLUMNNAME_B_BudgetPlan_ID = "B_BudgetPlan_ID";

	/** Set B_BudgetPlan ID	  */
	public void setB_BudgetPlan_ID (int B_BudgetPlan_ID);

	/** Get B_BudgetPlan ID	  */
	public int getB_BudgetPlan_ID();

	public I_B_BudgetPlan getB_BudgetPlan() throws RuntimeException;

    /** Column name B_BudgetPlanLine_ID */
    public static final String COLUMNNAME_B_BudgetPlanLine_ID = "B_BudgetPlanLine_ID";

	/** Set B_BudgetPlanLine	  */
	public void setB_BudgetPlanLine_ID (int B_BudgetPlanLine_ID);

	/** Get B_BudgetPlanLine	  */
	public int getB_BudgetPlanLine_ID();

	public I_B_BudgetPlanLine getB_BudgetPlanLine() throws RuntimeException;

    /** Column name BPartnerValue */
    public static final String COLUMNNAME_BPartnerValue = "BPartnerValue";

	/** Set Business Partner Key.
	  * Key of the Business Partner
	  */
	public void setBPartnerValue (String BPartnerValue);

	/** Get Business Partner Key.
	  * Key of the Business Partner
	  */
	public String getBPartnerValue();

    /** Column name BudgetName */
    public static final String COLUMNNAME_BudgetName = "BudgetName";

	/** Set Budget Name.
	  * Budget Name
	  */
	public void setBudgetName (String BudgetName);

	/** Get Budget Name.
	  * Budget Name
	  */
	public String getBudgetName();

    /** Column name C_Activity_ID */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

	/** Set Activity.
	  * Business Activity
	  */
	public void setC_Activity_ID (int C_Activity_ID);

	/** Get Activity.
	  * Business Activity
	  */
	public int getC_Activity_ID();

	public I_C_Activity getC_Activity() throws RuntimeException;

    /** Column name CampaignValue */
    public static final String COLUMNNAME_CampaignValue = "CampaignValue";

	/** Set Campaign Value	  */
	public void setCampaignValue (String CampaignValue);

	/** Get Campaign Value	  */
	public String getCampaignValue();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Campaign_ID */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

	/** Set Campaign.
	  * Marketing Campaign
	  */
	public void setC_Campaign_ID (int C_Campaign_ID);

	/** Get Campaign.
	  * Marketing Campaign
	  */
	public int getC_Campaign_ID();

	public I_C_Campaign getC_Campaign() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name C_Period_ID */
    public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

	/** Set Period.
	  * Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID);

	/** Get Period.
	  * Period of the Calendar
	  */
	public int getC_Period_ID();

	public I_C_Period getC_Period() throws RuntimeException;

    /** Column name C_Project_ID */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

	/** Set Project.
	  * Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID);

	/** Get Project.
	  * Financial Project
	  */
	public int getC_Project_ID();

	public I_C_Project getC_Project() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name C_SalesRegion_ID */
    public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";

	/** Set Sales Region.
	  * Sales coverage region
	  */
	public void setC_SalesRegion_ID (int C_SalesRegion_ID);

	/** Get Sales Region.
	  * Sales coverage region
	  */
	public int getC_SalesRegion_ID();

	public I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

    /** Column name C_UOM_ID */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/** Set UOM.
	  * Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID);

	/** Get UOM.
	  * Unit of Measure
	  */
	public int getC_UOM_ID();

	public I_C_UOM getC_UOM() throws RuntimeException;

    /** Column name C_ValidCombination_ID */
    public static final String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";

	/** Set Combination.
	  * Valid Account Combination
	  */
	public void setC_ValidCombination_ID (int C_ValidCombination_ID);

	/** Get Combination.
	  * Valid Account Combination
	  */
	public int getC_ValidCombination_ID();

	public I_C_ValidCombination getC_ValidCombination() throws RuntimeException;

    /** Column name DateAcct */
    public static final String COLUMNNAME_DateAcct = "DateAcct";

	/** Set Account Date.
	  * Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct);

	/** Get Account Date.
	  * Accounting Date
	  */
	public Timestamp getDateAcct();

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name GL_Budget_ID */
    public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";

	/** Set Budget.
	  * General Ledger Budget
	  */
	public void setGL_Budget_ID (int GL_Budget_ID);

	/** Get Budget.
	  * General Ledger Budget
	  */
	public int getGL_Budget_ID();

	public I_GL_Budget getGL_Budget() throws RuntimeException;

    /** Column name I_BudgetPlan_ID */
    public static final String COLUMNNAME_I_BudgetPlan_ID = "I_BudgetPlan_ID";

	/** Set I_BudgetPlan ID	  */
	public void setI_BudgetPlan_ID (int I_BudgetPlan_ID);

	/** Get I_BudgetPlan ID	  */
	public int getI_BudgetPlan_ID();

    /** Column name I_ErrorMsg */
    public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";

	/** Set Import Error Message.
	  * Messages generated from import process
	  */
	public void setI_ErrorMsg (String I_ErrorMsg);

	/** Get Import Error Message.
	  * Messages generated from import process
	  */
	public String getI_ErrorMsg();

    /** Column name I_IsImported */
    public static final String COLUMNNAME_I_IsImported = "I_IsImported";

	/** Set Imported.
	  * Has this import been processed
	  */
	public void setI_IsImported (boolean I_IsImported);

	/** Get Imported.
	  * Has this import been processed
	  */
	public boolean isI_IsImported();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsSOTrx */
    public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

	/** Set Sales Transaction.
	  * This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx);

	/** Get Sales Transaction.
	  * This is a Sales Transaction
	  */
	public boolean isSOTrx();

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public I_M_Product getM_Product() throws RuntimeException;

    /** Column name Operator */
    public static final String COLUMNNAME_Operator = "Operator";

	/** Set Operator	  */
	public void setOperator (String Operator);

	/** Get Operator	  */
	public String getOperator();

    /** Column name OrgDocName */
    public static final String COLUMNNAME_OrgDocName = "OrgDocName";

	/** Set Document Org Name.
	  * Document Org Name
	  */
	public void setOrgDocName (String OrgDocName);

	/** Get Document Org Name.
	  * Document Org Name
	  */
	public String getOrgDocName();

    /** Column name OrgValue */
    public static final String COLUMNNAME_OrgValue = "OrgValue";

	/** Set Org Key.
	  * Key of the Organization
	  */
	public void setOrgValue (String OrgValue);

	/** Get Org Key.
	  * Key of the Organization
	  */
	public String getOrgValue();

    /** Column name Percent */
    public static final String COLUMNNAME_Percent = "Percent";

	/** Set Percent.
	  * Percentage
	  */
	public void setPercent (BigDecimal Percent);

	/** Get Percent.
	  * Percentage
	  */
	public BigDecimal getPercent();

    /** Column name PercentageBase_ID */
    public static final String COLUMNNAME_PercentageBase_ID = "PercentageBase_ID";

	/** Set PercentageBase_ID	  */
	public void setPercentageBase_ID (int PercentageBase_ID);

	/** Get PercentageBase_ID	  */
	public int getPercentageBase_ID();

	public I_C_ElementValue getPercentageBase() throws RuntimeException;

    /** Column name PercentageBaseName */
    public static final String COLUMNNAME_PercentageBaseName = "PercentageBaseName";

	/** Set PercentageBase Name	  */
	public void setPercentageBaseName (String PercentageBaseName);

	/** Get PercentageBase Name	  */
	public String getPercentageBaseName();

    /** Column name PeriodFrom_ID */
    public static final String COLUMNNAME_PeriodFrom_ID = "PeriodFrom_ID";

	/** Set PeriodFrom_ID.
	  * Starting Period of Fact Accts selected
	  */
	public void setPeriodFrom_ID (int PeriodFrom_ID);

	/** Get PeriodFrom_ID.
	  * Starting Period of Fact Accts selected
	  */
	public int getPeriodFrom_ID();

	public I_C_Period getPeriodFrom() throws RuntimeException;

    /** Column name PeriodFromName */
    public static final String COLUMNNAME_PeriodFromName = "PeriodFromName";

	/** Set Period From Name.
	  * Period From Name
	  */
	public void setPeriodFromName (String PeriodFromName);

	/** Get Period From Name.
	  * Period From Name
	  */
	public String getPeriodFromName();

    /** Column name PeriodName */
    public static final String COLUMNNAME_PeriodName = "PeriodName";

	/** Set Period Name.
	  * Period Name
	  */
	public void setPeriodName (String PeriodName);

	/** Get Period Name.
	  * Period Name
	  */
	public String getPeriodName();

    /** Column name PeriodTo_ID */
    public static final String COLUMNNAME_PeriodTo_ID = "PeriodTo_ID";

	/** Set PeriodTo_ID.
	  * End Period in Fact Accts selected
	  */
	public void setPeriodTo_ID (int PeriodTo_ID);

	/** Get PeriodTo_ID.
	  * End Period in Fact Accts selected
	  */
	public int getPeriodTo_ID();

	public I_C_Period getPeriodTo() throws RuntimeException;

    /** Column name PeriodToName */
    public static final String COLUMNNAME_PeriodToName = "PeriodToName";

	/** Set Period To Name.
	  * Period To Name
	  */
	public void setPeriodToName (String PeriodToName);

	/** Get Period To Name.
	  * Period To Name
	  */
	public String getPeriodToName();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name ProductValue */
    public static final String COLUMNNAME_ProductValue = "ProductValue";

	/** Set Product Key.
	  * Key of the Product
	  */
	public void setProductValue (String ProductValue);

	/** Get Product Key.
	  * Key of the Product
	  */
	public String getProductValue();

    /** Column name ProjectValue */
    public static final String COLUMNNAME_ProjectValue = "ProjectValue";

	/** Set Project Key.
	  * Key of the Project
	  */
	public void setProjectValue (String ProjectValue);

	/** Get Project Key.
	  * Key of the Project
	  */
	public String getProjectValue();

    /** Column name Qty */
    public static final String COLUMNNAME_Qty = "Qty";

	/** Set Quantity.
	  * Quantity
	  */
	public void setQty (BigDecimal Qty);

	/** Get Quantity.
	  * Quantity
	  */
	public BigDecimal getQty();

    /** Column name SalesRegionValue */
    public static final String COLUMNNAME_SalesRegionValue = "SalesRegionValue";

	/** Set Sales Region Value	  */
	public void setSalesRegionValue (String SalesRegionValue);

	/** Get Sales Region Value	  */
	public String getSalesRegionValue();

    /** Column name SubAccount_ID */
    public static final String COLUMNNAME_SubAccount_ID = "SubAccount_ID";

	/** Set Sub Account.
	  * Account used
	  */
	public void setSubAccount_ID (int SubAccount_ID);

	/** Get Sub Account.
	  * Account used
	  */
	public int getSubAccount_ID();

	public I_C_ElementValue getSubAccount() throws RuntimeException;

    /** Column name SubAccountValue */
    public static final String COLUMNNAME_SubAccountValue = "SubAccountValue";

	/** Set Sub Account Key.
	  * Key of Account Element
	  */
	public void setSubAccountValue (String SubAccountValue);

	/** Get Sub Account Key.
	  * Key of Account Element
	  */
	public String getSubAccountValue();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
