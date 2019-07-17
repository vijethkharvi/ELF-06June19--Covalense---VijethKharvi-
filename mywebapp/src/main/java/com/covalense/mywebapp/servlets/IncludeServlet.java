package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IncludeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher=null;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("11111111111111");
		
		out.println("<br>");
		dispatcher=request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);
		out.println("<br>");
		
		out.println("22222222222222");
		
		out.println("<br>");
		dispatcher=request.getRequestDispatcher("currentDate?fname=vijeth&lname=kharvi");
		dispatcher.include(request, response);
		out.println("<br>");
		
		out.println("33333333333333");
		
		out.println("<br>");
		dispatcher=request.getRequestDispatcher("search?        =1001");
		dispatcher.include(request, response);
		out.println("<br>");

		out.println("444444444444444");

	
	}//end of doGet()

}//end of class 
