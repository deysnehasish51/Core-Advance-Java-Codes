#include<stdio.h>

int main()
{
    int a,b,c;

    scanf("%d %d %d",&a,&b,&c);

    a>b&&a>c?printf("Maximum = %d",a):b>a&&b>c?printf("Maximum = %d",b):c>a&&c>a?printf("Maximum = %d",c):printf("All are Equal");

    return 0;
}