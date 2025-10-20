package com.ems;

import java.util.List;

public class Main {
	public static void main(String args[]) {
			EmployeeManager manager = new EmployeeManager();
			Employee e1 = manager.getAllEmployees().get(0);
			e1.setDepartment("Analytics");
			manager.updateEmployee(e1);
			e1.displayInfo();
//	        List<Employee> employees = manager.getAllEmployees();
//	        for (Employee e : employees) {
//	            e.displayInfo();
//	        }      
	}  
	}
