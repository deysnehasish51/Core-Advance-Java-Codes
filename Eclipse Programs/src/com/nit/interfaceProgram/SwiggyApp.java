package com.nit.interfaceProgram;

import java.util.Random;
import java.util.Scanner;

public class SwiggyApp {
	private static void displayResturant(Resturant[] res) {
		for (int i = 0; i < res.length; i++) {
			System.out.println((i + 1) + ". " + res[i]);
		}
	}

	public static void main(String[] args) {
		FoodItem[] menu1 = { new FoodItem("Pizza", 250), new FoodItem("Burger", 120), new FoodItem("Sandwich", 100) };
		FoodItem[] menu2 = { new FoodItem("Idli", 40), new FoodItem("Dosa", 60), new FoodItem("Samosa", 40) };
		FoodItem[] menu3 = { new FoodItem("Chicken Biriyani", 200), new FoodItem("Cicken Pulao", 150),
				new FoodItem("Chincken Curry", 120) };

		Resturant[] restArr = { new Resturant("Food Hub", menu1), new Resturant("Spice Villa", menu2),
				new Resturant("Mehfil", menu3) };

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Select Restaurant: ");
			displayResturant(restArr);
			System.out.println("Enter your choice : ");
			int choiceRes = Integer.parseInt(sc.nextLine());
			if (choiceRes > restArr.length) {
				System.out.println("Can't find the resturant!!!");
				return;
			}
			Resturant r = restArr[choiceRes - 1];
			System.out.println("Select Items: ");
			r.displayMenu();
			System.out.println("Enter how many item you want to order : ");
			int nItems = Integer.parseInt(sc.nextLine());

			FoodItem[] items = new FoodItem[nItems];
			int[] qty = new int[nItems];
			for (int i = 0; i < nItems; i++) {
				System.out.println("Enter Item Choice: ");
				int choiceItem = Integer.parseInt(sc.nextLine());
				;
				items[i] = r.getItem(choiceItem - 1);
				System.out.println("Enter Quantity: ");
				int q = Integer.parseInt(sc.nextLine());
				qty[i] = q;
				System.out.println();
				r.displayMenu();
			}
			Order order = new Order();
			order.addOrderItems(items, qty);
			order.displayOrder();

			double totalBill = order.calculateTotalBill();
			System.out.println("Total bill : " + totalBill);

			System.out.println("Select Payment Method:\n" + "1. UPI\n" + "2. Card");

			System.out.println("Choice :");
			int choicePayment = Integer.parseInt(sc.nextLine());
			IPayment payment = null;
			switch (choicePayment) {
			case 1 -> {
				System.out.println("Enter amount : ");
				double amount = Double.parseDouble(sc.nextLine());
				if (amount < totalBill) {
					System.out.println("Payment Failed\n" + "Error: Payment amount mismatch");
				} else {
					payment = new UPI();
					payment.pay(amount);
					order.orderStatus();
				}
			}
			case 2 -> {
				System.out.println("Enter amount : ");
				double amount = Double.parseDouble(sc.nextLine());
				if (amount < totalBill) {
					System.out.println("Payment Failed\n" + "Error: Payment amount mismatch!!!");
				} else {
					payment = new Card();
					payment.pay(amount);
					order.orderStatus();
				}
			}
			default -> {
				System.out.println("Invalid payment method!!!...");
				return;
			}
			
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

 class SwiggyUser {
	private String name;
	private String phoneNumber;

	public SwiggyUser(String name, String phoneNumber) {
		this.setName(name);
		this.setPoneNumber(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			System.out.println("Invalid user name...");
			System.exit(0);
		}
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPoneNumber(String phoneNumber) {
		if (phoneNumber.length() < 10 || phoneNumber.length() > 10 || !phoneNumber.matches("\\d+")) {
			System.out.println("Invalid phone number!!!");
			System.exit(0);
		}
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\nPhoneNumber: " + phoneNumber;
	}
}

class SwiggyCustomer extends SwiggyUser {
	private String address;

	public SwiggyCustomer(String name, String phoneNumber, String address) {
		super(name, phoneNumber);
		this.setAddress(address);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address.isEmpty()) {
			System.out.println("Invalid user address...");
			System.exit(0);
		}
		this.address = address;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAddress: " + address;
	}

}

 class Resturant {
	private String name;
	private FoodItem[] menu;

	public Resturant(String name, FoodItem[] menu) {
		this.name = name;
		if (menu.length == 0) {
			System.out.println("Menu should not be empty");
			System.exit(0);
		}
		this.menu = menu;
	}

	public void displayMenu() {
		System.out.println("Menu items are : ");
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + ". " + menu[i]);
		}
	}

	public FoodItem getItem(int index) {
		return menu[index];
	}

	@Override
	public String toString() {
		return name;
	}

}

 class FoodItem {
	private String name;
	private double price;

	public FoodItem(String name, double price) {
		this.name = name;
		this.price = price;
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

	@Override
	public String toString() {
		return name + " -> " + price;
	}

}


 class Order {
	private static String ordrID = "SwiggyID" + new Random().nextInt(1000, 9999);
	private FoodItem[] orderedItems;
	private int[] quantity;

	public Order() {
		super();
	}

	public void addOrderItems(FoodItem[] items, int[] qty) {
		if (items.length == 0) {
			System.out.println("Cannot place an empty order.");
			System.exit(0);
		}
		this.orderedItems = items;
		this.quantity = qty;
	}

	public void displayOrder() {
		System.out.println("Items of : " + ordrID);
		for (int i = 0; i < orderedItems.length; i++) {
			System.out.println((i + 1) + ". " + orderedItems[i].getName() + " X " + quantity[i]);
		}
	}

	public double calculateTotalBill() {
		double totalBill = 0;
		for (int i = 0; i < orderedItems.length; i++) {
			totalBill += (orderedItems[i].getPrice()) * (quantity[i]);
		}
		return totalBill;

	}

	public void orderStatus() {
		System.out.println("PLACED -> PREPARING -> DELIVERED");
	}

}

 interface IPayment {
	void pay(double amount);
}

class UPI implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Rs. " + amount + " paid by using UPI");
	}

}

class Card implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Rs. " + amount + " paid by using Card");
	}

}

