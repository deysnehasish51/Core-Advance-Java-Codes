package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestToDoList {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the No of Tasks: ");
			int noOfTask=Integer.parseInt(scanner.nextLine());
			
			if(noOfTask>10) {
				System.out.println("Error - Maximum 10 tasks allowed");
			}
			else {
			for(int i=0;i<noOfTask;i++) {
				System.out.println("Enter task "+i+": ");
				String str=scanner.nextLine();
				if(str.length()>50) {
					System.out.println("Error - String length must be less than 50");
				}
				else {
					arrayList.add(str);
				}
			}
			

			Iterator<String> itr=arrayList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			}
			
		}
		
	}

}
