package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class TestShopping {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<String>  user1= new ArrayList<String>();
			ArrayList<String> user2 = new ArrayList<String>();
			System.out.println("Enter the number of items: ");
			int itemNo=scanner.nextInt();
			for(int i=1;i<=itemNo;i++) {
				System.out.println("Enter the item: "+i+": ");
				String item=scanner.next();
				user1.add(item);
			}
			
			for(String str:user1) {
				System.out.print(str+" \n");
			}
			
			for(int i=1;i<=itemNo;i++) {
				System.out.println("Enter the item: "+i+": ");
				String item=scanner.next();
				user2.add(item);
			}
			
			
			
			for(String str:user1) {
				System.out.print(str+" \n");
			} 
			ArrayList<String> user = new ArrayList<String>();
			user.addAll(user1);
			user.addAll(user2);
			
			System.out.println("After merging Two Wishlists: ");
			System.out.print(user);
		}
		
	}

}
