class ZigZagMerging{
public static void main(String[] args)
{
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {5,6,7,8};

    int[] arr= new int[arr1.length+arr2.length];
    int index=0;
    for(int i:arr1)
    {
        arr[index]=i;
        index+=2;
    }
    index=1;
    for(int i:arr2)
    {
        arr[index]=i;
        index+=2;
    }

    for(int i :arr)
    {
        System.out.print(i+" ");
    }
}
}