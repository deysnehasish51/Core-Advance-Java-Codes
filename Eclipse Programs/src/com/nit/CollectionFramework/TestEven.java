package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> evenList= new ArrayList<Integer>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			list.add(num);
		}
		
		for(Integer i:list) {
			if(i%2==0) {
				evenList.add(i);
			}
		}
		System.out.print(evenList);
		sc.close();
	}

}
