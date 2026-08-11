package com.nit.interfaceProgram;

/*
 * Design a functional interface named as Printer Provide an abstract
 *  method named as print(String message), which return the message taken as input.
 */
@FunctionalInterface
interface Printer
{
	public abstract String print(String message);
}
public class TestPrinter {

	public static void main(String[] args) {
		Printer printer = (msg)->{return "Message is: "+msg;};
		
		System.out.println(printer.print("Hello How are you"));

	}

}
