package com.demo.servletjsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name="/home",urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HomeServlet() {
        super();
        System.out.println("In Home Servlet Constructor");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In do get method in Home Servlet");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher(
	   	          "/WEB-INF/JSP/home.jsp");
	   	        dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
