// function greet(n)
// {
//     console.log(`Hello ${n}`)
// }
// greet("Snehasish")

//create a function that accepts two parameter and prints their sum in console.

// function add(a,b)
// {
//     console.log(`Sum of ${a} & ${b} is `+(a+b))
// }
// add(5,4);

//write a function that accepts two parameters and returns their product.

// function mul(a,b)
// {
//     return a*b;
// }
// let res=mul(5,2);
// console.log(res);

//optional parameter and default parameters

function sub (a,b,c=5) //c is optional parameter
{
    console.log(a-b,c)
}

sub(5,3)
sub(1,2,3)