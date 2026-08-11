let myChoice=+prompt("Enter a myChoiceber between 1 to 10")

let systemChoice=Math.round(Math.random()*10+1);

if(myChoice>=1&&myChoice<=10)
{
if(myChoice==systemChoice)
{
    alert("You Won ....")
}
else if(myChoice>systemChoice)
{
    alert(`${myChoice} is greater that ${systemChoice}`)
}
else if(myChoice<systemChoice)
{
    alert(`${myChoice} is less that ${systemChoice}`)
}
}
else{
    alert("Enter a myChoiceber between 1 to 10");
}
