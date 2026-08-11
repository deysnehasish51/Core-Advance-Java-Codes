
public class MergingTwoArrays{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,4,6,7};

        int[] arr = new int[arr1.length+arr2.length];
        int index=0;
        for(int i:arr1)
        {
            arr[index]=i;
            index++;
        }
        for(int i: arr2)
        {
            arr[index]=i;
            index++;
        }

        for(int i:arr)
        {
            System.out.print(i +" ");
        }
    }
}