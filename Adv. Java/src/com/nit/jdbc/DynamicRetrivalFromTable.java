package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicRetrivalFromTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");

	        Connection con = DriverManager.getConnection(
	                "jdbc:oracle:thin:@localhost:1521:FREE",
	                "C##Sanju",
	                "Sanju2002"
	        );

	        Statement stmt = con.createStatement();


	        ResultSet rs = stmt.executeQuery("SELECT * FROM Course");
	        
	        ResultSetMetaData rsmd= rs.getMetaData();
	        int colCount=rsmd.getColumnCount();
	        
	        for(int i=1;i<=colCount;i++) {
        		System.out.printf("%-15s",rsmd.getColumnName(i));
        	}
	        System.out.println();
	        System.out.println("===========================================");
	        while(rs.next()) {
	        	for(int i=1;i<=colCount;i++) {
	        		System.out.printf("%-15s",rs.getString(i));
	        	}
	        	System.out.println();
	        }
	        
	        
	        stmt.close();
	        con.close();

	}

}