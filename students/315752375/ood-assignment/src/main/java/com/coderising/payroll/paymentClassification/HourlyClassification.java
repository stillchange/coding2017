package com.coderising.payroll.paymentClassification;

import java.util.Date;
import java.util.Map;

import com.coderising.payroll.Paycheck;
import com.coderising.payroll.TimeCard;
import com.coderising.payroll.Util.DateUtil;

public class HourlyClassification implements PaymentClassification {
	private double hourlyRate;
	private Map<Date, TimeCard>timeCards;
	public HourlyClassification(double hourlyRate){
		this.hourlyRate=hourlyRate;
	}
	public void addTimeCard(TimeCard tc){
		timeCards.put(tc.getDate(), tc);
	}
	@Override
	public double calculatePay(Paycheck pc) {
		// TODO Auto-generated method stub
		double totalPay=0;
		for(TimeCard tc:timeCards.values()){
			if(DateUtil.between(tc.getDate(), pc.getPayPeriodStartDate(),pc.getPayPeriodEndDate())){
				totalPay+=calculatePayForTimeCard(tc);
			}
		}
		return totalPay;
	}
	private double calculatePayForTimeCard(TimeCard tc) {
		// TODO Auto-generated method stub
		int hours=tc.getHours();
		if(hours>8){
			return hourlyRate*8+(hourlyRate-8)*hourlyRate*1.5;
		}else{
			return hourlyRate*8;
		}
	}

}
