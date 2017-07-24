package com.coderising.payroll.paymentSchedule;

import java.util.Date;

import com.coderising.payroll.Util.DateUtil;

public class BiweeklySchedule implements PaymentSchedule{
	Date firstPayableFriday=DateUtil.parseDate("2017-6-2");
	@Override
	public boolean isPayDate(Date date) {
		// TODO Auto-generated method stub
		long interval=DateUtil.getDaysBetween(firstPayableFriday,date);
		return interval%14==0;
	}

	@Override
	public Date getPayPeriodStartDate(Date payPeriodEndDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
