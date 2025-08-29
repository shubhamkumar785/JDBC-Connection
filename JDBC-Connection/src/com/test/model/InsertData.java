package com.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "shubham");
			
			Statement smt = con.createStatement();
			
			String sql = "INSERT INTO student VALUES "
			           + "(2, 'subhanshu'), "
			           + "(3, 'golu')";

			smt.executeUpdate(sql);
			System.out.println("Data excute sucessfully!");
			
//			ResultSet rs = smt.executeQuery("INSERT INTO student VALUES (1, 'shubham";);
			
	
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
