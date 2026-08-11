#include<stdio.h>

int main()
{
    int n=5;
    

    for(int i=0;i<n;i++)
    {
        char ch='A'+i;
        for(int j=0;j<n;j++)
        {
            printf("%3c",ch+j);

        }
        printf("\n");
    }
    return 0;
}