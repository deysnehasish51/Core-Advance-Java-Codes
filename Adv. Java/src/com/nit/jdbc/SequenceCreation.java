package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SequenceCreation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("oracle.jdbc.driver.OracleDriver");

	        Connection con = DriverManager.getConnection(
	                "jdbc:oracle:thin:@localhost:1521:FREE",
	                "C##Sanju",
	                "Sanju2002"
	        );

	        Statement stmt = con.createStatement();


	        String courseTableSequence = """
	        	    CREATE SEQUENCE course_id
	        	    START WITH 1
	        	    INCREMENT BY 1
	        	    """;

	        String studentTableSequence = """
	        	    CREATE SEQUENCE student_id
	        	    START WITH 1
	        	    INCREMENT BY 1
	        	    """;

	        stmt.execute(courseTableSequence);
	        stmt.execute(studentTableSequence);

	        System.out.println("Sequence Created");
	        stmt.close();
	        con.close();

	}

}
