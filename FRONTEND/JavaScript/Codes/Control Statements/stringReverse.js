let str="Snehasish"
let len = str.length
let rev=""
for(let i=len-1;i>=0;i--)
{
   rev=rev+ str.charAt(i);
}
console.log(`Reverse of String : ${rev}`)