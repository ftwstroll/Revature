package com.jdbc.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbc {

	public static void main(String[] args) {

		

		Connection connection = null;
		try {
			// Step - 1 - Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");

		
			// Step - 2 - Open Connection( url , user name ,password)
			String url = "jdbc:mysql://localhost:3306/rocp-1";
			String username = "root";
			String password = "CSE3330";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection sucessful");
			
			//Step - 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="insert into player(id, name, age, city, gender, teamName) VALUES (200,\"h. Diaz\",20, \"NY\",\"m\",\"bookies\")";
			System.out.println("Statement Created");
			
			//Step - 4 - Execute Query
			statement.executeUpdate(sql);
			System.out.println("Query executed");
			
			//Step - 5 - Process Results

			System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step - 6 - Close Connection 
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
