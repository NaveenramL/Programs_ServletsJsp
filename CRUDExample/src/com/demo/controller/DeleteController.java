package com.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteController {

	public  void deleteEngineer(HttpServletRequest request, HttpServletResponse response) {
		int eid=Integer.parseInt(request.getParameter("eid"));
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","root");
			PreparedStatement ps = con.prepareStatement("delete from engineers where eid=?");
			ps.setInt(1, eid);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
