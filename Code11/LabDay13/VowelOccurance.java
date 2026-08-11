class VowelOccurance
{
    public static void main(String []args)
    {
    String str="Snehasish Dey";
    int count=0,count1=0,count2=0,count3=0,count4=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='A')
            {
                count++;
            }
            if(ch=='e'||ch=='E')
            {
                count1++;
            }
            if(ch=='i'||ch=='I')
            {
                count2++;
            }
            if(ch=='o'||ch=='O')
            {
                count3++;
            }
            if(ch=='U'||ch=='u')
            {
                count4++;
            }
        }
        System.out.println("Occurance of A / a : "+count);
        System.out.println("Occurance of E / e : "+count1);
        System.out.println("Occurance of I / i : "+count2);
        System.out.println("Occurance of O / o : "+count3);
        System.out.println("Occurance of U / u : "+count4);
    }
}