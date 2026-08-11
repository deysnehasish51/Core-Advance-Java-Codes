package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestParticipants {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the No of Tasks: ");
			int noOfParticipants=Integer.parseInt(scanner.nextLine());
			
			if(noOfParticipants>15) {
				System.out.println("Error - Maximum 15 participants are allowed");
			}
			else {
			for(int i=0;i<noOfParticipants;i++) {
				System.out.println("Enter participants "+i+": ");
				String str=scanner.nextLine();
				if(str.length()>30) {
					System.out.println("Error - String length must be less than 30");
				}
				else {
					arrayList.add(str);
				}
			}
			
			System.out.println("Enter the participant to remove: ");
			String removeParticipant=scanner.nextLine();
			arrayList.remove(removeParticipant);
			Iterator<String> itr=arrayList.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			}
			
		}
		
	}

}

