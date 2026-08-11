package com.nit.functionalprogramming;

import java.util.function.Predicate;

/*
 * WAP to allow the user to pass an integer and check whether it is an odd number or not by using
 * predefined functional interface 'Predicate'.
 */
public class MainClass1 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (n)->{if(n%2!=0) return true; else return false;};
		System.out.println(predicate.test(11));
	}

}
