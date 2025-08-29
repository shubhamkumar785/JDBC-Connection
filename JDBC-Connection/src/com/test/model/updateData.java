package com.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class updateData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "shubham");
			
			Statement smt = con.createStatement();
			
			String sql = "UPDATE student SET NAME = 'shubham pathak' WHERE sid = 2";
			
			smt.executeUpdate(sql);
			System.out.println("Update your data");
			
			con.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
