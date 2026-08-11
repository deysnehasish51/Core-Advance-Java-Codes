public class Fibonacci {

    public int fibRecursive(int n){

        if(n==0)
        {
            return 0;
        }
        if(n==1|| n==2)
        {
            return  1;
        }
        return  fibRecursive(n-1)+fibRecursive(n-2);

    }
    public static void main(String[] args) {
        
        Fibonacci fib = new Fibonacci();

        int range=10;

        for(int i=0;i<range;i++)
        {
            System.out.println(fib.fibRecursive(i));
        }
    }
}
