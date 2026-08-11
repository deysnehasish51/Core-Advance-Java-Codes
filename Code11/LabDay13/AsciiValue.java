class AsciiValue
{
    public static void main(String []args)
    {
        String str="SNEHASISH";

	for(int i=0;i<str.length();i++)
	{
		System.out.println("ASCII Value of "+str.charAt(i)+" is : "+(str.charAt(i)+1-1));
	}
    }
}