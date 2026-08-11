package com.nit.array;

import java.util.Scanner;

public class EmployeeSalary {
	
	public static int aboveSalary(int[] salary)
	{
		int count=0;
		
		for(int n:salary)
		{
			if(n>50000)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Employee : ");
		
		int noOfEmployee=sc.nextInt();
		
		int[] salary = new int[noOfEmployee];
		
		System.out.println("Enter the Salary of "+noOfEmployee+ " employees : ");
		for(int i=0;i<noOfEmployee;i++)
		{
			salary[i]=sc.nextInt();
		}
		
		System.out.println("Employees earning above 50000 : "+aboveSalary(salary));
		sc.close();

	}

}
