#include<stdio.h>

int main()
{
    int n;
 int count=0;


    while(1)
    {
        scanf("%d",&n);

        if(n%5!=0)
        {
            count++;
        }
    printf("Count = %d",count);

    }
    return 0;
}