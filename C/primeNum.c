#include<stdio.h>

int main()
{
    int n;

    scanf("%d",&n);

    if(n<0)
    {
        printf("Negative value not allowed.");
        return 0;
    }
    printf("Prime numbers between 1 and %d are:\n",n);
    for(int i=1;i<=n;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count++;
            }
        }
    if(count==2)
        {
            printf("%d\n",i);
        }
    }
    

    return 0;
}