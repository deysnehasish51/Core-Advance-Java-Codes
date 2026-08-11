#include<stdio.h>

int main()
{
    int a,b;
    char op;

    scanf("%d %c %d",&a,&op,&b);

    op=='+'?printf("Result = %d",a+b):op=='-'?printf("Result = %d ",a-b):op=='*'?printf("Result = %d",a*b):op=='/'?printf("Result = %d",a/b):b==0?printf("Division by Zero not Allowed."):printf("Invalid Operator.");

    
    return 0;
}