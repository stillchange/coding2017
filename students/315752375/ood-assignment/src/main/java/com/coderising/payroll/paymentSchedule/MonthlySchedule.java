package com.coderising.payroll.paymentSchedule;

import java.util.Date;

import com.coderising.payroll.Util.DateUtil;



public class MonthlySchedule implements PaymentSchedule {

	@Override
	public boolean isPayDate(Date date) {
		// TODO Auto-generated method stub
		return DateUtil.isLastDayofMonth(date);
	}

	@Override
	public Date getPayPeriodStartDate(Date payPeriodEndDate) {
		// TODO Auto-generated method stub
		return DateUtil.getFirstDay(payPeriodEndDate);
	}

}
