package com.nit.inheritance;

import java.util.Scanner;

class Order{
	protected String customerName;
	protected String orderId;
	protected double orderAmount;
	public static final String PLATFORM_NAME="Amazon";
	
	
	public Order(String customerName, String orderId, double orderAmount) {
		setCustomerName(customerName);
		setOrderId(orderId);
		setOrderAmount(orderAmount);
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		if(!customerName.isEmpty()) {
		this.customerName = customerName;
		}
		else {
			System.out.println("Invlaid Name!");
		}
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		if(!orderId.isEmpty())
		{
		this.orderId = orderId;
		}
		else {
			System.out.println("Invalid Order ID");
		}
	}
	public double getOrderAmount() {
		
		return orderAmount;
		
	}
	public void setOrderAmount(double orderAmount) {
		if(orderAmount>0){
			this.orderAmount = orderAmount;
		}
		else {
			System.out.println("Invalid Order Amount");
		}
	}
	
	public void processOrder()
	{
		System.out.println("Your Order is Proccessing ! Wait for Some Time.");
	}
	
	public void displayDetails()
	{
		System.out.println("Order Details: ");
		System.out.println("Custome Name: "+customerName);
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Amount: "+orderAmount);
		System.out.println("Platform Name: "+PLATFORM_NAME);
	}
}
class StandardOrder extends Order{
	protected double shippingCharge = 50.0;
	protected double finalAmount=0;
	public StandardOrder(String customerName, String orderId, double orderAmount) {
		super(customerName, orderId, orderAmount);
		
	}
	@Override
	public void processOrder()
	{
	finalAmount= orderAmount+shippingCharge;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Order Details: ");
		System.out.println("Custome Name: "+customerName);
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Amount: "+orderAmount);
		System.out.println("Platform Name: "+PLATFORM_NAME);
		System.out.println("Final Standard Order Amount(with shhiping): Rs. "+finalAmount);
	}
	
}
class PrimeOrder extends Order{
	protected double discountRate = 10.0;
	protected double finalAmount=0;
	public PrimeOrder(String customerName, String orderId, double orderAmount) {
		super(customerName, orderId, orderAmount);
		
	}
	
	@Override
	public void processOrder()
	{
	finalAmount= orderAmount-(orderAmount*discountRate/100);
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Order Details: ");
		System.out.println("Custome Name: "+customerName);
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Amount: "+orderAmount);
		System.out.println("Platform Name: "+PLATFORM_NAME);
		System.out.println("Final Standard Order Amount(with shhiping): Rs. "+finalAmount);
	}
}
class InternationalOrder extends Order{
	protected double customsDuty = 18.0; // 18% customs duty
	protected double internationalShipping = 250.0;
	protected double finalAmount=0;
	public InternationalOrder(String customerName, String orderId, double orderAmount) {
		super(customerName, orderId, orderAmount);
		
//		if(orderAmount>1000)
//		{
//			this.orderAmount=orderAmount;
//		}
//		else {
//			System.out.println("International Orders must be above Rs. 1000");
//		}
	}
	
	@Override
	public void processOrder()
	{
	finalAmount= orderAmount+(orderAmount*customsDuty/100)+internationalShipping;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Order Details: ");
		System.out.println("Custome Name: "+customerName);
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Amount: "+orderAmount);
		System.out.println("Platform Name: "+PLATFORM_NAME);
		System.out.println("Final Standard Order Amount(with shhiping): Rs. "+finalAmount);
	}
}

public class OrderManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Order Type: ");
		System.out.println("1. Standard Order");
		System.out.println("2. Prime Order");
		System.out.println("3. International Order");
		
		int choice=Integer.parseInt(sc.nextLine());
		
		switch (choice)
		{
		case 1: 
		{
			System.out.println("Enter the Customer Name: ");
			String customerName=sc.nextLine();
			System.out.println("Enter the Order ID: ");
			String orderId = sc.nextLine();
			System.out.println("Enter the Order Amount: ");
			double orderAmount=Double.parseDouble(sc.nextLine());
			StandardOrder standardOrder = new StandardOrder(customerName, orderId, orderAmount);
			standardOrder.processOrder();
			standardOrder.displayDetails();
			break;
		}
		case 2:
		{
			System.out.println("Enter the Customer Name: ");
			String customerName=sc.nextLine();
			System.out.println("Enter the Order ID: ");
			String orderId = sc.nextLine();
			System.out.println("Enter the Order Amount: ");
			double orderAmount=Double.parseDouble(sc.nextLine());
			PrimeOrder primeOrder = new PrimeOrder(customerName, orderId, orderAmount);
			primeOrder.processOrder();
			primeOrder.displayDetails();
			break;
		}
		case 3:
		{
			System.out.println("Enter the Customer Name: ");
			String customerName=sc.nextLine();
			System.out.println("Enter the Order ID: ");
			String orderId = sc.nextLine();
			System.out.println("Enter the Order Amount: ");
			double orderAmount=Double.parseDouble(sc.nextLine());
			InternationalOrder internationalOrder = new InternationalOrder(customerName, orderId, orderAmount);
			internationalOrder.processOrder();
			if(orderAmount>1000)
			{
			internationalOrder.displayDetails();
			}
			else {
				System.out.println("Order Amount below 1000 is Not Allowed");
			}
			break;
		}
		default:
			System.out.println("Invalid Order Type! Try Again.");
		}
		sc.close();
	}

}
