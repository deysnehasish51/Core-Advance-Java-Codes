package com.nit.javalabtasks;

import java.util.Scanner;

public class Swiggy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Coupon c1 = new Coupon();
		
		
		System.out.println("Enter the Total Amount : ");
		int totalAmount=sc.nextInt();
		c1.setData(totalAmount);
		c1.applyCoupon();

		sc.close();
	}

}

class Coupon
{
	public static final String COUPON_CODE="SWIGGY20";
	int totalAmount;
	boolean isLoggedIn=true;
	boolean isValidCoupon=true;
	
	public void setData(int totalAmount)
	{
		this.totalAmount=totalAmount;
	}
	
	public void applyCoupon()
	{
		if(isLoggedIn==true)
		{
		if(this.totalAmount>200&&isValidCoupon==true&&COUPON_CODE.equals("SWIGGY20"))
		{
			System.out.println("Coupon Applied.");
		}
		else
		{
			System.out.println("Not Eligible.");
		}
		}
		else
		{
			System.out.println("Login First ");
		}
		
	}
	
}
