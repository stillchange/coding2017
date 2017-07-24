package com.coderising.payroll.Service;

import java.util.LinkedList;
import java.util.List;

import com.coderising.payroll.Employee;
import com.coderising.payroll.Paycheck;
import com.coderising.payroll.paymentClassification.CommissionedClassification;
import com.coderising.payroll.paymentClassification.HourlyClassification;
import com.coderising.payroll.paymentClassification.SalariedClassification;
import com.coderising.payroll.paymentMethod.HoldMethod;
import com.coderising.payroll.paymentSchedule.BiweeklySchedule;
import com.coderising.payroll.paymentSchedule.MonthlySchedule;
import com.coderising.payroll.paymentSchedule.WeeklySchedule;

public class PayrollService {
	private static List<Employee> employees=new LinkedList<>();
	private static List<Paycheck> paychecks=new LinkedList<>();
	
	public static List<Employee> getAllEmployees(){
		return employees;	
	}
	public static void savePackcheck(Paycheck paycheck) {
		// TODO Auto-generated method stub
		paychecks.add(paycheck);
	}
	public Employee addHourlyEmployee(String name, String address, double hourlyRate){
 		Employee e = new Employee(name, address);	
 		e.setClassification(new HourlyClassification(hourlyRate));		
 		e.setSchedule(new WeeklySchedule());	
 		e.setPaymentMethod(new HoldMethod(name));
 		employees.add(e);	
 		return e;		
 	}
 	
 	public Employee addSalariedEmployee(String name, String address, double salary){
 		Employee e = new Employee(name, address);		
 		e.setClassification(new SalariedClassification(salary));		
 		e.setSchedule(new MonthlySchedule());	
 		e.setPaymentMethod(new HoldMethod(name));
 		employees.add(e);	
 		return e;	
 	}
 	
 	public Employee addCommissionedEmployee(String name, String address, double salary, double saleRate){
 		Employee e = new Employee(name, address);		
 		e.setClassification(new CommissionedClassification(salary, saleRate));		
 		e.setSchedule(new BiweeklySchedule());		
 		e.setPaymentMethod(new HoldMethod(name));
 		employees.add(e);		
 		return e;	
 	}
}
