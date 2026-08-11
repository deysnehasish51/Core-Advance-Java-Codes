public class PallindromeNumber {
    
    public static int checkPalindrome(int n)
    {
        int rev=0;

        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return  rev;
    }
    public static void main(String[] args) {
        
        int num=12321;

        int rev= checkPalindrome(num);

        if(num==rev)
        {
            System.out.println("Number is Pallindrome.");
        }
        else{
            System.out.println("Number is not a Pallindrome.");
        }

    }
}
