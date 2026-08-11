#include<stdio.h>

int main()
{
    int n;

    scanf("%d",&n);

    //We Can use Unicode of Rupee Siymbol also  /u20B9

    n<=60?printf("Safe Driving ! No Fine"):n>=61&&n<=100?printf("Overspeeding ! Fine = Rs. 500"):n>100?printf("Overspeeding ! Fine = Rs. 2000"):printf("Invalid Input");
    return 0;
}