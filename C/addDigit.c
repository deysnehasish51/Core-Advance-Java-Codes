#include<stdio.h>
int main()
{
    int n;

    printf("Enter a two digit number ");
    scanf("%2d",&n);

    int r=n%10;
    int q=n/10;
    printf("%d",r+q);

    return 0;
}