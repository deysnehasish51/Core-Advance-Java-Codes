package com.nit.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
//import java.util.function.Supplier;
//import java.util.function.UnaryOperator;

class MainEmployee {
    int id;
    String name;
    String dept;
    double salary;
    int experience;

    MainEmployee(int id, String name, String dept, double salary, int experience) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.experience = experience;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
    
    
}

public class TestEmployee {

	public static void main(String[] args) {
		MainEmployee[] employees = {
			    new MainEmployee(1, "Amit", "IT", 45000, 3),
			    new MainEmployee(2, "Ravi", "HR", 30000, 2),
			    new MainEmployee(3, "Neha", "IT", 60000, 5),
			    new MainEmployee(4, "Kiran", "Finance", 52000, 4)
			};
		//Filter employees who belong to IT department and have salary > 40,000 using Predicate<Employee>.
		Predicate<MainEmployee> checkDept = (employee)->{if(employee.getDept().equals("IT")) return true;else  return false;};
		Predicate<MainEmployee> isGreater = (employee)->{if(employee.getSalary()>40000) return true;else return false;};
		
		Predicate<MainEmployee> isBelong =checkDept.and(isGreater);
		
		for(int i=0;i<employees.length;i++)
		{
			if(isBelong.test(employees[i]))
			{
				System.out.println(employees[i].getName()+" "+employees[i].getDept()+" "+employees[i].getSalary());
			}
		}
		
		//Check employees whose salary is greater than a given value (50,000) using BiPredicate<Employee, Integer>.
		BiPredicate<MainEmployee, Integer> biPredicate =(employee,vlaue)->{if(employee.getSalary()>vlaue) return true;else return false;};
		
		for(int i=0;i<employees.length;i++)
		{
			if(biPredicate.test(employees[i], 50000))
			{
				System.out.println(employees[i].getName()+" "+employees[i].getSalary());
			}
		}
		
		//Print employee name and salary using Consumer<Employee> while iterating the array.
		Consumer<MainEmployee> consumer = (employee)->{
			System.out.println(employee.getName()+" : "+employee.getSalary());
		};		
		
		for(MainEmployee e:employees)
		{
			consumer.accept(e);
		}
		
		//Supplier<MainEmployee> supplier = ()->{};
		
		//Convert each employee object into a formatted string using Function<Employee, String>.
		
		Function<MainEmployee, String> function = (employee) -> {return employee.getName()+" works in "+employee.getDept()+" with salary "+employee.getSalary();};
		
		for(MainEmployee employee : employees)
		{
			System.out.println(function.apply(employee));
		}
		
		//Extract only salaries of employees into a new array using Function<Employee, Double>.
		Function<MainEmployee, Double> salary= (employee)->{return employee.getSalary();};
		
		for(MainEmployee employee : employees)
		{
			System.out.println(salary.apply(employee));
		}
		
		//Add a bonus of 5,000 to each employee’s salary using BiFunction<Employee, Double, Employee>.
		BiFunction<MainEmployee, Double, MainEmployee> biFunction = (employee,value)->{employee.setSalary(employee.getSalary()+value); return employee;};
		
		for(MainEmployee employee :employees)
		{
			biFunction.apply(employee, 5000.0);
			System.out.println(employee.getName()+" "+employee.getSalary());
		}
		
		
		//Increase salary of each employee by 10% using UnaryOperator<Employee>.

		
	}

}
