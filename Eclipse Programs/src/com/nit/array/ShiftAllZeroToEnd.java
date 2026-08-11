package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftAllZeroToEnd {

	public static void shiftAllZeroToEnd(int[] arr)
	{
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length)
		{
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
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
		
		shiftAllZeroToEnd(arr);
		scanner.close();


	}

}
