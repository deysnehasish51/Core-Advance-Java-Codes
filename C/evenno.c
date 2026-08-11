#include<stdio.h>

int main()
{
    int n,i=1,sum=0;

    scanf("%d",&n);

    start:
    if(i<n)
    {
        if(i%2!=0)
        {
            sum=sum+i;
            
        }
        i++;
        goto start;
    }
        printf("%d\n",sum);

    return 0;
}