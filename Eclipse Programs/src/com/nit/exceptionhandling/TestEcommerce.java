package com.nit.exceptionhandling;

import java.util.Scanner;

class OutOfStockException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfStockException(String message) {
		super(message);
	}
}

class ECommerce{
	int stock;
	int quantity;
	
	public ECommerce(int stock,int quantity) {
		this.stock=stock;
		this.quantity=quantity;
	}
	
	public void availableStock(int stock,int quantity) throws OutOfStockException{
		if(quantity>stock)
		{
			throw new OutOfStockException("Product Not Available.");
		}
		else {
			System.out.println("Product is Available you can proceed further for order.");
		}
	}
}
public class TestEcommerce {

	public static void main(String[] args) {
		
		try(Scanner scanner =  new Scanner(System.in)){
			
			System.out.println("Enter the Stock: ");
			int stock=scanner.nextInt();
			System.out.println("Enter the Quantity: ");
			int quantity= scanner.nextInt();
			
			ECommerce eCommerce = new ECommerce(stock, quantity);
			try {
				eCommerce.availableStock(stock, quantity);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
