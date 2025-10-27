## Employee Management System

A simple employee management system built in core Java in Eclipse IDE integrated with SQLite Database in order to demonstrate the OOP (Object Oriented Programming) principles. 
This project runs in the console and demonstrates all the four pillars of OOP - encapsulation, inheritance, polymorphism and abstraction and manages employee records efficiently.

## Features : 
1. Add new employees
2. View all employees
3. Update particular employee
4. Delete particular employee
5. Calculate the salary of particular employee (part time employee)
6. Persistent data storage using SQLite

## OOP concepts used : 
1. **Encapsulation**  :  All the attributes in Employee class are private and only controlled access is provided through getters and setters. This encapsulates the internal representation of the class.

2. **Inheritance** : FullTimeEmployee and PartTimeEmployee classes inherit from parent Employee class. 

3. **Polymorphism** : The method calculateSalary() is overridden in each subclass (FullTimeEmployee and PartTimeEmployee) to provide specialized salary calculation logic. When invoked through a parent reference, 
the JVM dynamically determines at runtime which version of the method to execute demonstrating runtime (dynamic) polymorphism.

4. **Abstraction** : The project uses a SalaryCalculable interface that declares the abstract method.The Employee class (and its subclasses) implement this interface, enforcing a contract 
that every employee type must define how its salary is calculated.This hides implementation details and focuses on defining what needs to be done, not how.

## Database Schema : 

**Table: employees**
| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PRIMARY KEY AUTOINCREMENT | Employee ID |
| name | TEXT | Employee Name |
| department | TEXT | Department Name |
| salary | REAL | Base Salary |

## How to run : 

1. Open project in Eclipse IDE.
2. Ensure **SQLite JDBC Driver** (`sqlite-jdbc.jar`) is added to classpath.  
3. Run `Main.java`.
4. Use menu options to manage employees.
