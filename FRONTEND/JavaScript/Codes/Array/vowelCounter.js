//write a js funcion to accept a string as parameter and return the number of vowels in the string.
// in case of string absence it should return an error "String is not present"

let str
let count=0
function vowelChecker(str)
{
    for(let i=0;i<str.length;i++)
    {
        let ch=str.charAt(i);
        if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
        {
            count++;
        }
    }
    if(typeof(str)!="string")
    {
       return console.log("String is Not Present")
    }
    else
    {
       return  console.log("No of Vowel in String : "+count)
    }
}

vowelChecker("Snehasish Dey");