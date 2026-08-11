//Write a java program take two strings as input and check wheather the string is same or not
class EqualString
{
    public static void main(String []args)
    {
        String str1="Naresh IT";
        String str2="Naresh IT";

        if(str1.equals(str2))
        {
            System.out.println("Both String Contents are Equal");
        }
        else
        {
            System.out.println("Both String contents are different");
        }
    }
}