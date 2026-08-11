package com.nit.userdefinedmethods;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		System.out.println("Cube Root : "+Math.cbrt(num));
		sc.close();
	}

}
