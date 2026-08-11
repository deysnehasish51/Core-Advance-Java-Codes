package com.nit.inheritance;

import java.util.Scanner;

class Ride{
	protected String customerName;
	protected String rideId;
	protected double distanceKm;
	public static final String APP_NAME ="Rapido";
	
	public Ride(String customerName, String rideId, double distanceKm) {
		
		setCustomerName(customerName);
		setRideId(rideId);
		setDistanceKm(distanceKm);
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		if(!customerName.isEmpty())
		{
		this.customerName = customerName;
		}
		else {
			System.out.println("Customer Name Should Not be Empty!");
		}
	}

	public String getRideId() {
		return rideId;
	}

	public void setRideId(String rideId) {
		if(!rideId.isEmpty())
		{
		this.rideId = rideId;
		}
		else {
			System.out.println("Ride Id Can not be Empty!");
		}
	}

	public double getDistanceKm() {
		return distanceKm;
	}

	public void setDistanceKm(double distanceKm) {
		if(distanceKm>0)
		{
		this.distanceKm = distanceKm;
		}
		else {
			System.out.println("Invalid Distance!");
		}
	}

	public void calculateFare()
	{
		System.out.println("Your Ride Price is  Total: ");
	}
	
	public void displayRideDetails()
	{
		System.out.println("Ride Details : ");
		System.out.println("Customer Name: "+customerName);
		System.out.println("Ride ID: "+rideId);
		System.out.println("Distance: "+distanceKm);
		System.out.println("App: "+APP_NAME);
	}
	
}
class BikeRide extends Ride{
	
	protected double costPerKm = 10.0;
	protected double finalAmount=0;
	public BikeRide(String customerName, String rideId, double distanceKm) {
		super(customerName, rideId, distanceKm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void calculateFare()
	{
		finalAmount= costPerKm*distanceKm;
	}
	
	@Override
	public void  displayRideDetails()
	{
		System.out.println("Ride Details : ");
		System.out.println("Customer Name: "+customerName);
		System.out.println("Ride ID: "+rideId);
		System.out.println("Distance: "+distanceKm);
		System.out.println("App: "+APP_NAME);
		System.out.println("Final Bike Ride Fare: Rs. "+finalAmount);
	}
	
}
class AutoRide extends Ride{
	protected double baseFare = 30.0;
	protected double costPerKm = 12.0;
	protected double finalAmount=0;
	public AutoRide(String customerName, String rideId, double distanceKm) {
		super(customerName, rideId, distanceKm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void calculateFare()
	{
		finalAmount= baseFare+(costPerKm*distanceKm);
	}
	
	@Override
	public void  displayRideDetails()
	{
		System.out.println("Ride Details : ");
		System.out.println("Customer Name: "+customerName);
		System.out.println("Ride ID: "+rideId);
		System.out.println("Distance: "+distanceKm);
		System.out.println("App: "+APP_NAME);
		System.out.println("Auto Ride Fare: Rs. "+baseFare+" + "+costPerKm*distanceKm+" = "+finalAmount);
	}
}
class PremimumBikeRide extends Ride{
	protected double costPerKm = 18.0;
	protected double convenienceFee = 25.0;
	protected double minimumDistance = 3.0;
	protected double finalAmount=0;
	public PremimumBikeRide(String customerName, String rideId, double distanceKm) {
		super(customerName, rideId, distanceKm);
	}
	
	@Override
	public void calculateFare()
	{
		finalAmount= (costPerKm*distanceKm)+convenienceFee;
	}
	
	@Override
	public void  displayRideDetails()
	{
		System.out.println("Ride Details : ");
		System.out.println("Customer Name: "+customerName);
		System.out.println("Ride ID: "+rideId);
		System.out.println("Distance: "+distanceKm);
		System.out.println("App: "+APP_NAME);
		System.out.println("Premium Bike Ride Fare: Rs. ("+costPerKm +" * "+distanceKm+") + "+convenienceFee+" = "+finalAmount);
	}
}
public class RapidoBookingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO RAPIDO");
		System.out.println("Enter the Choice for Ride Type: ");
		
		System.out.println("1. Bike Ride");
		System.out.println("2. Auto Ride");
		System.out.println("3. Premium Bike Ride");
		int choice= Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Customer Name: ");
		String customerName=sc.nextLine();
		
		System.out.println("Enter the Order ID: ");
		String orderId = sc.nextLine();
		
		System.out.println("Enter the Distance : ");
		double distanceKm=sc.nextDouble();
		switch (choice){
		case 1 ->
		{
			BikeRide bikeRide = new BikeRide(customerName, orderId, distanceKm);
			
			bikeRide.calculateFare();
			bikeRide.displayRideDetails();
			
		}
		case 2 -> 
		{
			AutoRide autoRide = new AutoRide(customerName, orderId, distanceKm);
			autoRide.calculateFare();
			autoRide.displayRideDetails();
			
		}
		case 3 -> 
		{
			if(distanceKm>=3)
			{
				PremimumBikeRide premimumBikeRide = new PremimumBikeRide(customerName, orderId, distanceKm);
				premimumBikeRide.calculateFare();
				premimumBikeRide.displayRideDetails();
			}
			else {
				System.out.println("Premium rides require a minimum distance of 3 km.");
			}
			
		}

		default->
			System.out.println("Invalid Choice ! Try Again.");
		}
		
		sc.close();
	}

}
