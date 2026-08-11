package com.nit.javalabtasks;

import java.util.Scanner;

public class MobliRechargeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Mobile m1 = new Mobile();
		
		System.out.println("Enter The Amount : ");
		double amount= sc.nextDouble();
		
		m1.recharge(amount);
		m1.displayBalance();
		
		sc.close();

	}

}

class Mobile
{
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	
	public void recharge(double amount)
	{
		if(amount>0)
		{
			this.balance+=amount;
			System.out.println("Recharge of "+amount+" Successful");
		}
		else {
			System.out.println("Enter Valid Amount ");
		}
	}
	
	public void displayBalance()
	{
		System.out.println("Current Balance : "+getBalance());
	}
	
}