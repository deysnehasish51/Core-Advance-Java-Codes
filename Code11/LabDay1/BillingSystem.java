class BillingSystem
{
	public static void main(String args[])
	{
		int invoiceNo=453645;
		
		if(invoiceNo%5==0)
		{
			System.out.println("Congratulations! You are Eligible for the Discount.");

		}
		else
		{
			System.out.println("Sorry! You are not Eligible for the Discount.");

		}
	}
}