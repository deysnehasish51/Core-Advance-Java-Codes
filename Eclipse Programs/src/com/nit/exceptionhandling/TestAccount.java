package com.nit.exceptionhandling;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message) {
		super(message);
	}}

class Account{
	double balance;
	public Account(double balance) {
		this.balance=balance;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
			if(amount>balance&&amount>0)
			{
				throw new InsufficientFundsException("Withdraw Amount exceed amount balance");
			}
			else {
				balance = balance-amount;
				System.out.println("Withdraw successful. Remaning Balance: "+balance);
			}
	}
}
public class TestAccount {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Enter the Balance: ");
			double balance=scanner.nextDouble();
			
			Account account = new Account(balance);
			
			try {
				account.withdraw(2000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
