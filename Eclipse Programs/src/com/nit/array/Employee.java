package com.nit.array;

import java.util.Scanner;

public class Employee {
	
	public static int findMaxSalary(int[] salary)
	{
		int max = salary[0];
		for(int n:salary)
		{
			if(max<n)
			{
				max=n;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the No of Employees : ");
		int noOfEmplyee=sc.nextInt();
		int[] salary=new int[noOfEmplyee];
		
		System.out.println("Enter the Salarys of "+noOfEmplyee+ "Employees : ");
		for(int i=0;i<noOfEmplyee;i++)
		{
			salary[i]=sc.nextInt();
		}
		
		System.out.println("Maximum Salary : "+ findMaxSalary(salary));
		
		sc.close();
	}

}
