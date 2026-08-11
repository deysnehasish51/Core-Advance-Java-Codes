package com.nit.functionalprogramming;

import java.util.function.Predicate;

class Student{
	String name;
	int courseCompleted;
	double rating;
	
	
	public Student(String name, int courseCompleted, double rating) {
		this.name = name;
		this.courseCompleted = courseCompleted;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourseCompleted() {
		return courseCompleted;
	}
	public void setCourseCompleted(int courseCompleted) {
		this.courseCompleted = courseCompleted;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
public class EducationPlatform {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student("David", 6, 4.6),
				new Student("Eve", 4, 4.9),
				new Student("Frank", 7, 4.4)
				};

		Predicate<Student> p1 = (student)->{if(student.getCourseCompleted()>=5) return true;else return false;};
		Predicate<Student> p2 = (student)->{if(student.getRating()>=4.5) return true;else return false;};
		
		Predicate<Student> isEligible=p1.and(p2);
		
		System.out.println("Eligible Mentors: ");
		for(int i=0;i<students.length;i++)
		{
			if(isEligible.test(students[i]))
			{
				System.out.println(students[i].getName());
			}
		}
	}

}
