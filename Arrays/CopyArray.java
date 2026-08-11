import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20};

        int[] newArr= new int[arr.length];
        int index=0;
        for(int i:arr)
        {
            newArr[index]=i;
            index++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
