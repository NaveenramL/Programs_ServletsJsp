package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.controller.CreateController;
import com.demo.controller.DeleteController;
import com.demo.controller.ReadController;
import com.demo.controller.UpdateController;

/**
 * Servlet implementation class CommonServlet
 */
//@WebServlet("/CommonServlet")
public class CommonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommonServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//response.addHeader("Access-Control-Allow-Origin", "http://localhost:3000");
		setAccessControlHeaders(response);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		/*
		 * StringBuffer createURL = new StringBuffer("/create"); StringBuffer readURL =
		 * new StringBuffer("/list"); StringBuffer deleteURL = new
		 * StringBuffer("/delete"); StringBuffer updateURL = new
		 * StringBuffer("/update");
		 */
		
		System.out.println(request.getRequestURL());
		
		if( request.getRequestURL().toString().endsWith("/create")) {
			CreateController create = new CreateController();
			create.createEngineer(request, response);
			response.setStatus(200);
		}
		
		
		else if(request.getRequestURL().toString().endsWith("/list")) {
			ReadController read = new ReadController();
			read.listEngineer(request, response);
		}
		
		else if(request.getRequestURL().toString().endsWith("/")) {
			DeleteController delete = new DeleteController();
			delete.deleteEngineer(request, response);
		}
		else if(request.getRequestURL().toString().endsWith("/")) {
			UpdateController update = new UpdateController();
			update.updateEngineer(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	@Override
	  protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
	          throws ServletException, IOException {
	      setAccessControlHeaders(resp);
	      resp.setStatus(HttpServletResponse.SC_OK);
	  }

	  private void setAccessControlHeaders(HttpServletResponse resp) {
	      resp.setHeader("Access-Control-Allow-Origin", "*");
	      resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");
	     // resp.setHeader("Access-Control-Allow-Methods", "POST");
	      resp.setHeader("Access-Control-Allow-Headers", "Authorization");
	      resp.setHeader("Access-Control-Allow-Credentials", "true");
	      resp.setHeader("Vary", "Origin");
	      
	  }
}
