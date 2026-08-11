public class BankAccount
{
    long accNo;
    String name;
    double balance;
    public void withdraw(double balance,double amount,String name)
    {
        this.balance=balance;
        this.name=name;
        if(amount<=balance)
        {
            double remainingBalance=balance-amount;
            System.out.println("Name : "+name);
            System.out.println("Account No : "+this.accNo);
            System.out.println("Withdraw Amount : "+amount);
            System.out.println("Remaining Balance : "+remainingBalance);
        }
        else
        {
            System.out.println("Insufficient Fund ");
        }
    }
    public void deposite(double balance,double amount,String name)
    {
        this.balance=balance;
        this.name=name;

        balance=balance+amount;
        System.out.println("Name : "+name);
        System.out.println("Account No : "+this.accNo);
        System.out.println("Deposite Amount : "+amount);
        System.out.println("Balance : "+balance);

    }

    public static void main(String []args)
    {
        BankAccount acc1 = new BankAccount();
        acc1.accNo=546718210002864l;
        acc1.withdraw(3000,2000,"Snehasish");
        acc1.deposite(5000,2000,"Snehasish");
    }
}