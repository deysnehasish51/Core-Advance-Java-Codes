package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
	public static void copyArray(int[] arr1)
	{
		int[] arr= new int[arr1.length];
		int index=0;
		for (int i : arr1) {
			arr[index]=i;
			index++;
		}
		System.out.println("Array After Copy : "+Arrays.toString(arr));
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
		
		copyArray(arr1);
		scanner.close();

	}

}
