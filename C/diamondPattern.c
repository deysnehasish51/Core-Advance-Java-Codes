#include<stdio.h>

int main()
{
    int n=5;

    int N=n*2-1;
    int x=n,y=n;

    for(int i=1;i<=N;i++)
    {
        for(int j=1;j<=N;j++)
        {
            if(j<x||j>y)
            {
                printf("%3c",' ');
            }
            else{
                printf("%3c",'*');
            }
        }
        if(i<n)
        {
            x--;
            y++;
        }
        else{
            x++;
            y--;
        }
        printf("\n");

    }
    return 0;
}
