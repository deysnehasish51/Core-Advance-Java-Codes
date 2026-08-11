public class Car{

    String carModel;
    String ownerName;
    double fuelLevel=12;

    public void Refueling(int litre)
    {
        this.fuelLevel+=litre;
        System.out.println("After Refueling Fuel Level : "+fuelLevel);
    }

    public void Drive(double distance)
    {
        double fuelConsume=distance/10.0;

        if(fuelConsume<fuelLevel)
        {
            this.fuelLevel-=fuelConsume;
        System.out.println("Fuel Level After Drive : "+fuelLevel);
        }
        else
        {
            System.out.println("Insufficient Fuel Level you Can not Reach Your Destination");
        }
    }

    public void displayDetails(String carModel,String ownerName)
    {
        this.carModel=carModel;
        this.ownerName=ownerName;

        System.out.println("---- Car & Fuel Details ----");
        System.out.println("Car Model : "+carModel);
        System.out.println("Owner Name : "+ownerName);
        System.out.println("Fuel Level Car : "+this.fuelLevel);
    }
    public static void main(String []args)
    {
        Car c1=new Car();
        c1.Refueling(20);
        c1.Drive(200);
        c1.displayDetails("BMW M5 Competition","Snehasish Dey");
    }
}