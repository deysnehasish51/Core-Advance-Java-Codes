package com.nit.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.OptionalDouble;

public class EmployeeManagement {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Arjun", 26, 61000, "IT"));
		employees.add(new Employee("Pooja", 24, 42000, "HR"));
		employees.add(new Employee("Nikhil", 28, 73000, "AI"));
		employees.add(new Employee("Simran", 25, 46000, "QA"));
		employees.add(new Employee("Manish", 30, 95000, "Management"));
		employees.add(new Employee("Kritika", 27, 58000, "IT"));
		employees.add(new Employee("Deepak", 29, 61000, "AI"));
		employees.add(new Employee("Ritika", 23, 39000, "HR"));
		employees.add(new Employee("Harsh", 31, 99000, "Management"));
		employees.add(new Employee("Tanvi", 26, 52000, "QA"));
		employees.add(new Employee("Gaurav", 28, 61000, "IT"));
		employees.add(new Employee("Ishita", 24, 48000, "HR"));
		employees.add(new Employee("Varun", 27, 75000, "AI"));
		employees.add(new Employee("Divya", 25, 53000, "QA"));
		employees.add(new Employee("Sanjay", 32, 105000, "Management"));
		employees.add(new Employee("Ayesha", 26, 56000, "IT"));
		employees.add(new Employee("Rakesh", 29, 72000, "AI"));
		employees.add(new Employee("Shalini", 23, 41000, "HR"));
		employees.add(new Employee("Aditya", 28, 68000, "IT"));
		employees.add(new Employee("Komal", 24, 45000, "QA"));
		employees.add(new Employee("Vikram", 33, 110000, "Management"));
		employees.add(new Employee("Nisha", 27, 59000, "AI"));
		employees.add(new Employee("Mohit", 26, 61000, "IT"));
		employees.add(new Employee("Preeti", 25, 47000, "HR"));
		employees.add(new Employee("Ankit", 30, 87000, "Management"));
		//print 
//		employees.stream().filter(obj->obj.getDepartment().equals("IT")).forEach(System.out::println);
//		
//		//print only the employee names using map method
//		
//		employees.stream().map(Employee::getName).forEach(System.out::println);
//		
//		//print the total salary pay out
//		
//		int sum=employees.stream().mapToInt(obj->(int)obj.getSalary()).sum();
//		System.out.println("Total Salary: "+sum);
//		//employees.clear();
//		double average=employees.stream().mapToDouble(obj->obj.getSalary()).average().orElse(0);
//		//OptionalDouble average=employees.stream().mapToDouble(obj->obj.getSalary()).average();
//		System.out.println("Average Salary: "+average);
//		
//		List<List<String>> skills= List.of(List.of("java","spring"),List.of("python","django"));
//		
//		skills.stream().flatMap(List::stream).forEach(System.out::println);
//		
//		employees.stream().map(Employee::getSalary).distinct().forEach(System.out::println);
	
//		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
//		employees.stream().skip(10).forEach(System.out::println);
		
		
		System.out.println("Youngest Employee: "+employees.stream().min(Comparator.comparing(Employee::getAge)));
		System.out.println("Youngest Employee: "+employees.stream().max(Comparator.comparing(Employee::getAge)));
		System.out.println(employees.stream().filter(obj->obj.getDepartment().equals("HR")).count());
		System.out.println(employees.stream().anyMatch(obj->obj.getSalary()>100000));
		
	}

}

class Employee{
	private String name;
	private int age;
	private double salary;
	private String department;
	
	public Employee(String name, int age, double salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "\n";
	}
	
	
	 
	
}
