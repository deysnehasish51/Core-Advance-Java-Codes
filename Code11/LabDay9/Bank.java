class Bank
{
    public static void main(String []args)
    {
        long balance=50000;

        long transaction1=20000;
        long transaction2=-10000;
        long transaction3=5000;
        long transaction4=-80000;
        long transaction5=10000;

        if(transaction1>=0)
        {
            balance+=transaction1;
            System.out.println("Deposite Successful your New Balance : "+balance);
        }
        else if(transaction1<0)
        {
            balance+=transaction1;
            System.out.println("Widhdrawl Successful your New Balance : "+balance);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}