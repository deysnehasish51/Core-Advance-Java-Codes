class SalesCommission
{
    public static void main(String []args)
    {
        int monthlySales=58000;
        int commision;
        if(monthlySales>0&&monthlySales<=20000)
        {
            System.out.println("Your Monthly Sales is : Rs. "+monthlySales);
            System.out.println("You get Commission of : 3%");
        }
        else if(monthlySales>20000&&monthlySales<=50000)
        {
            System.out.println("Your Monthly Sales is : Rs. "+monthlySales);
            System.out.println("You get Commission of : 12%");
        }
        else
        {
            System.out.println("Your Monthly Sales is : Rs. "+monthlySales);
            System.out.println("You get Commission of : 31%");
        }
    }
}