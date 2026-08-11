package com.nit.javalabtasks;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Loan l1 = new Loan();
		
		System.out.println("Enetr Loan Amount : ");
		double loanAmount=sc.nextDouble();
		
		System.out.println("Enter Annual Interest Rate (%) : ");
		double interestRate=sc.nextDouble();
		
		System.out.println("Enter number of months : ");
		int months=sc.nextInt();
		
		l1.setLoanAmount(loanAmount);
		l1.setInterestRate(interestRate);
		l1.calculateEMI(months);
		l1.displayDetails();
		
		sc.close();
	}
}

class Loan
{
	private double loanAmount;
	private double interestRate;
	int months;
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		if(loanAmount>0)
		{
		this.loanAmount = loanAmount;
		}
		else 
		{
			System.out.println("Loan Amount Must be Positive.");
		}
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		if(interestRate>0)
		{
		this.interestRate = interestRate;
		}
		else 
		{
			System.out.println("Interest Rate must be Positive.");
		}
	}
	
	public double calculateEMI(int months)
	{
		this.months=months;
		double monthlyInterestRate= interestRate/12/100;
		double numerator = loanAmount*monthlyInterestRate*Math.pow(1+monthlyInterestRate,months);
		double denominator = Math.pow(1+monthlyInterestRate,months)-1;
		double emi = numerator/denominator;
		return emi;
	}
	
	public void displayDetails()
	{
		System.out.println("Loan Details : ");
		System.out.println("Loan Amount : "+getLoanAmount());
		System.out.println("Annual Interest Rate : "+getInterestRate()+"%");
		System.out.println("Number of Months : "+months);
		System.out.println("Monthly EMI : "+calculateEMI(months));
	}
}