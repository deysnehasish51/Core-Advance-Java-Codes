#include<stdio.h>

int main()
{
    int a,b,c,d,e,f,n1,n2,n3,n4,n5;

    scanf("%d %d %d %d %d", &a,&b,&c,&d,&e);

    if(a%2!=0)
    {
        n1=a;
    }
    else{
        n1=0;
    }
    if(b%2!=0)
    {
        n2=b;
    }
    else{
        n2=0;
    }
    if(c%2!=0)
    {
        n3=c;
    }
    else{
        n3=0;
    }
    if(d%2!=0)
    {
        n4=d;
    }
    else{
        n4=0;
    }
    if(e%2!=0)
    {
        n5=e;
    }
    else{
        n5=0;
    }

    int sum=n1+n2+n3+n4+n5;

    printf("Sum of Odd Numbers = %d",sum);

    return 0;
}