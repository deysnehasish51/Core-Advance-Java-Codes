class QueueSystem{
	public static void main(String []args)
	{
		int tokenNo=12;
		
		if(tokenNo%2==0)
		{
			System.out.println("Ticket Token No : "+tokenNo);
			System.out.println("Token No "+tokenNo+" is Even. Please proceed to Counter No 1");
		}
		else
		{
			System.out.println("Ticket Token No : "+tokenNo);
			System.out.println("Token No "+tokenNo+" is Odd. Please proceed to Counter No 2");
		}
	}

}