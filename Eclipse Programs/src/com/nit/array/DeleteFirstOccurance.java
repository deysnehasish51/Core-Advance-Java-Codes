package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteFirstOccurance {
	
	public static void deleteFirstOccurance(int[] arr,int element)
	{
		
		int index=-1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(element==arr[i])
			{
				index=i;
				break;
			}
		}
			
			if(index!=-1)
			{
				int[] res = new int[arr.length-1];
				int rIndex=0;
				for(int i=0;i<arr.length;i++)
				{
					if(i!=index)
					{
						res[rIndex++]=arr[i];
					}
				}
				System.out.println(Arrays.toString(res));
			}
			else {
				System.out.println("Element not Found...");
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
		System.out.println("Enter the element you want to delete : ");
		int element=scanner.nextInt();
		
		deleteFirstOccurance(arr,element);
		scanner.close();

	}

}
