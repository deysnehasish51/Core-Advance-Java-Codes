package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreationOnDB {

    public static void main(String[] args) throws ClassNotFoundException,SQLException {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:FREE",
                "snehasishdb",
                "Sanju2002"
        );

        Statement stmt = con.createStatement();

        // Drop tables if they already exist
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

        String courseTable =
                "CREATE TABLE Course (" +
                "course_id NUMBER(10) PRIMARY KEY, " +
                "course_name VARCHAR2(20), " +
                "course_fee NUMBER(10)" +
                ")";

        String studentTable =
                "CREATE TABLE Student (" +
                "student_id NUMBER(10) PRIMARY KEY, " +
                "student_name VARCHAR2(20) NOT NULL, " +
                "course_id NUMBER(10), " +
                "course_fee NUMBER(10), " +
                "CONSTRAINT fk_course FOREIGN KEY (course_id) " +
                "REFERENCES Course(course_id)" +
                ")";

        stmt.execute(courseTable);
        stmt.execute(studentTable);

        System.out.println("Tables created successfully");

        stmt.close();
        con.close();
    }
}
