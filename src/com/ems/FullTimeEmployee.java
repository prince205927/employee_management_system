package com.ems;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee (String name, String department, double salary) {
		super(name, department, salary);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("I am a full time employee");
		super.displayInfo();
	}
}
