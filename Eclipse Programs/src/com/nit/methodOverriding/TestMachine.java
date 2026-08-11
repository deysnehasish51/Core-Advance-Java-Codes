package com.nit.methodOverriding;

import java.util.Scanner;

class Machine{
	String machineType;
	String documentName;
	public Machine(String machineType, String documentName) {
		this.machineType = machineType;
		this.documentName = documentName;
	}
	
	public void operate() {
		System.out.println("Generic Machine");
	}
}
class Printer extends Machine{

	public Printer(String machineType, String documentName) {
		super(machineType, documentName);	
	}
	@Override
	public void operate()
	{
		System.out.println(machineType+ " is printing the doucument: "+documentName);
	}
}
class Scaner extends Machine{

	public Scaner(String machineType, String documentName) {
		super(machineType, documentName);
		
	}
	
	@Override
	public void operate()
	{
		System.out.println(machineType+ " is scanning the doucument: "+documentName);
	}
}
public class TestMachine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter the machine Type: ");
//		String machineType1=scanner.nextLine();
//		
//		System.out.println("Enter the Document Name: ");
//		String douumentName= scanner.nextLine();
		
		
		Printer printer = new Printer("Printer", "report.pdf");
		Scaner scaner = new Scaner("Scaner", "invoice.jpg");
		
		printer.operate();
		scaner.operate();
		scanner.close();
		

	}

}
