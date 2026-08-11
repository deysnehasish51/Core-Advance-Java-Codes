package com.nit.javalabtasks;

import java.util.Scanner;

public class LaptopDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Laptop l1 = new Laptop();
		System.out.println("Enter the Laptop Brand : ");
		String brandString=sc.nextLine();
		System.out.println("Enter the RAM : ");
		int RAM  =Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Processor : ");
		String processor=sc.nextLine();
		
		l1.setBrand(brandString);
		l1.setRAM(RAM);
		l1.setProcessor(processor);		
		l1.displayDetails();
		sc.close();
	}
}

class Laptop
{
	private String brand;
	private int RAM;
	private String processor;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int RAM) {
		if(RAM>0)
		{	
		this.RAM = RAM;
		}
		else {
			System.out.println("RAM value can not be zero");
			this.RAM=0;
		}
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void displayDetails()
	{
		System.out.println("Laptop Details : ");	
		System.out.println("Brand : "+getBrand());
		System.out.println("RAM Size : "+getRAM());
		System.out.println("Processor : "+getProcessor());
	}	
}