class ElectricityBill
{
	public static void main(String []args)
	{
		int units=250;
		int ratePerUnit=6;

		int billAmount=units*ratePerUnit;
		double totalAmount=billAmount+(billAmount*0.18);

		System.out.println("Units : "+units);
		System.out.println("Rate per Units : Rs. "+ratePerUnit);
		System.out.println("Total Bill (with 18% GST) : Rs. "+totalAmount);

	}

}