let a=2,b=3;
let sum=a+b;

console.log("The sum of a and b is: " + sum);

console.log(a+b,a-b,a*b,a/b,a%b,a**b);

a=2,b='2';

console.log(a==b);//ture
console.log(a===b);//false it also compares data type
console.log(a!=b);//false
console.log(a!==b);//true
console.log(a>b);//false
console.log(a<b);//true
console.log(a>=b);//false
console.log(a<=b);//true

let x=10,y=20;
let z=++x+x--+--y+y++;

console.log(x,y,z);

console.log(5+'3');//53
console.log('5'+3);//53
console.log('5'-3);//2
console.log('5'*3);//15
console.log('5'/3);//1.6666666666666667
console.log('5'%3);//2
console.log('5'**3);//125
console.log(5+ +'4');//9 ( unary plus converts string to number )
console.log(5+ -'4');//1 ( unary minus converts string to number and negates it )

console.log(5-"Snehasish");//NaN