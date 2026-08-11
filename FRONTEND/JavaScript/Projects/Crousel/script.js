
let children = document.getElementById('circles').querySelectorAll('.circle');
console.log(children)
let arr =["m1.jpg","m2.jpg","m3.jpg","h1.jpg","hero_img1.webp","hero_img2.webp","hero_img3.webp","rider_img.webp"]

let img=document.getElementById('img')

let currentIndex=0;

img.src=arr[currentIndex];
children[currentIndex].style.backgroundColor="blue";
let left=document.getElementById('btn-left');

left.addEventListener("click",(e)=>
{
children.forEach(function(e)
{
    e.style.backgroundColor="white";
});
    currentIndex--;
    if(currentIndex<0)
    {
        currentIndex=arr.length-1;
    }
    img.src=arr[currentIndex];
    children[currentIndex].style.backgroundColor="blue";
});

let right=document.getElementById('btn-right');

right.addEventListener("click",(e)=>
{
children.forEach(function(e)
{
    e.style.backgroundColor="white";
});
    currentIndex++;
    if(currentIndex>arr.length-1)
    {
        currentIndex=0;
    }
    img.src=arr[currentIndex];
    children[currentIndex].style.backgroundColor="blue";
});
