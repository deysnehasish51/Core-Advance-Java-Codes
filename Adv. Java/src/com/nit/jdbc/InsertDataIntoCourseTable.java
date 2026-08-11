package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataIntoCourseTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("oracle.jdbc.driver.OracleDriver");

	        Connection con = DriverManager.getConnection(
	                "jdbc:oracle:thin:@localhost:1521:FREE",
	                "snehasishdb",
	                "Sanju2002"
	        );

	        Statement stmt = con.createStatement();


	        stmt.executeUpdate("INSERT INTO Course(course_id,course_name,course_fee) VALUES (1,'Core Java',3500)");
	        stmt.executeUpdate("INSERT INTO Course(course_id,course_name,course_fee) VALUES (2,'Adv Java',4500)");
	        stmt.executeUpdate("INSERT INTO Course(course_id,course_name,course_fee) VALUES (3,'HTML, CSS, JS',2000)");
	        stmt.executeUpdate("INSERT INTO Course(course_id,course_name,course_fee) VALUES (4,'Python',3000)");

	        System.out.println("4 rows Inserted into Course Table");
	        stmt.close();
	        con.close();

	}

}
