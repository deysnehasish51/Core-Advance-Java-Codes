public class Calculator
{
    public static void add()
    {
        int num1=5;
        int num2=10;

        System.out.println("Sum : "+(num1+num2));
    }

    public static void main(String []args)
    {
        Calculator cal = new Calculator();
        cal.add();

        // System.out.println("Num 1 : "+num1);
    }
}