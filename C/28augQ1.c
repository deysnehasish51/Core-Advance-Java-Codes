#include<stdio.h>

int main()
{

    int n,result;
    scanf("%3d",&n);

    result=(n%10)*100+(n/10%10)*10+(n/100);

    
    printf("%d",result);
    return 0;
}