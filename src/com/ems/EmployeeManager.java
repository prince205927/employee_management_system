package com.ems;
import java.sql.*;
import java.util.*;

public class EmployeeManager {
	public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employees(name, department, salary) VALUES(?, ?, ?)";
        try (Connection conn = DatabaseHelper.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, emp.getName());
            pstmt.setString(2, emp.getDepartment());
            pstmt.setDouble(3, emp.getSalary());
            pstmt.executeUpdate();
            System.out.println("Employee added!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";
        try (Connection conn = DatabaseHelper.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Employee e = new Employee(rs.getString("name"),
                                          rs.getString("department"),
                                          rs.getDouble("salary"));
                e.setId(rs.getInt("id"));
                employees.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return employees;
    }
	
	public void updateEmployee(Employee emp) {
	    String sql = "UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?";
	    try (Connection conn = DatabaseHelper.connect();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, emp.getName());
	        pstmt.setString(2, emp.getDepartment());
	        pstmt.setDouble(3, emp.getSalary());
	        pstmt.setInt(4, emp.getId());
	        int rows = pstmt.executeUpdate();
	        if (rows > 0)
	            System.out.println("Employee updated successfully!");
	        else
	            System.out.println("Employee not found!");
	    } catch (SQLException e) {
	        System.out.println("Update failed: " + e.getMessage());
	    }
	}
	
	public void deleteEmployee(int id) {
	    String sql = "DELETE FROM employees WHERE id = ?";
	    try (Connection conn = DatabaseHelper.connect();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, id);
	        int rows = pstmt.executeUpdate();
	        if (rows > 0)
	            System.out.println("Employee deleted successfully!");
	        else
	            System.out.println("Employee not found!");
	    } catch (SQLException e) {
	        System.out.println("Delete failed: " + e.getMessage());
	    }
 
	}
}
