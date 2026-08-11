package com.nit.array;

import java.util.Scanner;

public class Student {
	
	public static void  maxAttandance(int[] attandance) {
		int min= attandance[0];
		int index=0;
		for(int i=0;i<attandance.length;i++)
		{
			if(min>attandance[i])
			{
				min=attandance[i];
				index=i;
			}
		}
		System.out.println("Minimum Attendace : "+min+" Index Number : "+index);
	}
	
	public static int aboveAttaendance(int[] attandance)
	{
		int count=0;
		
		for(int n:attandance)
		{
			if(n>75)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of Studetns : ");
		int noOfStudent=scanner.nextInt();
		
		int[] attandance= new int[noOfStudent];
		
		System.out.println("Enter the attandance of "+noOfStudent+ " students : ");
		for(int i=0;i<noOfStudent;i++)
		{
			attandance[i]=scanner.nextInt();
		}
		
		maxAttandance(attandance);
		System.out.println("Students with >75% Atteandance : "+aboveAttaendance(attandance));
		
		scanner.close();

	}

}
