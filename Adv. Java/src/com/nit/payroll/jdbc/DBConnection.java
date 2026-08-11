package com.nit.payroll.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection(){
		
		Connection con = null;
		try {
			Class.forName(DBConfig.DRIVER);
			con = DriverManager.getConnection(DBConfig.URL,DBConfig.USERNAME,DBConfig.PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		
		return con;
	}
	

}
