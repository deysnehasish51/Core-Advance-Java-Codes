let num =153;
let rem,sum=0;
let originalNum=num;

while(num!=0)
{
    rem=num%10;
    sum=sum+(rem*rem*rem);
    num=Math.floor(num/10);
}

if(sum==originalNum)
{
    console.log(`${originalNum} is an Amstrong Number`)
}
else
{
    console.log(`${originalNum} is not an Amstrong Number`)
}