public class CountEvenOddVisit {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Even Number:"+evenCount );
        System.out.println("Odd Count: "+oddCount);
    }
}
