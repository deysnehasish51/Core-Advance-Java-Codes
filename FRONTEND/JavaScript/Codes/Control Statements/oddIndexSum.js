let arr = [1,2,3,4,5]

    let len=arr.length
    let product=1

    for(let i=0;i<len;i++)
    {
        if(i%2!=0)
        {
            product*=arr[i];
        }
    }
    console.log("Odd index Places Sum : "+product)
    pro=1
    for(let i in arr)
    {
        if(i%2!=0)
        {
            product*=arr[i];
        }
    }