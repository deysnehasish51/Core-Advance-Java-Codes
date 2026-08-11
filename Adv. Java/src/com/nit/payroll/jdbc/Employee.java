package com.nit.payroll.jdbc;

public class Employee {
	int empId;
	String name;
	String emailId;
	double salary;
	String department;
	public Employee(int empId,String name, String emailId, double salary,String department) {
		this.empId=empId;
		this.name = name;
		this.emailId = emailId;
		this.salary = salary;
		this.department=department;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getEmailId() {
		return emailId;
	}
	public double getSalary() {
		return salary;
	}
	
	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", emailId=" + emailId + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	
	

}
