package com.nit.array;

import java.util.Scanner;

public class EvenOddVisitorDayCount {
	
	public static void evenOddDayCounter(int[] arr)
	{
		int countEven=0;
		int countOdd=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		
		System.out.println("Even Count : "+countEven);
		System.out.println("Odd Count : "+countOdd);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size =scanner.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements in Array : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		evenOddDayCounter(arr);
		scanner.close();

	}

}
