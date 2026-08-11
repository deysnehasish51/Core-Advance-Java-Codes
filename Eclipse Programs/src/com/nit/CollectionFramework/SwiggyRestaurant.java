package com.nit.CollectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SwiggyRestaurant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of restaurants: ");
		int n=Integer.parseInt(scanner.nextLine());
		
		ArrayList<Swiggy> list = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter details for restaurants: "+ i);
			System.out.println("Enter Restaurant ID: ");
			int id=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter the Restaurant Name: ");
			String restaurantName = scanner.nextLine();
			System.out.println("Enter Rating (0.0 to 0.5) : ");
			double rating=Double.parseDouble(scanner.nextLine());
			System.out.println("Enter Delivery Time (in minutes): ");
			int time =Integer.parseInt(scanner.nextLine());
			Swiggy s = new Swiggy(id, restaurantName,rating,time);
			list.add(s);
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		scanner.close();
	}

}

class Swiggy implements Comparable<Swiggy>{
	private int id;
	private String name;
	private double rating;
	private int time;
	
	
	public Swiggy(int id, String name, double rating, int time) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.time = time;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public int compareTo(Swiggy o) {
		
		if(o.getRating()==this.getRating()) {
			return this.getTime()-o.getTime();
		}
		else {
		return (int)(o.getRating()-this.getRating());
		}
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", rating=" + rating + ", time=" + time + "\n";
	}
	
	
	
	
	
}