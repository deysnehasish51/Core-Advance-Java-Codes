package com.nit.functionalprogramming;

import java.util.function.Predicate;

class User{
	String name;
	boolean isPremium;
	double purchaseAmount;
	public User(String name, boolean isPremium, double purchaseAmount) {
		this.name = name;
		this.isPremium = isPremium;
		this.purchaseAmount = purchaseAmount;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isPremium() {
		return isPremium;
	}
	
	public double getPurchaseAmount() {
		return purchaseAmount;
	}
		
}
public class EcommercePlatform {

	public static void main(String[] args) {
		
		User[] users = {
				new User("Grace", true, 9000),
				new User("Henry", false, 15000),
				new User("Ivy", false, 7000)
				};
		
		Predicate<User> isPremium = (user)->{if(user.isPremium()==true) return true;else return false;};
		Predicate<User> highSpender = (user1)->{if(user1.getPurchaseAmount()>10000) return true;else return false;};
		
		Predicate<User> isEligible =isPremium.or(highSpender);
		
		System.out.println("User Eligible for Discount: ");
		for(int i=0;i<users.length;i++)
		{
			if(isEligible.test(users[i]))
			{
				System.out.println(users[i].getName());
			}
		}
	}

}
