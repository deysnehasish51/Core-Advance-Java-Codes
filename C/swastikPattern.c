#include<stdio.h>

int main()
{
    int n=7;
    int N=n/2+1;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j==1&&i<=4||i==N||j==N||i==1&&j>=4||j==n&&i>=4||i==7&&j<=4)
            {
                printf("* ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }

    return 0;
}