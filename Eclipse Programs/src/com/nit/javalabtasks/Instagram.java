package com.nit.javalabtasks;

import java.util.Scanner;

public class Instagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InstagramUser user1 = new InstagramUser();
		System.out.println("Enter if User is Following or not");
		boolean isFollowing=Boolean.parseBoolean(sc.nextLine());
		System.out.println("Enter if User is Close Friend  or not");
		boolean isCloseFriend=Boolean.parseBoolean(sc.nextLine());
		System.out.println("Enter if Users Account is Private or not");
		boolean isPrivateAccount=Boolean.parseBoolean(sc.nextLine());
		
		user1.setDetails(isFollowing, isPrivateAccount, isCloseFriend);
		user1.viewStory();
		sc.close();
		
	}

}

class InstagramUser
{
	boolean isFollowing;
	boolean isPrivateAccount;
	boolean isCloseFriend;
	
	public void setDetails(boolean isFollowing,boolean isPrivateAccount,boolean isCloseFriend)
	{
		this.isFollowing=isFollowing;
		this.isCloseFriend=isCloseFriend;
		this.isPrivateAccount=isPrivateAccount;
	}
	
	public void viewStory()
	{
		if(isFollowing==true)
		{
			if(isPrivateAccount==true&&isCloseFriend==true)
			{
				System.out.println("User Can View the Story.");
			}
			else if(isPrivateAccount==false&&isCloseFriend==false)
			{
				System.out.println("User can View the Story.");
			}
			else
			{
				System.out.println("User Can not View Story.");
			}
		}
		else
		{
			System.out.println("User Can not view Story.");
		}
	}
}
