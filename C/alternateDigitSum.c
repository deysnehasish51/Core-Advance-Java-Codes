#include<stdio.h>

int main()
{
    int n,rem,pos=1;
    printf("Enter a Number ");
    scanf("%d",&n);
    int evenSum=0,oddSum=0;

    while(n>0)
    {
        rem=n%10;

        if(pos%2==1)
        {
            oddSum+=rem;
        }
        else
        {
            evenSum+=rem;
        }
        n=n/10;
        pos++;
    }
    if(evenSum==oddSum)
    {
        printf("Alternative digit sum is same");  
    }
    else{
        printf("Alternative digit sum is not same");
    }

    return 0;
}