package com.coderising.payroll.paymentMethod;

import com.coderising.payroll.Paycheck;

public interface PaymentMethod {
	public void pay(Paycheck pc);
}
