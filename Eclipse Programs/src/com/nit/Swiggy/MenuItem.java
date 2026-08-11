package com.nit.Swiggy;

public class MenuItem {

	private int menuId;
	private String name;
	private double price;
	
	public MenuItem(int menuId, String name, double price) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.price = price;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addMenuItem(MenuItem item, int quantity) {
		
	}
	
	public void viewCart() {
		
	}
	
	public void calculateCartTotal() {
		
	}

}
