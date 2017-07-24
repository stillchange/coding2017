package com.coderising.payroll.paymentMethod;

import com.coderising.payroll.Paycheck;

public class BankMethod implements PaymentMethod {
	private String bank;
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String account;
	@Override
	public void pay(Paycheck pc) {
		// TODO Auto-generated method stub
		System.out.println("bank:"+bank);
		System.out.println("account:"+account);
		System.out.println("netPay"+pc.getNetPay());
	}

}
