package com.demo.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.CommonServlet;
import com.demo.Engineer;
import com.demo.business.*;

public class CreateController {

	public  void createEngineer(HttpServletRequest request, HttpServletResponse response) {
		Engineer engineer = new Engineer();
		CreateBusiness createBusiness = new CreateBusiness();
		createBusiness.createEngineer(engineer);
//		try {
//			Class.forName("org.postgresql.Driver");
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","root");
//			PreparedStatement ps = con.prepareStatement("insert into engineers(eid,name,location,gender) values(?,?,?,?)");
//			ps.setInt(1,engineer.getEid() );
//			ps.setString(2, engineer.getName());
//			ps.setString(3, engineer.getLocation());
//			ps.setString(4, engineer.getGender());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
