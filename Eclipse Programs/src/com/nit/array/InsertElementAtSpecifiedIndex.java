package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtSpecifiedIndex {
	public static void insertAtSpecifiedIndex(int[] arr,int element,int index)
	{		
		if(index<0||index>arr.length)
		{
			System.out.println("Invalid Index....");
		}
		else {
			int[] res = new int[arr.length+1];
			
			for(int i=0;i<arr.length;i++)
			{
				res[i]=arr[i];
			}
			
			for(int i=res.length-1;i>index;i--)
			{
				res[i]=arr[i-1];
			}
			
			res[index]=element;
			System.out.println(Arrays.toString(res));
		}	
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
		
		System.out.println("Enter the index no where you want to insert : ");
		int index=scanner.nextInt();
		
		System.out.println("Enter the element you want to Insert : ");
		int element=scanner.nextInt();
		
		insertAtSpecifiedIndex(arr, element,index);
		scanner.close();
	}

}
