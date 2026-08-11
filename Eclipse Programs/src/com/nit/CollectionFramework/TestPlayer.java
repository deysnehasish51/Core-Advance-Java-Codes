package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<String>  teamA= new ArrayList<String>();
			ArrayList<String> teamB = new ArrayList<String>();
			System.out.println("Enter the number of player: ");
			int itemNo=scanner.nextInt();
			for(int i=1;i<=itemNo;i++) {
				System.out.println("Enter the player: "+i+": ");
				String item=scanner.next();
				teamA.add(item);
			}
			
			for(String str:teamA) {
				System.out.print(str+" \n");
			}
			System.out.println("Enter the no of player");
			int itemNo2=scanner.nextInt();
			for(int i=1;i<=itemNo2;i++) {
				System.out.println("Enter the player: "+i+": ");
				String item=scanner.next();
				teamB.add(item);
			}
			
			
			
			for(String str:teamB) {
				System.out.print(str+" \n");
			} 
			
			teamA.retainAll(teamB);
			
			System.out.println("Common Players: ");
			System.out.print(teamA);
		}
		
	}

}
