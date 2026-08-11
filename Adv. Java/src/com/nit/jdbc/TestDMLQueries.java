package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDMLQueries {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:FREE",
                "C##Sanju",
                "Sanju2002"
        );

        Statement stmt = con.createStatement();

        
        try {
            stmt.execute("DROP TABLE Student CASCADE CONSTRAINTS");
        } catch (Exception e) {
            e.getMessage();
        }

        try {
            stmt.execute("DROP TABLE Course CASCADE CONSTRAINTS");
        } catch (Exception e) {
            e.getMessage();
        }

        String testCourseTable =
                "CREATE TABLE TestCourse (" +
                "course_id NUMBER(10) PRIMARY KEY, " +
                "course_name VARCHAR2(20), " +
                "course_fee NUMBER(10)" +
                ")";

        stmt.execute(testCourseTable);

        System.out.println("Tables created successfully");
        
        stmt.executeUpdate("INSERT INTO TestCourse(course_id,course_name,course_fee) VALUES (1,'C1',3500)");
        stmt.executeUpdate("INSERT INTO TestCourse(course_id,course_name,course_fee) VALUES (2,'C2',4500)");
        stmt.executeUpdate("INSERT INTO TestCourse(course_id,course_name,course_fee) VALUES (3,'C3',2000)");
        stmt.executeUpdate("INSERT INTO TestCourse(course_id,course_name,course_fee) VALUES (4,'C5',3000)");

        System.out.println("4 rows Inserted into Course Table");
        
        stmt.executeUpdate("UPDATE TestCourse SET course_name='Core Java' WHERE course_id=1");
        stmt.executeUpdate("UPDATE TestCourse SET course_fee=4600 WHERE course_id=4");
        stmt.executeUpdate("UPDATE TestCourse SET course_name='Devops' WHERE course_id=3");
        stmt.executeUpdate("UPDATE TestCourse SET course_name='Adv. Java' WHERE course_id=2");
        stmt.close();
        con.close();

	}

}
