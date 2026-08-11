package com.nit.userdefinedmethods;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		System.out.println("Absolute Value : "+Math.abs(num));
		sc.close();

	}

}
