package com.nit.IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private transient String name;
	private int age;
	private int rollNo;
	
	public Student(String name, int rollNo, int age) {
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", rollNo=" + rollNo + "]";
	}

	
}
public class Serielization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Serielization Starts");
		
		Student s1 = new Student("Snehasish", 31, 23);
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\deysn\\OneDrive\\Desktop\\Java NIT\\FileHandling\\abc.txt");
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(s1);
		}
		System.out.println("Serielization ends");
		
		System.out.println("Deserielization Starts");
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\deysn\\OneDrive\\Desktop\\Java NIT\\FileHandling\\abc.txt");
		
		try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			Object object = objectInputStream.readObject();
			Student student= (Student)object;
			System.out.println(student);
		}
		System.out.println("Deserielization ends");
			
		}
	}


