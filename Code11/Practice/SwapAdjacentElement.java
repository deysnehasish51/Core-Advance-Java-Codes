public class SwapAdjacentElement {
    public static void main(String[] args) {
        String[] arr={"a1","a2","b1","b2"};

        for(int i=0;i<arr.length;i+=2)
        {
            String temp=arr[i];

            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(String i :arr)
        {
            System.out.print(i+" ");
        }
    }
}
