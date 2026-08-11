package com.nit.Swiggy;


public class User {

	private int userId;
	private String name;
	private String deliveryAddress;

	public User(int userId, String name, String deliveryAddress) {
		super();
		this.userId = userId;
		this.name = name;
		this.deliveryAddress = deliveryAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	
	public void addUser(User user) {
		
	}
	
	public void switchUser(int userId) {
		
	}
	
	
	
	

}
