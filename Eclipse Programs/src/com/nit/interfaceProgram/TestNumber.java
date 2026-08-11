package com.nit.interfaceProgram;

@FunctionalInterface

interface Number{
	public void printNumber();
}
public class TestNumber {

	public static void main(String[] args) {
		Number number =()->{for(int i=1;i<=10;i++) {System.out.println(i);}};
		number.printNumber();
	}

}
