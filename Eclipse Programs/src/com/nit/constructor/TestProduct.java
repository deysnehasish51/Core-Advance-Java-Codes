package com.nit.constructor;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product(101, "Laptop");
		Product p3 = new Product(102, "Mobile", 25000);

		System.out.println(p1.displayDetails());
		System.out.println(p2.displayDetails());
		System.out.println(p3.displayDetails());

	}

}

class Product
{
	private int productId;
	private String productName;
	private double price;
	public Product()
	{
		this.productId=0;
		this.productName="Unknown";
		this.price=0;
	}
	public Product(int productId,String productName)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=0;
	}
	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		setPrice(price);
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0)
		{
			this.price=price;
		}
		else {
			this.price=0;
		}
	}
	
	public String displayDetails()
	{
		return "Product ID : "+productId+", Name : "+productName+", Price : "+price;
	}
}