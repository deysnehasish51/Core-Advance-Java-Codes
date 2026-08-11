package com.nit.inheritance;
//wrong way donot use this type of coding methods and ways
//never create super class object
import java.util.Scanner;

class Employee{
	String empName;
	Employee(String empName) {
		this.empName=empName;
	}

}
class Manager extends Employee{
	String department;
	
	public Manager(String empName,String department) {
		super(empName);
		this.department=department;
	}
	@Override
	public String toString()
	{
		System.out.println("Manager Details : ");
		return "Name : "+empName+"\nDepartment : "+department+"\n";
	}
		
}

public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Manager Name: ");
		String name=sc.nextLine();

		
		System.out.println("Enter the Manager Department : ");
		String department=sc.nextLine();
		
		Manager m1 = new Manager(name, department);

		System.out.println(m1);
		sc.close();

	}

}
