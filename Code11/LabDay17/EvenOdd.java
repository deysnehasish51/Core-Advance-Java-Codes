public class EvenOdd
{
    public static void evenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num+" is Even");
        }
        else
        {
            System.out.println(num+" is Odd");
        }
    }

    public static void main(String []args)
    {    
        int number=20;
        evenOdd(number);
    }
}