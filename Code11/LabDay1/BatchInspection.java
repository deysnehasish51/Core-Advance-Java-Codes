class BatchInspection
{
	public static void main(String args[])
	{
		int batchNo=198;

		if(batchNo%2==0&&batchNo%3==0)
		{
			System.out.println("Congratulations! You Pass the Quality Inspection.");

		}
		else
		{
			System.out.println("Sorry! You can't Pass the Quality Inspection.");
		}
	}
}