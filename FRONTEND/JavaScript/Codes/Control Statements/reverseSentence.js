let str=prompt("Enter a Sentence").split(" ");

let i=0;
let answer="";

while(i<str.length)
{
let n=str[i];
let j=n.length-1;
let rev="";
while(j>=0)
{
    rev=rev+n.charAt(j);
    j--;
}
answer=answer+rev+" ";
i++;
}
alert(`The Reverse of Every word of string : ${answer}`)