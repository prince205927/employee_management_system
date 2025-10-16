package com.ems;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	public PartTimeEmployee (String name, String department, double salary, int hoursWorked)
	{
		super(name, department, salary);
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("I am a part time employee and I have worked for" + hoursWorked + "hours");
		super.displayInfo();
	}
}
