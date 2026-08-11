let num=9868;
let sum;

while(num>9)
{
    sum=0;

    while(num>0)
    {
        sum+=num%10;
        num=Math.floor(num/10);
    }
    num=sum;
}

console.log(num);
