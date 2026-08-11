class Product
{
	public static void main(String []args)
	{
		int price=1500;
		int tax=12;
		
		int totalPrice=price+(price*tax/100);

		System.out.println("Product Price : Rs. "+price);
		System.out.println("Tax : "+tax+"%");
		System.out.println("Total Price (with tax) : Rs. "+totalPrice);
	}
}