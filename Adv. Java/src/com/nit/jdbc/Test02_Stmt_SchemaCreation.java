package com.nit.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Test02_Stmt_SchemaCreation {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		
		//1. Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");
		
		//2. Establishing connection
		Connection con = 
			DriverManager.getConnection(
				"jdbc:oracle:thin:@//localhost:1521/FREE",
				"system", "Sanju2002");
		
		System.out.println("Connection is created");
		
		//3. Creating Statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement is created");
		
		//4. Executing queries
		stmt.execute("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");
		stmt.execute("CREATE USER snehasishdb IDENTIFIED BY Sanju2002");
		stmt.execute("GRANT connect, resource, unlimited tablespace to snehasishdb");
		
		System.out.println("User is created and DBA permissions are granted");
		
		//5. closing connections
		stmt.close();
		con.close();
		
	}
}