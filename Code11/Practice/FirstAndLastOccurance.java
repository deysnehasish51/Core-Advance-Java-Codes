public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,4,5,3,5,2,4,1};
        int key=5;

        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println(i);
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(key==arr[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
}
