package com.nit.array;
import java.util.Arrays;
import java.util.Scanner;

public class SwaapAdjacentElements {

	public static void swapAdjacentElements(String[] arr)
	{
		for(int i=0;i<arr.length;i+=2)
		{
			String temp = arr[i];
			
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size =scanner.nextInt();
		String[] arr = new String[size];
		
		System.out.println("Enter the Elements in Array : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.next();
		}
		
		swapAdjacentElements(arr);
		scanner.close();

	}

}
