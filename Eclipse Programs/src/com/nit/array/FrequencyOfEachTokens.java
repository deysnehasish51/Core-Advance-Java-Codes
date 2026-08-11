package com.nit.array;

import java.util.Scanner;

public class FrequencyOfEachTokens {
	
	/*public static void frequncyOfEachTokens(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='*';
				}
			}
			if(arr[i]!='*')
			{
			System.out.println(arr[i]+"/t--->/t"+count);
			}
		}
	}*/
	
	//using min-1 or max+1 but its not a good practice
	public static void frequncyOfEachTokens(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=min-1;
				}
			}
			if(arr[i]!=min-1)
			{
			System.out.println(arr[i]+"\t--->\t"+count);
			}
		}
	}
	
	
//	public static void frequncyOfEachTokens(int[] arr)
//	{
//		boolean[] token= new boolean[arr.length];
//		for(int i=0;i<arr.length;i++)
//		{
//			int count=1;
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j]&&arr[i]!=true)
//				{
//					count++;
//					arr[j]=true;
//				}
//			}
//			if(arr[i]!=true)
//			{
//			System.out.println(arr[i]+"/t--->/t"+count);
//			}
//		}
//	}

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
		
		frequncyOfEachTokens(arr);
		scanner.close();

	}

}
