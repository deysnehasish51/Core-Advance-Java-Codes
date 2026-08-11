package com.nit.userdefinedmethods;

import java.util.Scanner;

public class MileageTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car c1 =new Car();
		
		System.out.println("Enter Car Model : ");
		String model= sc.nextLine();
		c1.setModel(model);
		
		System.out.println("Enter the Mileage : ");
		double mileage = sc.nextDouble();
		c1.setMileage(mileage);
		
		c1.getModel();
		c1.getMileage();
		c1.displayCarDetails();
		
		sc.close();

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
		if(mileage>=0)
		{
		this.mileage = mileage;
		}
		else {
			System.err.println("Mileage can not be Negative.");
			this.mileage=0;
		}
	}
	
	public void displayCarDetails()
	{
		System.out.println("Car Details : ");
		System.out.println("Model : "+getModel());
		System.out.println("Mileage : "+getMileage()+" km/l");
	}
	
}