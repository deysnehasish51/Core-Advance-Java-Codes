class ATM
{
    long accNo;
    double balance;

    public void withdrawMoney(double withdraw)
    {
        if(withdraw<=balance)
        {
        double remainingBalance=balance-withdraw;
        System.out.println("Withdraw Amount : "+withdraw);
        System.out.println("Remaining Balance : "+remainingBalance);
        }
        else
        {
            System.out.println("Insufficient Balance.");
        }        
    }
    public static void main(String []args)
    {
        ATM customer1 = new ATM();

        customer1.accNo=546718210002864L;
        customer1.balance=50000.0;
        customer1.withdrawMoney(30000.0);

        ATM customer2 = new ATM();

        customer2.accNo=784358734534535L;
        customer2.balance=6858885.0;
        customer2.withdrawMoney(3646747.0);


    }
}