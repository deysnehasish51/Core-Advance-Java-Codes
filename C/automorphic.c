#include<stdio.h>

int main()
{
    int n,count=0;
    scanf("%d",&n);
    int m=n;

    int power=1;
    while(n!=0)
    {
        count++;
        n=n/10;
    }
    for(int i=1;i<=count;i++)
    {
        power=power*10;
    }

    if((m*m)%power==m)
    {
        printf("%d is an automorphic number.",m);
    }
    else
    {
        printf("%d is not an automorphic number.",m);
    }
    return 0;
}