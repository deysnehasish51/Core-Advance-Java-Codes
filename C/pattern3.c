#include<stdio.h>

int main()
{
    int n=5;
    int num=2;

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(num%2==0)
            {
                printf("%d\t",num);
            }
            num+=2;

        }
        printf("\n");
    }

    return 0;
}