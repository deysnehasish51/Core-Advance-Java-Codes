package com.nit.array;

import java.util.Scanner;

public class FirstAndLastOccurance {

	public static int firstOccurance(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				
				return i;
			}
		}
		
		return -1;
	}
	
	public static int lastOccurance(int[] arr,int key)
	{
		for(int i=arr.length-1;i>0;i--)
		{
			if(key==arr[i])
			{
				
				return i;
			}
		}
		
		return -1;
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
		
		System.out.println("Enter the Key you Want to Search : ");
		int key=scanner.nextInt();
		
		int firstRes=firstOccurance(arr, key);
		int lastRes=lastOccurance(arr, key);
		
		if(firstRes!=-1)
		{
			System.out.println("First occurance index : "+firstRes);
		}
		else {
			System.out.println("Not Found !");
		}
		
		if(lastRes!=-1)
		{
			System.out.println("First occurance index : "+lastRes);
		}
		else {
			System.out.println("Not Found !");
		}
		
		
		
		
		scanner.close();
	}

}
