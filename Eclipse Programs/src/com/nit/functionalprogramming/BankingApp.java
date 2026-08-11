package com.nit.functionalprogramming;

import java.util.function.Predicate;

class Customer{
	String name;
	int creditScore;
	public Customer(String name, int creditScore) {
		
		if(!name.isEmpty())
		{
		this.name = name;
		}
		else {
			System.out.println("Invalid Name");
		}
		
		if(creditScore>0)
		{
		this.creditScore = creditScore;
		}
		else {
			System.out.println("Invalid Credit Score.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	
}

public class BankingApp {

	public static void main(String[] args) {
		
		Customer[] customers = {new Customer("Alice", 720),
				new Customer("Bob", 680),
				new Customer("Carol", 750)};
		
		Predicate<Customer> p = (customer)->{if(customer.getCreditScore()>=700) return true; else return false;};
		System.out.println("Eligible Customers: ");
		for(int i=0;i<customers.length;i++)
		{
			if(p.test(customers[i]))
			{
				System.out.println(customers[i].getName());
			}
		}
		
		
		

	}

}
