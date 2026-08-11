// Write a JavaScript program to check whether eligible for marraige or not eligiblity 21 years

/*let age=23;
if(age>=21)
{
    console.log("Eligible for Marraige");

}
else
{
    console.log("Not Eligible for Marraige");
}
    */

//Write a javascript program to check whether a number is positive, negative or zero

let num=+prompt("Enter a number:");
if(num>0)
{
    console.log(`${num} is a Positive Number`);
}
else if(num<0)
{
    console.log(`${num} is a Negative Number`);
}
else{
    console.log("The number is Zero");
}

//write a javascript program to print grade based on given score <35 fail,>90 is A,>70<90 is B,>35<70 is c

let score=+prompt("Enter your score:");
if(score>90)
{
    console.log("Grade A");
}
else if(score>70 && score<=90)
{
    console.log("Grade B");
}
else if(score>=35 && score<=70)
{
    console.log("Grade C");
}
else{
    console.log("Fail");
}

//write a js code user details based on user role using switch case admin,subadmin, testprep, user

let role=prompt("Enter your role:");
switch(role)
{
    case "admin": 
        console.log("You have full access");
        break;
    case "subadmin":
        console.log("You can create/delete courses");
        break;
    case "testprep":
        console.log("You can create/delete tests");
        break;
    case "user":
        console.log("You can consume content");
        break;
    default:
        console.log("Role not recognized");
        break;
}