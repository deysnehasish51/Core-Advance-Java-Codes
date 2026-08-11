//write a function that accepts name,age,email of person as a paramerters and add them in an exitsting array.
let students=[];

let student ={name:"Snehasish",age:23,email:"deysnehasish@gmail",addStudent:function(){students.push(student)}}
let student1 ={name:"Snehasish",age:23,email:"deysnehasish@gmail",addStudent:function(){students.push(student1)}}


student.addStudent();
student1.addStudent();
console.log(students);