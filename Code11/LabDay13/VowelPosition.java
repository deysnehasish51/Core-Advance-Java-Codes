class VowelPosition
{
	public static void main(String []args)
	{
		String str="Poppins";
		boolean isFound=false;
		int pos=0;

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='U'||ch=='u')
		{
			isFound=true;
			pos=i;
			break;
		}
		}
		if(isFound==true)
		{
			System.out.println("Vowel found at index : "+pos);
		}
		else
		{
			System.out.println("Sorry vowel not found.");
		}

	}
}