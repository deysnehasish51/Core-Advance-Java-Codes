#include<stdio.h>

int main()
{
    int num,i=1,num1=0,num2=1,result;

    scanf("%d",&num);

    while (i<=num)
    {
        printf("%d ",num1);
        result=num1+num2;
        num1=num2;
        num2=result;
        i++;
    }

    return 0;
}