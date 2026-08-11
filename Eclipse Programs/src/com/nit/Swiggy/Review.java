package com.nit.Swiggy;

public class Review {

	private int userId;
	private int restaurantId;
	private int itemId;
	private int rating;
	private String comment;
	
	public Review(int userId, int restaurantId, int itemId, int rating, String comment) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.itemId = itemId;
		this.rating = rating;
		this.comment = comment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void addReview(Review review) {
		
	}
	
	public void displayRestaurantReviews(int restaurantId) {
		
	}
	
	public void displayMenuItemReviews(int restaurantId, int itemId) {
		
	}
	
	

}
