package com.demo.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.demo.*;

public class CreateDAO {

	public void createEngineer(Engineer e) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","root");
			PreparedStatement ps = con.prepareStatement("insert into engineers(eid,name,location,gender) values(?,?,?,?)");
			ps.setInt(1,e.getEid() );
			ps.setString(2, e.getName());
			ps.setString(3, e.getLocation());
			ps.setString(4, e.getGender());
			ps.executeUpdate();
			System.out.println(ps);
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	}

