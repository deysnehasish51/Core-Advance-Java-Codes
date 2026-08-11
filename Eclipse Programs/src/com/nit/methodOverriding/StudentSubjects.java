package com.nit.methodOverriding;

class Student{
	public void displaySubject()
	{
		System.out.println("No Subject Assigned");
	}
}
class ScienceStudent extends Student{
	@Override
	public void displaySubject()
	{
		System.out.println("Physics, Chemistry, Biology");
	}
}
class ArtsStudent extends Student{
	@Override
	public void displaySubject()
	{
		System.out.println("History, Literature,Geography");
	}
}
public class StudentSubjects {

	public static void main(String[] args) {
		Student s1 = new ScienceStudent();
		Student s2 = new ArtsStudent();
		
		s1.displaySubject();
		s2.displaySubject();
	}

}
