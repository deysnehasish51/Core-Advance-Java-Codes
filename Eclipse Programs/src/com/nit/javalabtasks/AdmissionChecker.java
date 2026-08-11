package com.nit.javalabtasks;

import java.util.Scanner;

public class AdmissionChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		College s1 = new College();
		
		System.out.println("Enter Marks: ");
		int marks=sc.nextInt();
		System.out.println("Enter extracuricular true/false");
		boolean extracurricular=sc.nextBoolean();
		
		s1.setData(marks, extracurricular);
		s1.isEligible();
		s1.display();
		sc.close();
	}

}

class College
{
	int marks;
	boolean extracurricular;
	
	public void setData(int marks,boolean extracurricular)
	{
		this.extracurricular=extracurricular;
		this.marks=marks;
	}
	
	public boolean isEligible()
	{
		if(this.marks>=85&&this.extracurricular==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		if(this.isEligible()==true)
		{
			System.out.println("Eligible for Admission.");
		}
		else
		{
			System.out.println("Not eligible for Admission.");
		}
	}
}