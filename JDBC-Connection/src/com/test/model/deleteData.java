package com.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleteData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "shubham");
			
			Statement smt = con.createStatement();
			
			String sql = "DELETE FROM student WHERE sid = 2";
			
			smt.executeUpdate(sql);
			System.out.println("Delete your data");
			
			con.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
