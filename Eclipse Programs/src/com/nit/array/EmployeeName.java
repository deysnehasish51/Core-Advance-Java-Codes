package com.nit.array;

import java.util.Scanner;

public class EmployeeName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of Employee : ");
		int noOfEmployee=scanner.nextInt();
		
		String[] name = new String[noOfEmployee];
		System.out.println("Enter Name of Employees : ");
		for(int i=0;i<noOfEmployee;i++)
		{
			name[i]=scanner.nextLine();
		}
		System.out.println("Enmployee List : ");
		for(String str:name)
		{
			System.out.println(str);
		}
		
		
		scanner.close();

	}

}
