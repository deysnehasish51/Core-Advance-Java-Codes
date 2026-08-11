#include<stdio.h>

int main()
{
    int n,m;
    scanf("%d %d",&n,&m);
    int num=1;

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(num%2!=0)
            {
                printf("%d\t",num);
            }
            num+=2;

        }
        printf("\n");
    }

    return 0;
}