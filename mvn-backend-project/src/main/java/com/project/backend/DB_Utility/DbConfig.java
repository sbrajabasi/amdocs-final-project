package com.project.backend.DB_Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

	private static Connection connection = null;
	
	private DbConfig() {
		
	}
	
	public static Connection getConection() {
		
		String url = "jdbc:mysql://localhost:3306/project_db";
		String username = "root";
		String password = "Sujit@07";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(connection == null) {			    
				connection = DriverManager.getConnection(url, username, password);
			}
			
			return connection;
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
