package com.nit.userdefinedmethods;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentDetails s1 = new StudentDetails();
		
		System.out.println("Enter the Name : ");
		String name = sc.nextLine();
		
		s1.setName(name);
		
		System.out.println("Enter the Roll Number : ");
		int rollNo=sc.nextInt();
		
		s1.setrollNo(rollNo);
		
		s1.getName();
		s1.getRollNo();
		s1.displayDetails();
		sc.close();

	}

}

class StudentDetails
{
	private String name;
	private int rollNo;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setrollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void displayDetails()
	{
		System.out.println("Student Details : ");
		System.out.println("Name : "+getName());
		System.out.println("Roll Number : "+getRollNo());
	}
}