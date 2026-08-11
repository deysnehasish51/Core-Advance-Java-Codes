package com.nit.array;

import java.util.Scanner;

public class PrintDuplicateTokens {
	
	public static void printDuplicateElement(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(" "+arr[i]);
			}
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
		
		printDuplicateElement(arr);
		scanner.close();

	}

}
