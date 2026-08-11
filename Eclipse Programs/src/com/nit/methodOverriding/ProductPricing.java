package com.nit.methodOverriding;

import java.util.Scanner;

class Product{
	double price;
	
	public Product(double price) {
		if(price>0)
		{
			this.price=price;
		}
	}
	public double calculatePrice()
	{
		System.out.println("Price Before Discount: "+price);
		return price;
	}
}
class Electronic extends Product{
	public Electronic(double price) {
		super(price);
	}
	@Override
	public double calculatePrice()
	{
		System.out.println("Electronic Price Before Discount: "+price);
		return price-(price*0.10);
	}
}
class Furniture extends Product{
	public Furniture(double price) {
		super(price);
	}
	@Override
	public double calculatePrice()
	{
		System.out.println("Furniture Price Before Discount: "+price);
		return price-(price*0.15);
	}
}
public class ProductPricing {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Electronic Price: ");
	double priceElectronic = scanner.nextDouble();
	Electronic electronic = new Electronic(priceElectronic);
	System.out.println(electronic.calculatePrice());
	System.out.println("Enter Furniture Price: ");
	double priceFurniture = scanner.nextDouble();
	Furniture furniture = new Furniture(priceFurniture);
	System.out.println(furniture.calculatePrice());
	scanner.close();
	}

}
