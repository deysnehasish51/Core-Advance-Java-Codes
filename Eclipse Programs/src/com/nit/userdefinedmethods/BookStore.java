package com.nit.userdefinedmethods;

import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book b1 = new Book();
		
		System.out.println("Enter the Book Title");
		String title=sc.nextLine();
		b1.setTitle(title);
		System.out.println("Enter the Author Name: ");
		String authorName=sc.nextLine();
		
		b1.setAuthorName(authorName);
		
		System.out.println("Enter the Price : ");
		double price=sc.nextDouble();
		
		b1.setPrice(price);
		
		b1.getTitle();
		b1.getAuthorName();
		b1.getPrice();
		b1.displayDetails();
		sc.close();

	}

}

class Book
{
	private String title;
	private String authorName;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>=0)
		{
		this.price = price;
		}
		else {
			{
				System.err.println("Invalid Price ,Price can not be negative.");
				this.price=0;
			}
		}
	}
	
	public void displayDetails()
	{
		System.out.println("Book Details: ");
		System.out.println("Title : "+getTitle());
		System.out.println("Author : "+getAuthorName());
		System.out.println("Price : "+getPrice());
	}
	
}