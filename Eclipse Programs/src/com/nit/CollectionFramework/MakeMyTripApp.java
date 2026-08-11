package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MakeMyTripApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of flights: ");
		
		int n=Integer.parseInt(scanner.nextLine());
		
		ArrayList<MakeMyTrip> list = new ArrayList<MakeMyTrip>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter details for Flight "+ i);
			System.out.println("Enetr Flight Number: ");
			String number=scanner.nextLine();
			System.out.println("Enter the Source City: ");
			String source=scanner.nextLine();
			System.out.println("Enter the Destination City: ");
			String destination=scanner.nextLine();
			System.out.println("Enter Ticket Price: ");
			double price=Double.parseDouble(scanner.nextLine());
			System.out.println("Enter Duration (in minutes): ");
			int time=Integer.parseInt(scanner.nextLine());
			MakeMyTrip trip = new MakeMyTrip(number, source, destination, price, time);
			list.add(trip);
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		scanner.close();
	}

}

class MakeMyTrip implements Comparable<MakeMyTrip>{
	private String flightNo;
	private String source;
	private String destination;
	private double price;
	private int time;
	
	public MakeMyTrip(String flightNo, String source, String destination, double price, int time) {
		super();
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.time = time;
	}
	
	
	
	public String getFlightNo() {
		return flightNo;
	}



	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "flightNo=" + flightNo + ", source=" + source + ", destination=" + destination + ", price="
				+ price + ", time=" + time + "\n";
	}


	@Override
	public int compareTo(MakeMyTrip o) {
		if(o.getPrice()==this.getPrice()) {
			return this.getTime()-o.getTime();
		}
		else {
			return (int)(o.getPrice()-this.getPrice());
		}
	}
	
	
}