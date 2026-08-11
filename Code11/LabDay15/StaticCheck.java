class StaticCheck
{
    static byte var1;
    static short var2
    static int var3;
    static long var4;
    static float var5;
    static double var6;
    static char var7;
    static boolean var8;
    static String var9;

    public static void main(String []args)
    {
        System.out.println("This is the Value of Byte : "+var1);
        System.out.println("This is the Value of Short : "+var2);
        System.out.println("This is the Value of Int : "+var3);
        System.out.println("This is the Value of Long : "+var4);
        System.out.println("This is the Value of Float : "+var5);
        System.out.println("This is the Value of Double : "+var6);
        System.out.println("This is the Value of Boolean : "+var7);
        System.out.println("This is the Value of Char : "+var8);
        System.out.println("This is the Value of String : "+var9);

 /*
 Default Values : value provided to static variables and instance variables by the compiler if the Programmer 
 doesnot initialize them during their declaration.
    Default Values are as follows :
    byte       -->0
    short      -->0
    int        -->0
    long       -->0

    float      -->0.0
    double     -->0.0

    char       -->'\u0000'

    boolean    -->false

    String     -->null
  */

    }
}