package com.coderising.payroll.paymentMethod;

import com.coderising.payroll.Paycheck;

public class MailMehod implements PaymentMethod{
	private String address;
	@Override
	public void pay(Paycheck pc) {
		// TODO Auto-generated method stub
		System.out.println("mail to:"+address);
		System.out.println("netPay:"+pc.getNetPay());
	}

}
