package com.nit.Swiggy;

public class Promotion {

	private int promotionId;
	private int restaurantId;
	private int itemId;
	private double discountPercentage;
	
	public Promotion(int promotionId, int restaurantId, int itemId, double discountPercentage) {
		super();
		this.promotionId = promotionId;
		this.restaurantId = restaurantId;
		this.itemId = itemId;
		this.discountPercentage = discountPercentage;
	}

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
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

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public void addPromotion(Promotion promotion) {
		
	}
	
	public void applyPromotion(MenuItem item,double currentPrice) {
		
	}
	
	

}
