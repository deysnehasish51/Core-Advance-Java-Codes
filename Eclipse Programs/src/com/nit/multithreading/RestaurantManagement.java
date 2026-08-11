package com.nit.multithreading;
/*
 WAP a java program to simulate a restaurant order processing system where: 
 -A Customer thread places an order and waits for food.
 -A Chef thread prepares the food.
 -The Customer must wait until the chef completes food preparation.
 -The Chef notifies the Customer once the food is ready.
 Algorithm:
 1.Create a shared class Order.
 2.Define a boolean variable isFoodReady
 3.Customer thread calls wait() if food is not ready
 4.Chef thread prepares foods and sets isFoodReady to true.
 5.Chef calls notify() to wakes the waiting customer.
 6.Customer resumes execution after notification.
 */

class Order{
	public boolean isFoodReady;
	
	public synchronized void  placeOrder() {
		while(!isFoodReady) {
			try {
				System.out.println("Customer Confimed the Order....");
				System.out.println("Customer is Wating....");
				wait();
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("Customer recieved  food and strated eating.....");
	}
	public synchronized void prepareOrder() {	
		System.out.println("Chef is Preparing food....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isFoodReady=true;
		notify();
		System.out.println("Food is Prepared");
	}
	
}

public class RestaurantManagement {

	public static void main(String[] args) {
		Order order = new Order();
		
		Thread customer = new Thread(()->order.placeOrder());
		Thread chef= new Thread(()->order.prepareOrder());
		customer.start();
		chef.start();

	}

}
