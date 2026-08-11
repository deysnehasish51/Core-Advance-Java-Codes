class LoanEMI
{
	public static void main(String []args)
	{
		long principal=500000L;
		int annualRate=10;
		
		double monthlyRate=annualRate/12.0/100.0;

		int time=2;
		int n=time*12;
		
		double emi=(principal*monthlyRate*Math.pow(1+monthlyRate,n)/(Math.pow(1+monthlyRate,n)-1));

		System.out.println("Principal : Rs. "+ principal);
		System.out.println("Rate of Interest : "+annualRate+"% annual");
		System.out.println("Time : "+time +" years(24months)");
		System.out.println("Monthly EMI : Rs. "+emi);
		
	}
}