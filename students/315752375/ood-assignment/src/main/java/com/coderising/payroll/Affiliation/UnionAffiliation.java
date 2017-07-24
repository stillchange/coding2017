package com.coderising.payroll.Affiliation;

import java.util.Date;
import java.util.Map;

import com.coderising.payroll.Paycheck;
import com.coderising.payroll.Util.DateUtil;

public class UnionAffiliation implements Affiliation{
	private int memberId;
	private double weeklydue;
	private Map<Date, ServiceCharge> serviceCharges;
	@Override
	public double calculateDeductions(Paycheck pc) {
		// TODO Auto-generated method stub
		int friday=DateUtil.fridaybetween(pc.getPayPeriodStartDate(),pc.getPayPeriodEndDate());
		double totaldue=friday*weeklydue;
		double totalCharge=0;
		for(ServiceCharge sc:serviceCharges.values()){
			if(DateUtil.between(sc.getDate(), pc.getPayPeriodStartDate(), pc.getPayPeriodEndDate())){
				totalCharge+=sc.getAmount();
			}
				
		}
		return totaldue+totalCharge;
	}

}
