#include<stdio.h>

int main()
{
    int n=5;
    int m=6;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=m/2;j++)
        {
            printf("%d %d ",i,j);

        }
        printf("\n");
    }

    return 0;
}