package com.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController {

	public  void updateEngineer(HttpServletRequest request, HttpServletResponse response) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","root");
			PreparedStatement ps = con.prepareStatement("update engineers set name=?,location=?,gender=? where eid=?");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
