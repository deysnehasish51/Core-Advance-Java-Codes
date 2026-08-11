#include<stdio.h>

int main()
{
    int n=5;
    char ch='A';

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            printf("%4c",ch++);
        }
        ch-=4;
        printf("\n");
    }
    return 0;
}