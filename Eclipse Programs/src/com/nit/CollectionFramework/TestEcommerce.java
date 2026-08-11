package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEcommerce {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<String>  allOffers= new ArrayList<String>();
			ArrayList<String> deals = new ArrayList<String>();
			System.out.println("Enter the number of items: ");
			int itemNo=scanner.nextInt();
			for(int i=1;i<=itemNo;i++) {
				System.out.println("Enter the item: "+i+": ");
				String item=scanner.next();
				allOffers.add(item);
			}
			
			for(String str:allOffers) {
				System.out.print(str+" \n");
			}
			int itemNo2=scanner.nextInt();
			for(int i=1;i<=itemNo2;i++) {
				System.out.println("Enter the item: "+i+": ");
				String item=scanner.next();
				deals.add(item);
			}
			
			
			
			for(String str:deals) {
				System.out.print(str+" \n");
			} 
			
			allOffers.removeAll(deals);
			
			System.out.println("Valid offers: ");
			System.out.print(allOffers);
		}
		
	}

}
