package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test01_ConnectToOracle {
	
	public static void main(String[] args) {

        try {
        	
        	// 1. load the driver 
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver is loaded");

            String url = "jdbc:oracle:thin:@//localhost:1521/FREE";
            String userName = "C##Sanju";
            String password = "Sanju2002";
            
            // 2. Establishing connection
            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection is Established");

            String q = "SELECT * FROM emp";

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            ResultSet rs = stmt.executeQuery(q);

            // Process Result
            while (rs.next()) {
                int empId = rs.getInt("empno");
                String empName = rs.getString("ename");
                double salary = rs.getDouble("sal");

                System.out.println(empId + "  " + empName + "  " + salary);
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERRRR----> " + e);
        }
    }
}