class MarkSheet
{
	public static void main(String []args)
	{
		int eng=80,math=90,sci=75,san=85,his=70;
		
		int total=eng+math+sci+san+his;
		double average=total/5;
		double percentage=(total/500.0)*100;

		System.out.println("Marks : "+eng+", "+math+", "+sci+", "+his+", "+san);
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		System.out.println("Percentage : "+percentage+"%");
	}
}