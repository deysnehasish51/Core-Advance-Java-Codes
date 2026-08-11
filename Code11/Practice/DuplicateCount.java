import java.util.Arrays;

public class DuplicateCount {
    public static void main(String[] args) {
        int arr[] = {101, 202, 303, 202, 101, 101};
        int index=0;
        int temp[]= new int[arr.length];

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[index]=arr[i];
                index++;
            }
        }

        temp[index++]=arr[arr.length-1];

        int uniqueArr[]=Arrays.copyOf(temp,index) ;
        System.out.println(Arrays.toString(uniqueArr));
    }
}
