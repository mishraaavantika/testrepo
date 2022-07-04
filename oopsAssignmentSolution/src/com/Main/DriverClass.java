package com.Main;
import com.Department.AdminDepartment.AdminDepartment;
import com.Department.HrDepartment.HrDepartment;
import com.Department.TechDepartment.TechDepartment;

public class DriverClass {
	public static void main(String[] args) {
		HrDepartment hrdept = new HrDepartment();
		TechDepartment tdept = new TechDepartment();
		AdminDepartment addept = new AdminDepartment();

		System.out.println(" Welcome to " + addept.departmentName());
		System.out.println(addept.getTodaysWork());
		System.out.println(addept.getWorkDeadline());
		System.out.println(addept.isTodayAHoliday());

		System.out.println();

		System.out.println(" Welcome to " + hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());

		System.out.println();

		System.out.println(" Welcome to " + tdept.departmentName());
		System.out.println(tdept.getTodaysWork());
		System.out.println(tdept.getWorkDeadline());
		System.out.println(tdept.getTechStackInformation());
		System.out.println(tdept.isTodayAHoliday());
	}

}
