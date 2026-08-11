package com.nit.multithreading;

class BankAccount{
	private long accNo;
	private String accHolderName;
	private double accBalance;
	public BankAccount(long accNo, String accHolderName, double accBalance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	
	public synchronized void deposite(double amount) {
		accBalance+=amount;
		System.out.println("After deposite of "+amount+ "the Balance : "+accBalance);
	}
	
	public synchronized void withdraw(double amount) {
		if(amount<=accBalance) {
			accBalance-=amount;
			System.out.println("After withdrawing "+amount+" , Availabe balance : "+accBalance);
		}
		else {
			System.out.println("Insufficient Balance! Try again.");
		}
	}
	
	public synchronized void checkBalance() {
		System.out.println("Balance: "+accBalance);
	}
}

class CustomThread1 extends Thread{
	BankAccount bankAccount;
	double amount;
	public CustomThread1(BankAccount bankAccount, double amount) {
		super();
		this.bankAccount = bankAccount;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		bankAccount.deposite(amount);
		System.out.println(Thread.currentThread().getName()+"after deposite of "+amount+"availabe balance : "+bankAccount.getAccBalance());
	}
		
}

class CustomThread2 extends Thread{
	BankAccount bankAccount;
	double amount;
	public CustomThread2(BankAccount bankAccount, double amount) {
		super();
		this.bankAccount = bankAccount;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		bankAccount.deposite(amount);
		System.out.println(Thread.currentThread().getName()+" after deposite of "+amount+"availabe balance : "+bankAccount.getAccBalance());
	}
	
	
}
class CustomThread3 extends Thread{
	BankAccount bankAccount;
	double amount;
	public CustomThread3(BankAccount bankAccount, double amount) {
		super();
		this.bankAccount = bankAccount;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		bankAccount.deposite(amount);
		System.out.println(Thread.currentThread().getName()+"after deposite of "+amount+"availabe balance : "+bankAccount.getAccBalance());
	}
	
	
}
public class BankManagementSystem {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(75648574473847746L, "Snehasish Dey", 30000);
		BankAccount account2 = new BankAccount(756485744733447746L, "Bibhujeet Samal", 100000);
		BankAccount account3 = new BankAccount(756480004473837746L, "Sritam Maharana", 80000);
		
		account1.checkBalance();
		account2.checkBalance();
		account3.checkBalance();
		
		CustomThread1 counter1 = new CustomThread1(account1, 5000);
		CustomThread2 counter2 = new CustomThread2(account2, 5000);
		CustomThread3 counter3 = new CustomThread3(account3, 5000);
		
		try {
			counter1.start();
			counter1.join(1000);
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			counter2.start();
			counter2.join(1000);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			counter3.start();
			counter3.join();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance of all Users: ");
		account1.checkBalance();
		account2.checkBalance();
		account3.checkBalance();
	}

}
