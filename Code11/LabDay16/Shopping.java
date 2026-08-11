class Shopping
{
    double price;
    int quantity;

    public void calculateTotal()
    {
        double total=price*quantity;
        System.out.println("Total Price : "+total);
    }
    public static void main(String []args)
    {
        Shopping customer1 = new Shopping();
        customer1.price=300.0;
        customer1.quantity=20;
        customer1.calculateTotal();

    }
}

/* total variable is declared inside the method so it is a local 
variable , you can not access the local variable outside its scope 
so its gives error total cannot find symbol */