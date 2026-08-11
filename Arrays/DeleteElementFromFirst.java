import java.util.Arrays;

public class DeleteElementFromFirst {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] newArr= new int[arr.length-1];
        int index=0;
        for(int i=1;i<arr.length;i++)
        {
            newArr[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
