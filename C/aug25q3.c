#include<stdio.h>

int main()
{
    int n;
    printf("Enter a three digit number ");
    scanf("%3d",&n);
    int result=n/100+ n%10;
    printf("%d",result);

    return 0;
}