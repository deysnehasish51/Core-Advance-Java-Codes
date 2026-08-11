package com.nit.javalabtasks;

public class Traveller {

	public static void main(String[] args) {
		
	
		Trip t1 = Trip.createItinerary("Delhi","Shimla",5);
		t1.displayDetails();
		
	}
}

class Trip
{
	private String source;
	private String destination;
	private int days;
	//Static Factory Method 
	public static Trip createItinerary(String source, String destination, int days) {
		Trip t1 = new Trip();
		if(!(source.equalsIgnoreCase(destination)))
		{
			t1.source = source;
			t1.destination = destination;
		}
		else {
			System.out.println("Source and Destination can not be Same");
		}
		if(days>0)
		{
			t1.days = days;
		}
		else {
			System.out.println("Duration can not be Zero");
		}
		
		return t1;
	}
	
	public void displayDetails()
	{
		System.out.println("Trip from "+source+" to "+destination);
		System.out.println("Duration: "+days );
	}
}