package com.nit.javalabtasks;

import java.util.Scanner;

public class CarMileageTracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Car c1 = new Car();
		
		System.out.println("Enter the Car Model: ");
		String model=scanner.nextLine();
		System.out.println("Enter the mileage: ");
		double mileage= scanner.nextDouble();
		
		c1.setModel(model);
		c1.setMileage(mileage);
		
		c1.dispalyDetails();
		scanner.close();
	}

}

class Car
{
	private String model;
	private double mileage;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		if(mileage>0)
		{
		this.mileage = mileage;
		}
		else {
			System.out.println("Invalid Mileage");
			this.mileage=0.0;
		}
	}
	
	public void dispalyDetails()
	{
		System.out.println("Car Details : ");
		System.out.println("Molel : "+getModel());
		System.out.println("Mileage: "+getMileage());
	}
	
	
}