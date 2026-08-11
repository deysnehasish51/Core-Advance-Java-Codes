class OnlineShopping
{
	public static void main(String []args)
	{
		int orderAmount1=2300;
		int orderAmount2=5400;

		if(orderAmount1>orderAmount2)
		{	
			System.out.println("First order amount : "+orderAmount1);
			System.out.println("Second order amount : "+orderAmount2);
			System.out.println("The first order amount ("+orderAmount1+") is larger.");
		}
		else if(orderAmount2>orderAmount1)
		{
			System.out.println("First order amount : "+orderAmount1);
			System.out.println("Second order amount : "+orderAmount2);

			System.out.println("The second order amount ("+orderAmount2+") is larger.");
		}
		else
		{
		System.out.println("First order amount : "+orderAmount1);
			System.out.println("Second order amount : "+orderAmount2);

		System.out.println("Both order amount are equal");
		}
	}
}