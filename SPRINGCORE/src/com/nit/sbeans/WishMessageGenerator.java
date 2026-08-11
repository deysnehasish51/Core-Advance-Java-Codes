package com.nit.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time=time;
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		int hour = time.getHour();
		
		if(hour<12) {
			return "Good Morning: "+user;
		}
		else if(hour<16) {
			return "Good After Noon: "+user;
		}
		else if(hour<20) {
			return "Good Evening: "+user;
		}
		else {
			return "Good Night: "+user;
		}
	}
}
