
import java.util.Arrays;

public class LeftShiftArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        
        int n=3;
        while(n!=0)
        {
        int temp=arr[0];

        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=temp;

        
        n--;
    }
    System.out.println(Arrays.toString(arr));

    }
}
