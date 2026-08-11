#include<stdio.h>
#include<math.h>

int main()
{
    int n,p,i=100,sum;

    scanf("%d",&n);
    if(n<0)
    {
        printf("Negative value not allowed.");
    }
    else
    {
    printf("Armstrong numbers between %d and %d are:\n",i,n);

    while(i<=n)
    {
        p=i;
        sum=0;
        int rem;
        while(p!=0)
        {
             rem=p%10;
            sum=sum+(rem*rem*rem);
            p=p/10;
        }
        if(sum==i)
        {
            printf("%d\n",i);
        }
        i++;
    }
    }

    
    return 0;
}