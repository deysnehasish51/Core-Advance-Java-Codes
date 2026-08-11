package com.nit.javalabtasks;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LoanVerifier c1 = new LoanVerifier();
		System.out.println("Enter the Credit Score");
		int creditScore=sc.nextInt();
		System.out.println("Enter the Salary : ");
		int salary = sc.nextInt();
		System.out.println("Enter the Age : ");
		
		int age =sc.nextInt();
		
		c1.setData(creditScore, salary, age);
		c1.isEligibleForLoan();
		sc.close();
		
	}

}

class LoanVerifier
{
	int creditScore;
	int salary;
	int age;
	
	public void setData(int creditScore,int salary,int age)
	{
		this.creditScore=creditScore;
		this.salary=salary;
		this.age=age;
	}
	
	public void isEligibleForLoan()
	{
		if(this.creditScore>=750&&this.salary>=50000&&this.age>=21&&this.age<=60)
		{
			System.out.println("Eligible.");
		}
		else
		{
			if(this.creditScore<750)
			{
				System.out.println("Not Eligible ! Low Credit Score.");
			}
			else if(this.age<21&&this.age>21)
			{
				System.out.println("Not Eligible ! Invalid Age.");
			}
			else
			{
				System.out.println("Not Eligible ! Insufficient Salary.");
			}
		}
	}
}