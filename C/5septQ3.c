#include<stdio.h>

int main()
{
    float n;

    scanf("%f",&n);

    n>0&&n<=100?printf("Bill = %.2f",n*1.5):n>=101&&n<=300?printf("Bill = %.2f",(100*1.5)+(n-100)*2):n>300?printf("Bill = %.2f",(100*1.5)+(200*2)+((n-300)*3)):printf("Invalid Input");

    return 0;
}