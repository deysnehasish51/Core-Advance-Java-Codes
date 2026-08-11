#include<stdio.h>

int main()
{
    int n=5,num=1;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i%2==0)
            {
                printf("%4d",--num);
            }
            else 
            {
                printf("%4d",num++);                
            }           
        }
        num+=5;
        printf("\n");
    }
    return 0;
}