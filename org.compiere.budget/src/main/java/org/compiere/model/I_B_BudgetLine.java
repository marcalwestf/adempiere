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

/** Generated Interface for B_BudgetLine
 *  @author Adempiere (generated) 
 *  @version 1.7.07
 */
public interface I_B_BudgetLine 
{

    /** TableName=B_BudgetLine */
    public static final String Table_Name = "B_BudgetLine";

    /** AD_Table_ID=54407 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

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

    /** Column name B_BudgetLine_ID */
    public static final String COLUMNNAME_B_BudgetLine_ID = "B_BudgetLine_ID";

	/** Set B_BudgetLine ID	  */
	public void setB_BudgetLine_ID (int B_BudgetLine_ID);

	/** Get B_BudgetLine ID	  */
	public int getB_BudgetLine_ID();

    /** Column name B_BudgetPeriod_ID */
    public static final String COLUMNNAME_B_BudgetPeriod_ID = "B_BudgetPeriod_ID";

	/** Set B_BudgetPeriod ID	  */
	public void setB_BudgetPeriod_ID (int B_BudgetPeriod_ID);

	/** Get B_BudgetPeriod ID	  */
	public int getB_BudgetPeriod_ID();

	public I_B_BudgetPeriod getB_BudgetPeriod() throws RuntimeException;

    /** Column name B_BudgetPlanLine_ID */
    public static final String COLUMNNAME_B_BudgetPlanLine_ID = "B_BudgetPlanLine_ID";

	/** Set B_BudgetPlanLine	  */
	public void setB_BudgetPlanLine_ID (int B_BudgetPlanLine_ID);

	/** Get B_BudgetPlanLine	  */
	public int getB_BudgetPlanLine_ID();

	public I_B_BudgetPlanLine getB_BudgetPlanLine() throws RuntimeException;

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
