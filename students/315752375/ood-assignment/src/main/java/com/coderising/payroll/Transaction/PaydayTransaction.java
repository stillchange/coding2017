package com.coderising.payroll.Transaction;

import java.util.Date;
import java.util.List;

import com.coderising.payroll.Employee;
import com.coderising.payroll.Paycheck;
import com.coderising.payroll.Service.PayrollService;

public class PaydayTransaction {
	private Date date;
	private PayrollService payrollService;
	public void execute() {
		// TODO Auto-generated method stub
		date=new Date();
		payrollService=new PayrollService();
		List<Employee> employees=payrollService.getAllEmployees();
		for(Employee e:employees){
			if(e.isPayDay(date)){
				Paycheck paycheck=new Paycheck(e.getPayPeriodStartDate(date), date);
				e.payDay(paycheck);
				payrollService.savePackcheck(paycheck);
			}
		}
	}

}
