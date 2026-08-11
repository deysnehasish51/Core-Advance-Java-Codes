#include<stdio.h>

int main()
{
    int a;
    printf("Enter a Number ");
    scanf("%d",&a);
    //int result=(a/10  + (a%10/5))10;
    a%10>=5&&printf("%d",(a/10+1)*10) ||printf("%d",(a/10)*10);
    
    return 0;
}