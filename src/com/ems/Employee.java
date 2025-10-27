package com.ems;

public class Employee implements SalaryCalculable {
	private int id;
	private String name;
	private String department;
	private double salary;
	public Employee(String name, String department, double salary) {
		this.name=name; 
		this.department = department;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary() {
		this.salary = salary;
	}
	
	@Override
	public double calculateSalary() {
		return salary;
	}
	public void displayInfo() {
		System.out.println("ID: "+id+ "|" +"Name: "+ name+ "|" + "Department: "+ department+ "|" +  "Salary: " + salary+ "|\n\n");
	}
	
}