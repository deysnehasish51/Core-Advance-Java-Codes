class FineCalculator
{
    public static void main(String []agrs)
    {
        int delayDays=25;

        if(delayDays<=5&&delayDays>0)
        {
            System.out.println("Fine is : Rs. "+(0.40*delayDays));
        }
        else if(delayDays>5&&delayDays<=10)
        {
            System.out.println("Fine is : Rs. "+(0.65*delayDays));
        }
        else
        {
            System.out.println("Fine is : Rs. "+(0.80*delayDays));
        }
    }
}