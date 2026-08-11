package com.nit.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	
	public  static void  reverese(int[] arr) {
		
		int[] res= new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			res[arr.length-i-1]=arr[i];
		}
		
		System.out.println(Arrays.toString(res));
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
		
		reverese(arr);
		scanner.close();
	}

}
