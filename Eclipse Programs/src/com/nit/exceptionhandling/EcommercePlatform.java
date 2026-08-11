package com.nit.exceptionhandling;

import java.util.Scanner;

class InvalidCouponException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCouponException(String message) {
		super(message);
	}
}

class Myntra{
	
	String couponCode;
	String status;
	public Myntra(String couponCode,String status) {
		this.couponCode=couponCode;
		this.status = status;
	}
	
	public void checkValidity(String status) throws InvalidCouponException {
		
		if(status.equalsIgnoreCase("Valid")) {
			System.out.println("Coupon code is Valid you are eligible for Discount.");
		}
		else {
			throw new InvalidCouponException("Coupon Code "+couponCode+ " expired.");
		}
	}
}

public class EcommercePlatform {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Enter the Coupon Code: ");
			String couponCode=scanner.nextLine();
			System.out.println("Enter the Status (Valid/Expired): ");
			String status=scanner.nextLine();
			
			Myntra myntra = new Myntra(couponCode, status);
			try {
				myntra.checkValidity(status);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
