#include<stdio.h>

main()
{
    int a,b;
    printf("Enter two numbers: ");
    scanf("%d%d",&a,&b);

    a>b&&printf("A is greater than B\n")||printf("B is greater than A\n");
}