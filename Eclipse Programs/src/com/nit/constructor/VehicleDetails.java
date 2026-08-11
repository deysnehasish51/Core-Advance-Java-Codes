package com.nit.constructor;

public class VehicleDetails {

	public static void main(String[] args) {
		 Vehicle v1 = new Vehicle("KA01AB1234");
		 Vehicle v2 = new Vehicle("MH12XY7890", "John");
		 Vehicle v3 = new Vehicle("DL04GH4567", "Jane", "Honda City", 2020);
		 System.out.println(v1.displayDetails());//JVM invokes toString()
		 System.out.println(v2.displayDetails());
		 System.out.println(v3.displayDetails());
		 
	}

}

class Vehicle
{
	private String regNo;
	private String ownerName;
	private String model;
	private int year;
	
public Vehicle(String regNo) {
		
		setRegNo(regNo);
		this.ownerName="Unknown";
		this.model = "Unknown";
		this.year=0;
	}
public Vehicle(String regNo, String ownerName) {
	
	setRegNo(regNo);
	setOwnerName(ownerName);
	this.model = "Unknown";
	this.year=0;
}
	public Vehicle(String regNo, String ownerName, String model, int year) {
		
		setRegNo(regNo);
		setOwnerName(ownerName);
		this.model = model;
		setYear(year);
	}
	
	
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		if(!regNo.isEmpty())
		{
			this.regNo=regNo;
		}
		else {
			System.out.println("Invalid Ragistration Number !");
			this.regNo="Unknown";
		}
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		if(!ownerName.isEmpty())
		{
			this.ownerName=ownerName;
		}
		else {
			System.out.println("Invalid Owner Name !");
			this.ownerName="Unknown";
		}
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year>=1990&&year<=2025)
		{
			this.year=year;
		}
		else {
			System.out.println("Invalid Year");
		}
	}
	
	public String displayDetails()
	{
		return "Registration Number : "+regNo+", Owner Name : "+ownerName+", Model : "+model+", Year : "+year;
	}
	
}