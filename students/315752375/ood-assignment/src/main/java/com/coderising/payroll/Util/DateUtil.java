package com.coderising.payroll.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static boolean isFirday(Date date) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_WEEK)==5;
	}

	public static Date add(Date payPeriodEndDate, int day) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(payPeriodEndDate);
		calendar.add(Calendar.DATE, day);
		return calendar.getTime();
	}
	public static boolean isLastDayofMonth(Date date) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DATE)==calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static Date getFirstDay(Date payPeriodEndDate) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(payPeriodEndDate);
		int day = calendar.get(Calendar.DATE);
		calendar.add(Calendar.DATE, -(day-1));
		return calendar.getTime();
	}
	public static Date parseDate(String string) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			return sdf.parse(string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static long getDaysBetween(Date firstPayableFriday, Date date) {
		// TODO Auto-generated method stub
		
		return (date.getTime()-firstPayableFriday.getTime())/(24*60*60*1000);
	}

	public static boolean between(Date date, Date payPeriodStartDate, Date payPeriodEndDate) {
		// TODO Auto-generated method stub
		return date.after(payPeriodStartDate)&&date.before(payPeriodEndDate);
	}

	public static int fridaybetween(Date payPeriodStartDate, Date payPeriodEndDate) {
		// TODO Auto-generated method stub
		int num=0;
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(payPeriodStartDate);
		while(calendar.getTime().before(payPeriodEndDate)){
			if(DateUtil.isFirday(calendar.getTime())){
				num++;
				calendar.add(Calendar.DAY_OF_YEAR, 7);
			}else{
				calendar.add(Calendar.DAY_OF_YEAR, 1);
			}
		}
		return num;
	}
	
	
}
