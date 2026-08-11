let name=prompt("Enter any Name")

let i=name.length-1;
let rev="";
while(i>=0)
{
    rev=rev+name.charAt(i);
    i--;
}
alert(`Reverse of Name is ${rev}`);

