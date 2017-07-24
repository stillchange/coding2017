package com.coderising.payroll.paymentMethod;

import com.coderising.payroll.Paycheck;

public class HoldMethod implements PaymentMethod{
	String name;
	public HoldMethod(String name) {
		super();
		this.name = name;
	}
	@Override
	
	public void pay(Paycheck pc) {
		// TODO Auto-generated method stub
		System.out.println("hold for :"+name+"money:"+pc.getNetPay());
	}
	

}
