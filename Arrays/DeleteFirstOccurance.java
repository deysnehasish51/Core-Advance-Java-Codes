import java.util.Arrays;

public class DeleteFirstOccurance {
   public static void main(String[] args) {
       int key=5;

       int[] arr={1,2,3,4,5,6,5,7,8};

       int index=-1;
           for(int i=0;i<arr.length;i++)
            {
                if(key==arr[i])
                    {
                        index=i;
                        break;
                    }
                }
    if(index!=-1){
        int[] res = new int[arr.length-1];
        int rIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            if(index!=i)
            {
                res[rIndex++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
    else{
        System.out.println("Element Not Found...");
    }
       
   } 
}
