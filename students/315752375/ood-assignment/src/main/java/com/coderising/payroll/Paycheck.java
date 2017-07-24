package com.coderising.payroll;

import java.util.Date;
import java.util.Map;

public class Paycheck {
	private Date payPeriodStart;
	private Date payPeriodEnd;
	private double grossPay;
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
		
	}
	public double getGrossPay() {
		return grossPay;
	}
	public void setNetPay(double netPay){
		this.netPay = netPay;
	}
	public double getNetPay() {
		return netPay;
	}
	public void setDeductions(double deductions) {
		this.deductions  = deductions;		
	}
	public double getDeductions() {
		return deductions;
	}
	private double netPay;
	private double deductions;
	
	public Paycheck(Date payPeriodStart, Date payPeriodEnd){
		this.payPeriodStart = payPeriodStart;
		this.payPeriodEnd = payPeriodEnd;
	}
	public Date getPayPeriodEndDate() {
		
		return this.payPeriodEnd;
	}
	public Date getPayPeriodStartDate() {
		
		return this.payPeriodStart;
	}
}
