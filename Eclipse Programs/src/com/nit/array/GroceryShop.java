package com.nit.array;

import java.util.Scanner;

public class GroceryShop {
	
	public static double totalBill(double[] price)
	{
		double sum=0;
		for(double n:price)
		{
			sum+=n;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no of Items in grocery : ");
		int noOfItem=scanner.nextInt();
		
		double[] price = new double[noOfItem];
		
		System.out.println("Enter the Prices of "+noOfItem+ " items : ");
		for(int i=0;i<noOfItem;i++)
		{
			price[i]=scanner.nextDouble();
		}
		
		System.out.println("Total Grocery Price : "+totalBill(price));
		scanner.close();
	}

}
