public class MobilePhone
{
    long phoneNo;
    String ownerName;
    double currentBalance=10.5;

    public void recharge(double amount)
    {
        this.currentBalance+=amount;
        System.out.println("Balance After Recharge : "+currentBalance);
    }

    public void makeCall(double time)
    {
        double remainingBalance=time/10;
        if(remainingBalance<currentBalance)
        {
            this.currentBalance-=remainingBalance;
            System.out.println("Balance After Making Call : "+currentBalance);
        }
        else{
            System.out.println("Call Disconnected ! Insufficient Balance.");
        }
    }

    public void displayDetails(long phoneNo,String ownerName)
    {
        this.phoneNo=phoneNo;
        this.ownerName=ownerName;
        
        System.out.println("Phone Number : "+phoneNo);
        System.out.println("Owner Name : "+ownerName);
        System.out.println("Remaining Balance : "+currentBalance);

    }
    public static void main(String []args)
    {
        MobilePhone m1 = new MobilePhone();

        m1.recharge(20);
        m1.makeCall(60);
        m1.displayDetails(7205132521l,"Snehasish Dey");
    }
}