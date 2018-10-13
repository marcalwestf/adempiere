/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBudgetConfig;
import org.compiere.util.Env;

public class BudgetConfigCallout extends CalloutEngine
{

	public BudgetConfigCallout()
	{
	}

	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue)
	{
		if (mField.getColumnName().equals(MBudgetConfig.COLUMNNAME_GL_Budget_Previous_Year))
			if (((BigDecimal) mTab.getValue(MBudgetConfig.COLUMNNAME_GL_Budget_Previous_Year)).intValue() > 0)
				mTab.setValue(MBudgetConfig.COLUMNNAME_GL_Budget_Previous_Month, Env.ZERO);
		if (mField.getColumnName().equals(MBudgetConfig.COLUMNNAME_GL_Budget_Previous_Month))
			if (((BigDecimal) mTab.getValue(MBudgetConfig.COLUMNNAME_GL_Budget_Previous_Month)).intValue() > 0)
				mTab.setValue(MBudgetConfig.COLUMNNAME_GL_Budget_Previous_Year, Env.ZERO);
		return null;
	}

}
