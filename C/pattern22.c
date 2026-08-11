#include<stdio.h>

int main()
{
    int n=5;
    int num=1;

    for(int i=n;i>=1;i--)
    {
        for(int j=i;j>=1;j--)
        {
            printf("%3d ",num++);
        }
        printf("\n");
    }

    return 0;
}