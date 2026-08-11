#include<stdio.h>

int main()
{
    int n=5;

    for(int i=n;i>=1;i--)
    {
        int num=i;
        for(int j=1;j<=n;j++)
        {
        printf("%4d",num);
        num+=5;

        }
        printf("\n");
    }

    return 0;
}