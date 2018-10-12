package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MBudgetResults extends X_B_BudgetResults
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public MBudgetResults(Properties ctx, int B_BudgetResults_ID, String trxName)
	{
		super(ctx, B_BudgetResults_ID, trxName);
	}

	public MBudgetResults(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}
}
