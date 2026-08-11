package com.nit.Swiggy;

import java.util.Map;

public class Order {

	int orderId;
	User user;
	Restaurant restaurant;
	Map<MenuItem, Integer> items;
	
	double totalPrice;
	String status;
	public Order(int orderId, User user, Restaurant restaurant, Map<MenuItem, Integer> items, double totalPrice,
			String status) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.restaurant = restaurant;
		this.items = items;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	
	public void placeOrder(int restaurantId,String paymentMethod) {
		
	}
	
	public void viewOrderHistory() {
		
	}
	
	public void updateOrderStatus(int orderId,String status) {
		
	}
	
}
