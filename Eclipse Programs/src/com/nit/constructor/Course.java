package com.nit.constructor;

public class Course {
	
	int courseId;
	String courseName;
	int duration;
	public Course() {
		this.courseId=0;
		this.courseName="N/A";
		this.duration=0;
	}
	public Course(int courseId,String courseName)
	{
		if(courseId>0)
		{
			this.courseId=courseId;
		}
		else {
			this.courseId=0;
		}
		
		if(!(courseName.equals("")))
		{
			this.courseName=courseName;
		}
		else {
			this.courseName="N/A";
		}
	}
	
	public Course(int courseId,String courseName,int duration)
	{
		if(courseId>0)
		{
			this.courseId=courseId;
		}
		else {
			this.courseId=0;
		}
		
		if(!(courseName.equals("")))
		{
			this.courseName=courseName;
		}
		else {
			this.courseName="N/A";
		}
		if(duration>0)
		{
			this.duration=duration;
		}
		else {
			this.duration=0;
			
		}
	}
	
	public void displayDetails()
	{
		System.out.println("Course ID : "+courseId+", Course Name : "+courseName+", Duration : "+duration+ " months");
	}
	public static void main(String[] args) {
		
		Course c1 = new Course();
		Course c2 = new Course(101,"Java");
		Course c3 = new Course(102,"Python",3);
		
		c1.displayDetails();
		c2.displayDetails();
		c3.displayDetails();
	}

}
