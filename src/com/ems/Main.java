package com.ems;

import java.util.List;

public class Main {
	public static void main(String args[]) {
			EmployeeManager manager = new EmployeeManager();
			Employee e1 = new FullTimeEmployee("ABC", "XYZ", 70000);
			Employee e2 = new PartTimeEmployee("MNO", "PQR", 60000,9);
			System.out.println("Hello I am "+ e1.getName() + " and I earn"+ e1.calculateSalary()); 
			System.out.println("Hello I am "+ e2.getName() + " and I earn"+ e2.calculateSalary()); 

	}  
	}