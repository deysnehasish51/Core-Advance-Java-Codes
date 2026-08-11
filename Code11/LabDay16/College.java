class College
{
    String name;
    static String collegeName="ABC College";

    public void displayDetails()
    {
        System.out.println("Name : "+name+", College Name : "+collegeName);
    }
    public static void main(String []args)
    {
        College s1= new College();
        s1.name="Snehasish Dey";

        s1.displayDetails();

        College s2= new College();
        s2.name="Snehasish Dey";
        s2.collegeName="XYZ College";

        s2.displayDetails();

        College s3= new College();
        s3.name="Snehasish Dey";

        s3.displayDetails();
    }
}