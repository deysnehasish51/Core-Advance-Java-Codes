package com.nit.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class StatementUsingProperties {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
		Properties props = new Properties();
		
		props.load(new FileReader("driverinfo.properties"));
		//String driver= props.getProperty("DRIVER");
		String url = props.getProperty("URL");
		String username = props.getProperty("USERNAME");
		String password = props.getProperty("PASSWORD");
		String query = props.getProperty("QUERY");
		
		try(
				Connection con = DriverManager.getConnection(url,username,password);
				Statement stmt = con.createStatement();
				){
				Scanner sc = new Scanner(System.in);
				String option = "N";
				do {
					System.out.println("Enter Course ID: ");
					int courseId=Integer.parseInt(sc.nextLine());
					
					System.out.println("Enter Course Name: ");
					String courseName = sc.nextLine();
					
					System.out.println("Enter the Course Fee");
					int courseFee=Integer.parseInt(sc.nextLine());
					
					stmt.executeUpdate(query.formatted(courseId,courseName,courseFee));
					
					System.out.println("\n Do you want to continue (Y/N) ?");
					option=sc.nextLine();
					
				} while (option.equalsIgnoreCase("Y"));
			
				System.out.println("Thank You visit again");
		}catch (SQLException e) {
			e.printStackTrace();
		}
				

	}

}
