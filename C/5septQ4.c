#include<stdio.h>
#include<math.h>
int main()
{
    float principal,rate,time;
    char ch;

    scanf("%f %f %f %c",&principal,&rate,&time,&ch);

    ch=='s'?printf("Simple Interest = %.2f",(principal*rate*time)/100):ch=='c'?printf("Compound Interest = %.2f",principal*(pow(1+rate/100,time)-1)):printf("Invalid Input");
    return 0;

}