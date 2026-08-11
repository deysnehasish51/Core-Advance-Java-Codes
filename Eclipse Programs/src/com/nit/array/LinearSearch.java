package com.nit.array;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linnearSearch(int[] arr,int key)
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
		
		int result= linnearSearch(arr, key);
		if(result!=-1)
		{
			System.out.println("User found at Index : "+result);
		}
		else {
			System.out.println("User not Found! ");
		}
		scanner.close();
	}

}
