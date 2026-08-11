#include<stdio.h>

int main()
{
    int a,b;

    scanf("%d %d",&a,&b);

    a>b?printf("RCB Wins."):b>a?printf("RCB Wins."):printf("Invalid Output.");
    return 0;
}