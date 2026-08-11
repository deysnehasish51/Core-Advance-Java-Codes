let num=5
let fact=1;

if(num<0)
{
for(let i=1;i<=num;i++)
{
    fact*=i;
}
console.log(`Factorial : ${fact}`)
}
else{
    console.log(`Factorial for Negative Number is not Possible`)
}
