package com.nit.methodOverriding;

class Order
{
	int orderId;
	String customerName;
	double amount;
	public Order(int orderId, String customerName, double amount) {

		
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}
	
	@Override
	
	public String toString()
	{
		return "LOG: Order{ orderId="+orderId+", customerName='"+customerName+"',amount="+amount+"}";
	}
	
}

public class ShoppingPlatform {

	public static void main(String[] args) {
		
		Order order = new Order(5001,"Alice",1999.0);
		System.out.println(order);

	}

}
