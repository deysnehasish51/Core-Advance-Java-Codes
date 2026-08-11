package com.nit.javalabtasks;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FriendSuggestion id1= new FriendSuggestion();
		
		System.out.println("Enter the Number of Mutual Friends : ");
		
		int mutualFriend=sc.nextInt();
		System.out.println("Enter User is Verified or Not ?");
		
		boolean isVerified= sc.nextBoolean();
		
		id1.setData(mutualFriend, isVerified);
		id1.getSuggestionLevel();
		sc.close();
	}
}

class FriendSuggestion
{
	int mutualFriend;
	boolean isVerified;
	
	public void setData(int mutualFriend,boolean isVerified)
	{
		this.mutualFriend=mutualFriend;
		this.isVerified=isVerified;
	}
	
	public void getSuggestionLevel()
	{
		if(this.mutualFriend>=10 && this.isVerified==true)
		{
			System.out.println("Strong Suggestion.");
		}
		else if(this.mutualFriend>=1&&this.mutualFriend<=9)
		{
			System.out.println("Moderate Suggestion");
		}
		else
		{
			System.out.println("Low Suggestion.");
		}
	}
}
