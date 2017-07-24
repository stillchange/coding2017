package com.coderising.payroll.paymentClassification;

import java.util.Date;
import java.util.Map;

import com.coderising.payroll.Paycheck;
import com.coderising.payroll.SalesReceipt;
import com.coderising.payroll.Util.DateUtil;

public class CommissionedClassification implements PaymentClassification{
	
	private double rate;
	private double salary;
	Map<Date, SalesReceipt> receipts;
	public CommissionedClassification(double rate, double salary) {
		super();
		this.rate = rate;
		this.salary = salary;
	}
	@Override
	public double calculatePay(Paycheck pc) {
		// TODO Auto-generated method stub
		double commission=0;
		for(SalesReceipt sr:receipts.values()){
			if(DateUtil.between(sr.getSaleDate(), pc.getPayPeriodStartDate(),pc.getPayPeriodEndDate())){
				commission+=sr.getAmount()*rate;
			}
		}
		return salary+commission;
	}

}
