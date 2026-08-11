class Car
{
    String barnd;
    String color;
    double price;

    public void displayDetails()
    {
        System.out.println("Barnd : "+barnd+", Color : "+color+", Price : "+price);
    }
    public static void main(String []args)
    {
        Car c1= new Car();
        c1.barnd="Tesla";
        c1.color="Red";
        c1.price=6800000.0;

        c1.displayDetails();

        Car c2= new Car();
        c2.barnd="BMW";
        c2.color="Black";
        c2.price=8000000.0;

        c2.displayDetails();

        Car c3= new Car();
        c3.barnd="Toyota";
        c3.color="Blue";
        c3.price=3000000.0;

        c3.displayDetails();
    }
}