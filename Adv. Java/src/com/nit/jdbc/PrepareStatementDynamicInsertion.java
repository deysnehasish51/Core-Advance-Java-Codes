package com.nit.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PrepareStatementDynamicInsertion {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties props = new Properties();
		
		props.load(new FileReader("driverinfo.properties"));
		

		String url = props.getProperty("URL");
		String username = props.getProperty("USERNAME");
		String password = props.getProperty("PASSWORD");
		String query = props.getProperty("QUERY");

	}

}
