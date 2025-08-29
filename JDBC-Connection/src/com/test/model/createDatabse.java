package com.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createDatabse {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "shubham");
			
			Statement smt = con.createStatement();
			
//			String sql = "CREATE DATABASE IF NOT EXISTS shubham";
			String sql = "CREATE TABLE IF NOT EXISTS student ("
			           + "sid INT(3) PRIMARY KEY, "
			           + "name VARCHAR(200)"
			           + ")";

			
			smt.executeUpdate(sql);
			
			System.out.println("Table Created Succesfully");
			
			con.close();
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
