package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAllOccurance {
	
	public static void deleteAllOccurance(int[] arr,int element)
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(element==arr[i])
			{
				count++;
			}
		}
		
		int[] res =new int[arr.length-count];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(element!=arr[i])
			{
				res[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(res));
		
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
		System.out.println("Enter the element you want to delete : ");
		int element=scanner.nextInt();
		
		deleteAllOccurance(arr,element);
		scanner.close();

	}

}
