class Palindrome
{
    public static void main(String []args)
    {
        String str="NAMAN";
        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
             rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("String is a Palindrome.");
        }
        else
        {
            System.out.println("String is not a Palindrome.");
        }

    }
}   