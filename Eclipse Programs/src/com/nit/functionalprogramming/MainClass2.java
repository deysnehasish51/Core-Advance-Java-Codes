package com.nit.functionalprogramming;

import java.util.function.Predicate;

/*
 * An employee in eligible for promotion if he/she has an experience 
 * of minimum 5 years. Solve this using Predicate.
 */

class Employee
{
	String name,designation;
	int age,id,exp;

	public Employee(String name, String designation, int age, int id, int exp) {
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.id = id;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString()
	{
		return "Name: "+name+"\nAge: "+age+"\nID: "+id+"\nExperience: "+exp+"\nDesignation: "+designation+ "\nYou are eligible for the Promotion.";
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Snehasish", "Software Developer", 23, 101, 6);
		
		Predicate<Employee> predicate = (emp)->{if(emp.getExp()>=5) return true; else return false;};
		
		if(predicate.test(employee))
		{
			System.out.println(employee);
		}
		else {
			System.err.println("You are not eligible for the Promotion.");
		}

	}

}
