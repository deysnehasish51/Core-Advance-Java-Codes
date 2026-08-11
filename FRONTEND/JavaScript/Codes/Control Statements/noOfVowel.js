let str="My name is Snehasish Dey";

let count=0,space=0;

let i=0;
let len=str.length;

while(i<len)
{
    let ch=str.charAt(i).toLowerCase();

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
        count++;
    }
    else if(ch==' ')
    {
        space++;
    }
    i++;
}

console.log("No of Vowels: "+count);
console.log("No of Spaces: "+space);