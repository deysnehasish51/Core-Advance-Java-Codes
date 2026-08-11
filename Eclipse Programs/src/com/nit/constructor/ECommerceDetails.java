package com.nit.constructor;

import java.util.Scanner;

public class ECommerceDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double price = Double.parseDouble(sc.nextLine());
		String category=sc.nextLine();
		ECommerce e1 = new ECommerce(name,price,category);
		
		System.out.println(e1.displayDetails());
		sc.close();
	}

}

class ECommerce
{
	private String name;
	private double price;
	private String category;
	
	
	public ECommerce(String name, double price, String category) {
		if(!(name.equals("")))
		{
		this.name = name;
		}
		else {
			System.out.println("Invalid Name !");
		}
		
		if(price>0)
		{
		this.price = price;
		}
		else {
			System.out.println("Invalid Price !");
		}
		if(!(category.equals("")))
		{
		this.category = category;
		}
		else {
			System.out.println("Invalid Category !");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!(name.equals("")))
		{
		this.name = name;
		}
		else {
			System.out.println("Invalid Name !");
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0)
		{
		this.price = price;
		}
		else {
			System.out.println("Invalid Price !");
			
		}
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		if(!(category.equals("")))
		{
		this.category = category;
		}
		else {
			System.out.println("Invalid Category !");
		}
	}
	
	public String displayDetails()
	{
		if(!(name==null)&&!(category==null)&&price>0)
		{
		return "Name : "+name+"\nPrice : "+price+"\nCategory : "+category+"\n";
		}
		else {
			
			System.exit(0);
		}
		return "";
	}
	
	
}