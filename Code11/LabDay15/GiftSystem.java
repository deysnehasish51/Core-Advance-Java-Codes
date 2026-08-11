class GiftSystem
{
    public static void main(String []args)
    {
        int itemCode=6482323;

        int quantity=20;

        double ratePerItem=400;

        double bill= quantity*ratePerItem;

        if(bill>=100&&bill<=500)
        {   
            System.out.println("Item Code : "+itemCode);
            System.out.println("Quantity : "+quantity);
            System.out.println("Rate per Item : Rs. "+ratePerItem);
            System.out.println("Your Total Bill is : Rs. "+bill+" Congratulatios! you got a Key Ring.");
        }
        else if(bill>500&&bill<=1000)
        {
            System.out.println("Item Code : "+itemCode);
            System.out.println("Quantity : "+quantity);
            System.out.println("Rate per Item : Rs. "+ratePerItem);
            System.out.println("Your Total Bill is : Rs. "+bill+" Congratulatios! you got a Leather Purse.");
        }
        else if(bill>=1000)
        {
            System.out.println("Item Code : "+itemCode);
            System.out.println("Quantity : "+quantity);
            System.out.println("Rate per Item : Rs. "+ratePerItem);
            System.out.println("Your Total Bill is : Rs. "+bill+" Congratulatios! you got a Pocket Calculator.");
        }
        else
        {
            System.out.println("Item Code : "+itemCode);
            System.out.println("Quantity : "+quantity);
            System.out.println("Rate per Item : Rs. "+ratePerItem);
            System.out.println("Your Total Bill is : Rs. "+bill);

        }
    }
}