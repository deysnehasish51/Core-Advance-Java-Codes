#include<stdio.h>

int main()
{
    int n=5;
    int num=2;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
             if(num%2==0)
            {
                printf("%4d",num);
            }

        }
        num+=2;

        printf("\n");
    }

    return 0;
}