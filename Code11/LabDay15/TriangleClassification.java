class TriangleClassification
{
    public static void main(String []args)
    {
        int side1=23;
        int side2=23;
        int side3=23;

        if(side1==side2&&side1==side3&&side2==side3)
        {
            System.out.println("Equilateral Triangle.");
        }
        else if(side1==side2||side1==side2||side2==side3)
        {
            System.out.println("Isosceles Triangle.");
        }
        else
        {
            System.out.println("Scalene Triangle.");
        }
    }
}