class CalculateProfitOrLoss
{
	public static void main(String []args)
	{
		int costPrice=800;
		int sellingPrice=1000;
		if(costPrice>sellingPrice)
		{
		double loss=costPrice-sellingPrice;
		double lossPercent=(loss/costPrice)*100;

		System.out.println("Cost Price : Rs. "+costPrice);
		System.out.println("Selling Price : Rs. "+sellingPrice);

		System.out.println("Loss : Rs. "+loss);

		System.out.println("Loss Percentage : "+lossPercent+"%");
		}
		else
		{
		double profit=sellingPrice-costPrice;
		
		double profitPercent=(profit/costPrice)*100;
		
		System.out.println("Cost Price : Rs. "+costPrice);
		System.out.println("Selling Price : Rs. "+sellingPrice);
		System.out.println("Profit : Rs. "+profit);
		System.out.println("Profit Percentage : "+profitPercent+"%");
		}
	}

}