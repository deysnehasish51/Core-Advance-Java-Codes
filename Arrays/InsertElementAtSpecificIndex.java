import java.util.Arrays;

public class InsertElementAtSpecificIndex {
    public static void main(String[] args) {
        int[] arr={5,6,6,8,8,9};

        int element=7;
        int index=3;
        if(index<0&&index>arr.length-1)
        {
            System.out.println("Invalid Index");
        }
        else{
            int[] newArr= new int[arr.length+1];

            for(int i=0;i<arr.length;i++)
            {
                newArr[i]=arr[i];
            }
            for(int i=newArr.length-1;i>0;i--)
            {
                newArr[i]=arr[i-1];
            }
            newArr[index]=element;
            System.out.println(Arrays.toString(newArr));
        }
    }
}
