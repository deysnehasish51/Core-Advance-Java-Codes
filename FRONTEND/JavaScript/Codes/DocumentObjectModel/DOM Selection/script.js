const nameInput= document.getElementById("inp");
const emailInput=document.getElementById("em");
const passwordInput=document.getElementById("pwd");
const nameError=document.getElementById('nameError');
const emailError=document.getElementById('emailError');
const pwdError=document.getElementById('pwdError');

function check(a,b,c)
{
    let x = nameInput.value.length

    if(x<b)
    {
        c.textContent=`${a} is too Short, Enter Minimum ${b} Characters.`
    }
    else{
        nameError.textContent="";
    }
}
nameInput.addEventListener('input',()=>check(nameInput,6,nameError));
passwordInput.addEventListener('input',()=>check(passwordInput,8,pwdError));
emailInput.addEventListener('input',()=>checkName(emailInput,emailInput.contains("@"),emailError));