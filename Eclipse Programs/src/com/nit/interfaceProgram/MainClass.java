package com.nit.interfaceProgram;
/*
 *Design a functional interface named as Tester
 *Provide an abstract method named as checkEven(int num)
 *Take a number and check whether it is even or not by the support of 
 *functional programming using lambda expression.
 */

@FunctionalInterface
interface Tester
{
	public void checkEven(int num);
}
public class MainClass {

	public static void main(String[] args) {
		
		Tester t1 = (num)->{if(num%2==0)System.out.println(num+" is Even"); else System.out.println(num+ " is Odd");};
		t1.checkEven(10);

	}

}
