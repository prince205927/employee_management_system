package com.ems;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
			EmployeeManager manager = new EmployeeManager();
			Scanner scan = new Scanner(System.in);
			
			while (true) {
				System.out.println("====Employee Management System=====");
				System.out.println("1. Add Employees");
				System.out.println("2. View Employees");
				System.out.println("3. Update Employees");
				System.out.println("4. Delete Employees");
				System.out.println("5. Calculate Salary");
				System.out.println("6. Exit");
				int choice = scan.nextInt();
				scan.nextLine();
				
				switch(choice) {
				
				case 1 :
					System.out.println("Enter name of employee");
					String newName = scan.next();
					System.out.println("Enter working department name");
					String newDepartment = scan.next();
					System.out.println("Enter salary of employee");
					Double newSalary = scan.nextDouble();
					scan.nextLine();
					Employee e1 = new Employee(newName, newDepartment, newSalary);
					manager.addEmployee(e1);
					break;
					
				case 2 : 
					List<Employee> list = manager.getAllEmployees();
					for(Employee e : list) {
						e.displayInfo();
					}
					break;
					
				case 3: 
					System.out.println("Enter ID to update");
					int cid = scan.nextInt();
					System.out.println("Enter new name");
					String nName = scan.next();
					System.out.println("Enter new department");
					String nDepartment = scan.next();
					System.out.println("Enter new salary");
					Double nSalary = scan.nextDouble();
					Employee ne = new Employee(nName, nDepartment, nSalary);
					ne.setId(cid);
					manager.updateEmployee(ne);
					break;
					
				case 4: 
					System.out.println("Enter ID of employee to be deleted");
					int did = scan.nextInt();
					manager.deleteEmployee(did);
					break;
					
				case 5 : 
					System.out.println("Enter ID of employee to get salary of ");
					int eid = scan.nextInt();
					Employee eData = manager.getEmployeeById(eid);
					Employee emp = new PartTimeEmployee(eData.getName(),eData.getDepartment(), eData.getSalary(), 9);
					System.out.println("As a part time employee my salary is Rs. "  + emp.calculateSalary());
					break;
					
				case 6 : 
					System.out.println("Exiting.....");
					scan.close();
					System.exit(0);
					break;
				default: 
					System.out.println("Choose the valid option");
				}
			}
	}  
	}