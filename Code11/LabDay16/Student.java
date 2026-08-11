class Student
{
    String name;
    int id;

    public static String collegeName="Naresh IT";

    public static void main(String []args)
    {
        Student std1 =new Student();

        std1.name="Snehasish Dey";
        std1.id=101;
        System.out.println("College Name : "+collegeName);
        System.out.println("Name : "+std1.name);
        System.out.println("Student ID : "+std1.id);

        Student std2 =new Student();

        std2.name="Sanskar Alok";
        std2.collegeName="NIT";
        std2.id=102;
        System.out.println("College Name : "+collegeName);
        System.out.println("Name : "+std2.name);
        System.out.println("Student ID : "+std2.id);

        Student std3 =new Student();
        std3.name="Bibhujeet Samal";
        std3.id=103;
        System.out.println("College Name : "+collegeName);
        System.out.println("Name : "+std3.name);
        System.out.println("Student ID : "+std3.id);
    }
}

/*Yes , when you store the college name as static when you 
update it using any one object thorughout the program it will 
change for all the objects.*/

/*static variable is basically we use if variable value is same 
for all the object if you chage it using one object it will change for all the objects */

