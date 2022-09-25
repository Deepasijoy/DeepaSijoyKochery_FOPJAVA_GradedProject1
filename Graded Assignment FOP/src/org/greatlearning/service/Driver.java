package org.greatlearning.service;

import org.greatlearning.model.AdminDepartment;
import org.greatlearning.model.HrDepartment;
import org.greatlearning.model.SuperDepartment;
import org.greatlearning.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperDepartment sd=new AdminDepartment();

System.out.println("Welcome to "+ sd.departmentName());
System.out.println(sd.getTodaysWork());
System.out.println(sd.getWorkDeadline());
System.out.println(sd.isTodayAHoliday());
System.out.println();

HrDepartment sd1=new HrDepartment();
System.out.println("Welcome to "+ sd1.departmentName());
System.out.println(sd1.doActivity());
System.out.println(sd1.getTodaysWork());
System.out.println(sd1.getWorkDeadline());
System.out.println(sd1.isTodayAHoliday());
System.out.println();

TechDepartment sd2=new TechDepartment();
System.out.println("Welcome to "+ sd2.departmentName());
System.out.println(sd2.getTodaysWork());
System.out.println(sd2.getWorkDeadline());
System.out.println(sd2.getStackInformantion());
System.out.println(sd2.isTodayAHoliday());
	}

}
