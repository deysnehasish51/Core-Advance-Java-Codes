package com.nit.constructor;

public class Car {
	String brandName;
	String model;
	int builtYear;
	String expectedPrice;
	
//	public Car() {
//		brandName="Tata";
//		builtYear=2025;
//		model="Punch";
//		expectedPrice="Not Decided";
//	}
	
	public Car()
	{
		brandName="Tata";
		builtYear=20025;
		model="Safari";
		expectedPrice="Not Defined";
	}
	public void displayDetails()
	{
		System.out.println("Car Details : ");
		System.out.println("Brand Name: "+brandName);
		System.out.println("Model : "+model);
		System.out.println("Built Year : "+builtYear);
		System.out.println("Price : "+expectedPrice);
	}
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.displayDetails();
		
		Car c2 = new Car();
		c2.displayDetails();
		
	}

}
