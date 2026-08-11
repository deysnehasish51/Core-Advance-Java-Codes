package com.nit.methodOverriding;


class MainStudent{
	String studentType;
	String assignmentName;
	public MainStudent(String studentType, String assignmentName) {
		this.studentType = studentType;
		this.assignmentName = assignmentName;
	}
	
	public void submitAssingment()
	{
		System.out.println("");
	}
}
class Undergraduate extends MainStudent{

	public Undergraduate(String studentType, String assignmentName) {
		super(studentType, assignmentName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void submitAssingment()
	{
		System.out.println(studentType+" student submitted assingmet: "+assignmentName);
	}
	
}
class Postgraduate extends MainStudent{

	public Postgraduate(String studentType, String assignmentName) {
		super(studentType, assignmentName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void submitAssingment()
	{
		System.out.println(studentType+" student submitted assingmet: "+assignmentName);
	}
	
}
public class TestStudent {

	public static void main(String[] args) {
		
		Undergraduate undergraduate = new Undergraduate("Undergraduate", "Data Structures");
		Postgraduate postgraduate = new Postgraduate("Postgraduate","Machine Learning");
		undergraduate.submitAssingment();
		postgraduate.submitAssingment();

	}

}
