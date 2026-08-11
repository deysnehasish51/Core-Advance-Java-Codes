// Write a java program to find the length of the given two string. if length is same make it "Both are same size"
// str1="Naresh IT" str2="Training Institute".
class LengthOfString
{
    public static void main(String []args)
    {
        String str1="Naresh IT";
        String str2="Java";

        int length1=str1.length();
        int length2=str2.length();

        if(length1==length2)
        {
            System.out.println("Both String are Same size.");
        }
        else
        {
            System.out.println("Both String are different size.");           
        }
    }
}