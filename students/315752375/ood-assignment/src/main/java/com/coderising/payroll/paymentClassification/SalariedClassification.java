package com.coderising.payroll.paymentClassification;

import com.coderising.payroll.Paycheck;

public class SalariedClassification implements PaymentClassification {
	private double salary;
	public double getSalary() {
		return salary;
	}
	public SalariedClassification(double salary) {
		super();
		this.salary = salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double calculatePay(Paycheck pc) {
		// TODO Auto-generated method stub
		return salary;
	}

}
