package com.nit.methodOverriding;

import java.util.Scanner;

class MainProduct{
	
	public void showDetails()
	{
		System.out.println("Generic Product");
	}
}
class Grocery extends MainProduct{
	String expairyDate;
	
	public Grocery(String expairyDate) {
		super();
		this.expairyDate = expairyDate;
	}

	@Override
	public void showDetails()
	{
		System.out.println("Grocery Product: Expiry Date : "+expairyDate);
	}
}
class Clothing extends MainProduct{
	String size;
	
	public Clothing(String size) {
		this.size = size;
	}

	@Override
	public void showDetails()
	{
		System.out.println("Clothing Product: Size : "+size);
	}
}

public class ProductDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Expiry Date: ");
		String expiaryDate =scanner.nextLine();
		System.out.println("Enter the Cloth Size  : ");
		String size =scanner.nextLine();
		
		Grocery grocery = new Grocery(expiaryDate);
		Clothing clothing = new Clothing(size);
		grocery.showDetails();
		clothing.showDetails();
		MainProduct[] products = {new Grocery(expiaryDate),new Clothing(size)};
		
		for(MainProduct p: products)
		{
			p.showDetails();
		}
		scanner.close();
	}

}
