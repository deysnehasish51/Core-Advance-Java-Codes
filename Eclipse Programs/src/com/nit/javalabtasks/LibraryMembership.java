package com.nit.javalabtasks;

import java.util.Scanner;

public class LibraryMembership {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member m1 = new Member();
		
		System.out.println("Enter the Member Id");
		int memberId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Membership Type : ");
		String membershipType = sc.nextLine();
		
		m1.setMemberId(memberId);
		m1.setMembershipType(membershipType);
		
		m1.displayDetails();
		
		
		sc.close();
	}

}

class Member
{
	private int memberId;
	private String membershipType;
	
	boolean isEntered=false;
	
	public void setMemberId(int memberId)
	{
		if(isEntered==false)
		{
			this.memberId=memberId;
			isEntered=true;
		}
		else {
			System.out.println("Memer id is Immutable can not be Change");
		}
	}
	public int getMemberId() {
		return memberId;
	}
	
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	
	public void displayDetails()
	{
		System.out.println("Member Details : ");
		System.out.println("Member ID : "+getMemberId());
		System.out.println("Membership Type : "+getMembershipType());
	}
	
}