public class Student
{
    int studentId;
    String name;
    int totalMark=320;

    public void addMarks(int mark)
    {
        if(mark<=100&&mark>=0)
        {
            this.totalMark+=mark;
            System.out.println("Total Mark : "+totalMark);
        }
        else
        {
            System.out.println("Invalid Mark");
        }
    }

    public void deductMark(int mark)
    {
        if(mark<=100&&mark>=0)
        {
            this.totalMark-=mark;
            System.out.println("Total Mark : "+totalMark);
        }
        else
        {
            System.out.println("Invalid Mark");
        }
    }
    public void displayDetails(String name,int studentId)
    {
        this.name=name;
        this.studentId=studentId;
        System.out.println("--- Student Details ---");

        System.out.println("Student Name : "+name);
        System.out.println("Student ID : "+studentId);
        System.out.println("Total Marks : "+this.totalMark);
    }
    public static void main(String args[])
    {
        Student std1 = new Student();

        std1.addMarks(67);
        // std1.deductMark(79);
        std1.displayDetails("Snehasish",31);

        Student std2 = new Student();

        std2.addMarks(87);
        // std2.deductMark(69);
        std2.displayDetails("Sanju",34);
    }
}