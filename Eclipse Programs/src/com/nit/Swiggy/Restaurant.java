package com.nit.Swiggy;

public class Restaurant {

	private int restaurantId;
	private String name;
	private String cuisine;
	private double rating;
	
	public Restaurant(int restaurantId, String name, String cuisine, double rating) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.rating = rating;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public void addRestaurant(Restaurant restaurant) {
		
	}
	
	public void displayRestaurant() {
		
	}
	
	public void filterRestaurantByCuisine() {
		
	}
	
	public void  sortRestaurantsByRating() {
		
	}
	
	public void searchRestaurants(String keyword) {
		
	}
	
}
