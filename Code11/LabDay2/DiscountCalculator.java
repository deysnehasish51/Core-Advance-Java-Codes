class DiscountCalculator
{
	public static void main(String []args)
	{
		double laptopPrice=60000.0;
		double printerPrice=12000.0;

		double discount1=0.15*laptopPrice;
		double discount2=0.1*printerPrice;

		double price1=laptopPrice-discount1;
		double price2=printerPrice-discount2;

		System.out.println("Laptop Price After Discount : "+price1);
		System.out.println("Printer Price After Discount : "+price2);
	}
}