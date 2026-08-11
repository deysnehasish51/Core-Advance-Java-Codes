let num=123321;

let originalNum=num;
let rev=0;
let rem;

while(num>0)
{
    rem=num%10;
    rev=rev*10+rem;
    num=Math.floor(num/10);
}

if(rev==originalNum)
{
    console.log("Palindrome");
}
else
{
    console.log("Not a Palindrome");
}

