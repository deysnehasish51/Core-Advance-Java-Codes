package com.nit.jdbc.LabTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentRegisterAndLogin {
	
	public static void userLogin(Statement stmt,int no,String user) throws SQLException {
		  ResultSet rs = stmt.executeQuery("select * from student where rollno="+no+" and name='"+user+"'");
			if(rs.next()) {
				System.out.println("Login DONE");
			}else{
				System.out.println("Login failed try again");
			}
			rs.close();

	}
	

		public static void userRegister(Statement stmt) throws SQLException {
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter your rollNo: ");
		    int rollNo = Integer.parseInt(scanner.nextLine());

		    System.out.print("Enter your first name: ");
		    String fname = scanner.nextLine();

		    System.out.print("Enter your last name: ");
		    String lname = scanner.nextLine();
		    
		    System.out.print("Enter your full name: ");
		    String fullName = scanner.nextLine();

		    System.out.print("Enter your percentage: ");
		    double percentage = Double.parseDouble(scanner.nextLine());

		    System.out.print("Enter your mail id: ");
		    String mailid = scanner.nextLine();

		    System.out.print("Enter your phone number: ");
		    String phno = scanner.nextLine();

		    String sql = """
		    	    INSERT INTO student (rollno, fname, lname, name, percentage, mailid, phno)
		    	    VALUES (%d, '%s', '%s', '%s', %.2f, '%s', '%s')
		    	    """.formatted(rollNo, fname, lname, fullName, percentage, mailid, phno);

		    stmt.executeUpdate(sql);
		    System.out.println(" Student registered successfully");
		    scanner.close();
		}
	
		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:FREE","snehasishdb","Sanju2002");
				Statement stmt =con.createStatement();
				){

			String option = "N";
			do {
				Scanner sc = new Scanner(System.in);
				userRegister(stmt);
				System.out.println("\n Do you want to continue (Y/N) ?");
				option=sc.nextLine();
				
			} while (option.equalsIgnoreCase("Y"));
		
			System.out.println("Thank You visit again");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}


