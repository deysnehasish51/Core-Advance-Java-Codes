/*WAP to create  Vehicle describe as below:
 *Data Members : vehicleNo,model,type(car/bike),price,insuranceAmount
 Methods :
 Accept the vehicle details
 display the vehicle details
 Calculate the insurance amount as:
 8% of price for cars
 5% of price for bikes*/
package com.nit.userdefinedmethods;

import java.util.Scanner;

public class VehicleShowroom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehicle v1= new Vehicle();
		
		System.out.println("Enter the Vehicle No :");
		String vehicleNo=sc.nextLine();
		System.out.println("Enter the Type :");
		String type=sc.nextLine();
		System.out.println("Enter the Model :");
		String model=sc.nextLine();
		System.out.println("Enter the Vehicle Price :");
		double price=sc.nextDouble();
		
		v1.setData(vehicleNo, model, type, price);
		v1.claculateInsurance();
		v1.displayData();
		
		sc.close();
	}
}

class Vehicle
{
	String vehicleNo;
	String model;
	String type;
	double price;
	double insuranceAmount;
	
	public void setData(String vehicleNo,String model,String type,double price )
	{
		this.vehicleNo=vehicleNo;
		this.model=model;
		this.type=type;
		this.price=price;	
	}
	public void claculateInsurance()
	{
		if(type.equalsIgnoreCase("bike"))
		{
			insuranceAmount=price*0.05;
		}
		else if(type.equalsIgnoreCase("car"))
		{
			insuranceAmount=price*0.08;
		}
		else
		{
			System.out.println("Invalid Type.");
		}
	}
	public void displayData()
	{
		System.out.println("Vehicle Number : "+vehicleNo);
		System.out.println("Model: "+model);
		System.out.println("Type: "+type);
		System.out.println("Price "+price);
		System.out.println("Insurance Amount : "+insuranceAmount);
	}
}