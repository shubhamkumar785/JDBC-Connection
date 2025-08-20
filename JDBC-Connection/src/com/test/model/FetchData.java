package com.test.model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FetchData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ce", "root", "shubham");

            Statement smt = con.createStatement();

            ResultSet set = smt.executeQuery("SELECT * FROM student;");

            ArrayList<Student> list = new ArrayList<>();

            while (set.next()) {
                Student student = new Student();
                student.setId(set.getInt("id"));         
                student.setName(set.getString("name"));
                student.setAddress(set.getString("address"));
                list.add(student);
            }

            for (Student s : list) {
                System.out.println(s.getId() + " - " + s.getName() + " - " + s.getAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
