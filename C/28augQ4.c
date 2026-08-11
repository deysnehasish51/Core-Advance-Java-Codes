#include<stdio.h>

int main()
{
    int a,b;

    scanf("%d %d",&a,&b);

    a%10==b%10 && printf("Last digit is same") || printf("Last digit is not Same");
    return 0;
}