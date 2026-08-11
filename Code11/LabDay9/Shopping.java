class Shopping
{
	public static void main(String []args)
	{
		int item1=500,item2=800,item3=700;
		int discount=10;
		int total=item1+item2+item3;

		double discountAmount=total*(discount/100.0);
		double finalAmount=total-discountAmount;

		System.out.println("Item Prices : "+item1+", "+item2+", "+item3);
		System.out.println("Discount : "+discount+"%");
		System.out.println("Total Amount : Rs. "+total);
		System.out.println("Total Amount after Discount : Rs. "+finalAmount);
		
	}
}