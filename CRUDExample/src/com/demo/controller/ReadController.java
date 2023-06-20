package com.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Engineer;

public class ReadController {

	public  void listEngineer(HttpServletRequest request, HttpServletResponse response) {
		List<Engineer> list = new ArrayList<Engineer>();
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","root");
			PreparedStatement ps = con.prepareStatement("select eid,name,location,gender from engineers");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Engineer engineer = new Engineer();
				engineer.setEid(rs.getInt(1));
				engineer.setName(rs.getString(2));
				engineer.setLocation(rs.getString(3));
				engineer.setGender(rs.getString(4));
				list.add(engineer);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
