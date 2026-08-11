package com.nit.methodOverriding;

//import java.util.Scanner;

class Employee{
	String role;
	int salary;	
	
	public Employee(String role, int salary) {
		this.role = role;
		this.salary = salary;
	}

	public void getDetails()
	{
		System.out.println("Role: Employee, Salary: 0");
	}
}
class Manager extends Employee{
	public Manager(String role, int salary) {
		super(role, salary);
	}
	@Override
	public void getDetails()
	{
		System.out.println("Role: "+role+", Salary: "+salary);
	}
}
class Developer extends Employee{
	
	public Developer(String role, int salary) {
		super(role, salary);
	}
	@Override
	public void getDetails()
	{
		System.out.println("Role: "+role+", Salary: "+salary);
	}
}
class Tester extends Employee{
	
	public Tester(String role, int salary) {
		super(role, salary);
	}
	@Override
	public void getDetails()
	{
		System.out.println("Role: "+role+", Salary: "+salary);
	}
}
public class EmployeeRoles {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Manager m1 = new Manager("Manager", 80000);
		Developer d1 = new Developer("Developer", 60000);
		Tester t1 = new Tester("Tester", 50000);
		m1.getDetails();
		d1.getDetails();
		t1.getDetails();
		
		System.out.println();
//		System.out.println("Enter the Role : ");
//		String role=sc.nextLine();
//		System.out.println("Enter the Salary: ");
//		int salary=Integer.parseInt(sc.nextLine());
		
		Employee[] employee= {new Manager("Manager", 80000),new Developer("Developer", 60000),new Tester("Tester", 50000)};
		
		for(Employee e:employee)
		{
			e.getDetails();
		}

	}

}
