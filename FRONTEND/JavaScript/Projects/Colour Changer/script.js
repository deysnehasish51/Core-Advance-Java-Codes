//whenever we are usign onclick on html then we can use this 
// function changeColor(button)
// {
//     document.body.style.backgroundColor=button.id
// }

const btn=document.querySelectorAll('.btn');

btn.forEach((button)=>
{
    button.addEventListener("click",(e)=>
    {
        document.body.style.backgroundColor=e.target.id;       
    });

});