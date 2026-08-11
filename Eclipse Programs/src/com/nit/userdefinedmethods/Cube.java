package com.nit.userdefinedmethods;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		System.out.println("Cube Root : "+Math.pow(num,3));
		sc.close();
	}

}
