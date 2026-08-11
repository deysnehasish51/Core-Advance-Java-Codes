package com.nit.exceptionhandling;

import java.util.Scanner;

class InvalidPrescriptionExeption extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPrescriptionExeption(String message) {
		super(message);
	}
}

class Hospital{
	int doseMg;
	
	public Hospital(int doseMg){
		this.doseMg=doseMg;
	}
	
	public void prescribeMedicine(int doseMg) throws InvalidPrescriptionExeption {
		if(doseMg>0)
		{
			System.out.println("Prescription Confirmed.");
		}
		else {
			throw new InvalidPrescriptionExeption("Dose cannot be negative");
		}
	}
}
public class HospitalManagement {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Enter the Dose: ");
			int doseMg=scanner.nextInt();
			Hospital hospital = new Hospital(doseMg);
			try {
				hospital.prescribeMedicine(doseMg);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		}

	}

}
