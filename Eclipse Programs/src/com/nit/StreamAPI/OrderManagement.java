package com.nit.StreamAPI;


import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderManagement {
public static void main(String[] args) {
	Order o1 = new Order(101,"Raj","Remote Car","Toys",1000,2,"Ameerpet",false);
	Order o2 = new Order(102,"Raj","Battery","Electronics",100,4,"Ameerpet",false);
	Order o3 = new Order(103,"Kiran","Foundation","Makeup",2000,20,"SR Nagar",false);
	Order o4 = new Order(104,"Sagar","T-Shirt","Clothing",900,1,"Panjagutta",true);
	Order o5 = new Order(105,"Shiva","PS5","Electronics",55000,1,"Jubilee Hills",true);
	
	Stream<Order> orders = Stream.of(o1,o2,o3,o4,o5);

	
//	double average=orders.collect(Collectors.averagingDouble(Order::getPrice));
//	System.out.println("Average: "+average);
//	
//	Optional<Order> costlyProduct=orders.collect(Collectors.maxBy(Comparator.comparing(Order::getPrice)));
//	System.out.println("Costliest Product: "+costlyProduct);
//	
//	Optional<Order> chepestProduct=orders.collect(Collectors.minBy(Comparator.comparing(Order::getPrice)));
//	System.out.println("Cheapest Product: "+chepestProduct);
	
	Map<Boolean, List<Order>> partitionStream=orders.collect(Collectors.partitioningBy(Order::isDelivered));
	
	System.out.println(partitionStream);
		
}
}

class Order{
	private int customerId;
	private String customerName;
	private String productName;
	private String productType;
	private int price;
	private int quantity;
	private String address;
	private boolean isDelivered;
	
	
	public Order(int customerId, String customerName, String productName, String productType, int price, int quantity,
			String address, boolean isDelivered) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.quantity = quantity;
		this.address = address;
		this.isDelivered = isDelivered;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	@Override
	public String toString() {
		return "customerId=" + customerId + "\ncustomerName=" + customerName + "\nproductName=" + productName
				+ "\nproductType=" + productType + "\nprice=" + price + "\nquantity=" + quantity + "\naddress="
				+ address + "\nisDelivered=" + isDelivered + "\n\n";
	}
	
	
}
