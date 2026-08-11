package com.nit.array;

import java.util.Scanner;

public class Company {
	public static double avarageAge(int[] age)
	{
		double sum=0;
		for(int n:age)
		{
			sum+=n;
		}
		return sum/age.length;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Employee : ");
		int noOfEmployee=sc.nextInt();
		
		int[] age = new int[noOfEmployee];
		System.out.println("Enter the age of "+noOfEmployee+ " employee : ");
		for(int i=0;i<noOfEmployee;i++)
		{
			age[i]=sc.nextInt();
		}
		
		System.out.println("Average Age of Employee : "+avarageAge(age));
		sc.close();

	}

}
