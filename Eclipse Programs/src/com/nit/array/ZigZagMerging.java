package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagMerging {
	public static void mergeZigZag(int[] arr1,int[] arr2)
	{
		int[] arr= new int[arr1.length+arr2.length];
		
		int index=0;
		
		for (int i : arr1) {
			arr[index]=i;
			index+=2;
		}
		index=1;
		for (int i : arr2) {
			arr[index]=i;
			index+=2;
		}
		
		System.out.println("Array after Zig Zag Merging : "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array 1 : ");
		int size1 = scanner.nextInt();
		
		int[] arr1=new int[size1];
		System.out.println("Enter values in Array 1 : ");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the size of Array 2 : ");
		int size2=scanner.nextInt();
		
		int[] arr2 = new int[size2];
		System.out.println("Enter the Values in Array 2 : ");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=scanner.nextInt();
		}
		
		mergeZigZag(arr1, arr2);
		scanner.close();

	}

}
