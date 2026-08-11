package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveBlockedUser {
	
	public static void removeBlockedUser(String[] arr,String name)
	{
		String[] newArr = new String[arr.length-1];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!(name.equals(arr[i])))
			{
				newArr[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size =Integer.parseInt(scanner.nextLine());
		String[] arr = new String[size];
		
		System.out.println("Enter the Elements in Array : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextLine();
		}
		
		System.out.println("Enter the Name of Block User : ");
		
		String name = scanner.nextLine();
		
		removeBlockedUser(arr, name);
		
		scanner.close();

	}

}
