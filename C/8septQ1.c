#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);

    n>0&&n<1000?printf("Total Amount = %d",n):n>=1000&&n<5000?printf("Total Amount = %d",n-(n*5/100)):n>=5000?printf("Total Amount = %d",n-(n*10/100)):printf("Invalid Input");

    return 0;
}