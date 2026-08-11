class Interest
{
	public static void main(String []args)
	{
		double principal=1000.0;
		int time=5;
		double rate=0.1;
		int n=1;

		double simpleInterest=principal*rate*time/100;

		double compoundInterest=principal*Math.pow((1+(rate/n)),(n*time));

		double total1=principal+simpleInterest;
		double total2=principal+compoundInterest;

		System.out.println("Simple Interest : "+simpleInterest);
		System.out.println("Compound Interest : "+compoundInterest);

		System.out.println("Total Amount in Simple Interest : "+total1);

		System.out.println("Total Amount in Compound Interest : "+total2);
	}

}