/*
 WAP to calculate and display the total cost price and selling price of a product based on the following
 COst Price: Input by User
 Vat: 12% of the cost price
 Discount:5% of the cost price
 Selling Price: Cost Price+ Vat-discount;
  */

package com.nit.userdefinedmethods;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellingProduct p1 = new SellingProduct();
		
		System.out.println("Enter the Cost Price");
		double costPrice=sc.nextDouble();
		System.out.println("Enter the Discount in % :");
		double discount=sc.nextDouble();
		p1.setData(costPrice,discount);
		p1.calculatePrice();
		p1.displayPrice();
		
		sc.close();
	}
}

class SellingProduct
{
	double costPrice;
	public static final double VAT=12.0;
	double discount;
	double sellingPrice;
	public void setData(double costPrice,double discount)
	{
		this.costPrice=costPrice;
		this.discount=discount;
	}
	
	public void calculatePrice()
	{
		
		this.sellingPrice=(costPrice+((VAT/100.0)*costPrice))-((discount/100.0)*costPrice);
		
	}
	public void displayPrice()
	{
		System.out.println("Cost Price : "+this.costPrice);
		System.out.println("VAT : "+VAT+"%");
		System.out.println("Discount Applied : "+this.discount+"%");
		System.out.println("Selling Price : "+this.sellingPrice);
	}
}