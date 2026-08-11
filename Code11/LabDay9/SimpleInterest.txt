class SimpleInterest
{
	public static void main(String []args)
	{
		int principal=10000;
		int rate=5;
		int time=2;
		int simpleInterest=principal*rate*time/100;

		System.out.println("Principal: Rs. "+principal);
		System.out.println("Rate : "+rate+"%");
		System.out.println("Time : "+time+" years");
		System.out.println("Simple Interest : Rs. "+simpleInterest);
	}
}