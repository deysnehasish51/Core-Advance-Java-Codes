package com.nit.payroll.jdbc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeService {

	public void insertEmployee(Employee emp) throws Exception{

		
		try(
				Connection connection = DBConnection.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("""
																INSERT INTO employee(emp_id,name,email,salary,dept)
																VALUES(?,?,?,?,?)
															""");
		){
		pstmt.setInt(1, emp.getEmpId());
		pstmt.setString(2, emp.getName());
		pstmt.setString(3, emp.getEmailId());
		pstmt.setDouble(4, emp.getSalary());
		pstmt.setString(5, emp.getDepartment());
		pstmt.executeUpdate();
		
		System.out.println("Employee Data Inserted Successfully.....");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void findByEmail(String email) throws Exception {

	    

	    try (Connection connection = DBConnection.getConnection();
	    		PreparedStatement pstmt = connection.prepareStatement("""
	            SELECT * FROM employee
	            WHERE email = ?
	            """)) {

	        pstmt.setString(1, email);

	        try (ResultSet resultSet = pstmt.executeQuery()) {

	            while (resultSet.next()) {

	                int id = resultSet.getInt("emp_id");
	                String name = resultSet.getString("name");
	                String empEmail = resultSet.getString("email");
	                double salary = resultSet.getDouble("salary");
	                String department = resultSet.getString("dept");
	                System.out.println("ID: " + id);
	                System.out.println("Name: " + name);
	                System.out.println("Email: " + empEmail);
	                System.out.println("Salary: "+ salary);
	                System.out.println("Department: "+department);
	            }
	        }
	    }catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void incrementSalary(int empId, double amount) throws Exception{

	    try (Connection connection = DBConnection.getConnection();
	    		PreparedStatement pstmt = connection.prepareStatement("""
	            UPDATE employee 
	            SET salary =salary+?
	            WHERE emp_id=?
	            """);
	    	PreparedStatement pstmtResult = connection.prepareStatement("""
	    	            SELECT * FROM employee
	    	            WHERE emp_id = ?
	    	            """);
	    		) {
	    	
	    		pstmt.setDouble(1, amount);
	    		pstmt.setInt(2, empId);
	    		
	    		pstmt.executeUpdate();
	    		System.out.println("Salary Updated Successfully...");
	    		
	    		pstmtResult.setInt(1, empId);
	    		
	    		try (ResultSet resultSet = pstmtResult.executeQuery()) {

		            while (resultSet.next()) {

		            	int id = resultSet.getInt("emp_id");
		                String name = resultSet.getString("name");
		                String empEmail = resultSet.getString("email");
		                double salary = resultSet.getDouble("salary");
		                String department = resultSet.getString("dept");
		                System.out.println("ID: " + id);
		                System.out.println("Name: " + name);
		                System.out.println("Email: " + empEmail);
		                System.out.println("Salary: "+ salary);
		                System.out.println("Department: "+department);
		            }
		        }
	        
	        }catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void findHighestSalaryEmployee() throws Exception{

	    try (	Connection connection = DBConnection.getConnection();
	    		PreparedStatement pstmt = connection.prepareStatement("""
	            SELECT * FROM employee 
	    		WHERE salary = (SELECT MAX(salary) FROM employee);
	            """);
	    		
	    		ResultSet resultSet = pstmt.executeQuery();
	    		) {


		            while (resultSet.next()) {

		                int id = resultSet.getInt("emp_id");
		                String name = resultSet.getString("name");
		                String empEmail = resultSet.getString("email");
		                double salary = resultSet.getDouble("salary");
		                String department = resultSet.getString("dept");
		                
		                System.out.println("Employee Details who have Maximum Salary:");
		                System.out.println("ID: " + id);
		                System.out.println("Name: " + name);
		                System.out.println("Email: " + empEmail);
		                System.out.println("Salary: "+ salary);
		                System.out.println("Department: "+department);
		            }

	        
	        }catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Employee> fetchEmployeeData() {

	    List<Employee> list = new ArrayList<>();

	    String sql = "SELECT emp_id, name, email, salary, dept FROM employee";

	    try (
	        Connection connection = DBConnection.getConnection();
	        PreparedStatement pstmt = connection.prepareStatement(sql);
	        ResultSet resultSet = pstmt.executeQuery();
	    ) {

	        while (resultSet.next()) {

	            Employee employee = new Employee(
	                    resultSet.getInt("emp_id"),
	                    resultSet.getString("name"),
	                    resultSet.getString("email"),
	                    resultSet.getDouble("salary"),
	                    resultSet.getString("dept")
	            );

	            list.add(employee);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return list;
	}
	
	public void findEmployeeSalaryGreaterThanValue(double amount) {
		List<Employee> list = fetchEmployeeData();
		System.out.println("Employee Whose Salary Greater Than 50000: ");
		list.stream().filter(emp->emp.getSalary()>=amount).forEach(System.out::println);
	}
	
	public void sortEmployeeSalaryOnDecending() {
		List<Employee>  list = fetchEmployeeData();
		System.out.println("Employee Salary on Decending Order");
		
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
	}
	
	public void findAverageSalary() {
		List<Employee>  list = fetchEmployeeData();
		
		double average=list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
		
		System.out.println("Average Salary: "+average);
	}
	
	public void highestSalary() {
		List<Employee>  list = fetchEmployeeData();
		
		double max=list.stream().mapToDouble(Employee::getSalary).max().orElse(0);
		
		System.out.println("Maximum Salary: "+max);
	}
	
	public void lowestSalary() {
		List<Employee>  list = fetchEmployeeData();
		
		double min=list.stream().mapToDouble(Employee::getSalary).min().orElse(0);
		
		System.out.println("Minimum Salary: "+min);
	}

}
