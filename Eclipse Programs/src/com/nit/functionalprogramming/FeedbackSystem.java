package com.nit.functionalprogramming;

import java.util.function.Predicate;

class Review{
	
	String user;
	int rating;
	
	
	public Review(String user, int rating) {
		this.user = user;
		this.rating = rating;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}	
}

public class FeedbackSystem {

	public static void main(String[] args) {
		Review[] reviews = {
				new Review("Jake", 3),
				new Review("Kim", 4),
				new Review("Liam", 2)
				};
		
		Predicate<Review> isPositive = (review)->{if(review.getRating()>=4) return true; else return false;};
		
		Predicate<Review> isNonPositive= isPositive.negate();
		
		System.out.println("Non Positive Reviews: ");
		for(int i = 0;i<reviews.length;i++)
		{
			if(isNonPositive.test(reviews[i]))
			{
				System.out.println(reviews[i].getUser());
			}
			
		}
	}

}
