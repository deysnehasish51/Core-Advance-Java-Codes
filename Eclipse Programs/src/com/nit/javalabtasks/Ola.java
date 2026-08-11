package com.nit.javalabtasks;

import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		OlaUser  u1 = new OlaUser();
		
		System.out.println("Enter the Pick Up Location : ");
		String pickupPlace=sc.nextLine();
		System.out.println("Enter the Drop Location : ");
		String dropPlace=sc.nextLine();
		System.out.println("Enter the Estimated Ride Cost: ");
		double rideCost= sc.nextDouble();
		
		u1.setPickupPlace(pickupPlace);
		u1.setDropPlace(dropPlace);
		u1.setRideCost(rideCost);
		
		u1.printLastRide();
		
		sc.close();
	}

}

class OlaUser
{
	private String pickupPlace;
	private String dropPlace;	
	private double rideCost;

	public String getPickupPlace() {
		return pickupPlace;
	}

	public void setPickupPlace(String pickupPlace) {
		if(pickupPlace!="")
		{
		this.pickupPlace = pickupPlace;
		}
		else 
		{
			System.out.println("Enter the PickUp Place. ");
		}
	}

	public String getDropPlace() {
		return dropPlace;
	}

	public void setDropPlace(String dropPlace) {
		if(dropPlace!="")
		{
		this.dropPlace =dropPlace;
		}
		else 
		{
			System.out.println("Enter the Drop Place. ");
		}
	}

	public double getRideCost() {
		return rideCost;
	}

	public void setRideCost(double rideCost) {
		if(rideCost>0)
		{
		this.rideCost = rideCost;
		}
	}
	
	public void printLastRide()
	{
		System.out.println("Last Ride Details : ");
		System.out.println("Pick Up : "+getPickupPlace());
		System.out.println("Drop Place : "+getDropPlace());
		System.out.println("Fare: Rs. "+getRideCost());
	}
	
}