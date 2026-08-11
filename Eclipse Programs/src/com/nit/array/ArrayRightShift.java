package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightShift {

	public static void rightShift(int[] arr)
	{
		System.out.println("Array before Left Shift : "+Arrays.toString(arr));
		int temp = arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=temp;
		
		System.out.println("Array after Right Shift : "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array 1 : ");
		int size = scanner.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter values in Array 1 : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		rightShift(arr);
		scanner.close();

	}

}
