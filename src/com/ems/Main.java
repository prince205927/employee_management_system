package com.ems;

public class Main {
	public static void main(String args[]) {
		FullTimeEmployee e1 = new FullTimeEmployee("Prince", "IT", 10);
		e1.displayInfo();
		PartTimeEmployee e2 = new PartTimeEmployee("ABC", "IT", 20000, 8);
		e2.displayInfo();
	}
}
