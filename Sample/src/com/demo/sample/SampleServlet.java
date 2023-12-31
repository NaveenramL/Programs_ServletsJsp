package com.demo.sample;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(name="/SampleServlet",urlPatterns = "/student-record")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public SampleServlet() {
        
    	System.out.println("In constructor");
    }
    
    private StudentService studentService = new StudentService();
    
    private void processRequest(
    	      HttpServletRequest request, HttpServletResponse response) 
    	      throws ServletException, IOException, SQLException, ClassNotFoundException {

		/*
		 * String studentID = request.getParameter("id"); if (studentID != null) { int
		 * id = Integer.parseInt(studentID); studentService.getStudent(id) .ifPresent(s
		 * -> request.setAttribute("studentRecord", s)); }
		 */
    	
    	Student s = new Student();
		/*
		 * s.setId(100); s.setFirstName("Naveen"); s.setLastName("Ram");
		 */
    	//request.setAttribute("s1", s);
    	System.out.println(request.getParameter("sid"));
    	String sid=request.getParameter("sid");
    	int id = Integer.parseInt(sid);

    	       
    	        Class.forName("org.postgresql.Driver");
    	        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","root");
    	        //Statement stmt=con.createStatement();  
    	        PreparedStatement ps = con.prepareStatement("select sid,sname,location,salary from students where sid=?");
    	        //ResultSet rs=stmt.executeQuery("select sid,sname,location from students where sid = ?"); 
    	       ps.setInt(1, id);
    	       ResultSet rs = ps.executeQuery();
    	       //request.setAttribute("s1", rs);
    	       if(rs.next()) {
    	    	   s.setId(rs.getInt(1));
    	    	   s.setName(rs.getString(2));
    	    	   s.setLocation(rs.getString(3));
    	    	   s.setSalary(rs.getInt(4));
    	    	   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));
    	    	   //request.setAttribute("s1", s);
    	       }
    	       request.setAttribute("s1", s);
		/*
		 * while(rs.next())
		 * System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		 */con.close();  
		 RequestDispatcher dispatcher = request.getRequestDispatcher(
   	          "/WEB-INF/JSP/student-record.jsp");
   	        dispatcher.forward(request, response);
   	        
    	    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("In get method");
		try {
			processRequest(request, response);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			processRequest(request, response);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
