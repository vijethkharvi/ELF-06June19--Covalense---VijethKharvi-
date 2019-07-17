package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	public MyFirstServlet(){
		System.out.println("inside my servlet constr...");
	}
	@Override
	protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletContext config=getServletContext();
		String actorName=ctx.getInitParameter("actor");
		
	/*	
		String httpMethod=req.getMethod();
		String protocol=req.getProtocol();
		String requesturl=req.getRequestURL().toString();
		
		System.out.println("http method"+httpMethod);
		System.out.println("protocol method"+protocol);
		System.out.println("request url"+requesturl);*/

		
		
		String currentDateTime = new Date().toString();
		
		//get query string information
		String fnameValue=req.getParameter("fname"); 
		String lnameValue=req.getParameter("lname"); 

		
		String htmlResponse="<!DOCTYPE html>"+                                                  
							"<html>"+
							"<head>"+
							"<meta charset=\"ISO-8859-1\">"+
							"<title>My First html</title>"+
							"</head>"+
							"<body>"+
							"	<h1>Current date and time is :"+
							"	<br>"+
							"	<span style=\"color: blue\">"+currentDateTime+"</span>"+
							" <br><br>"+
							"First Name:"+fnameValue+
							" <br><br>"+
							"Last Name:"+lnameValue+
							" <br><br>"+
							"movie name:"+movieName+
							" <br><br>"+
							"actor name:"+actorName+
							"	</h1>"+
							"</body>"+
							"</html>";
	//Send the above HTML Response to browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh","1");//auto refresh for every second
		PrintWriter out=resp.getWriter();
		out.println(htmlResponse);
		
		
	}//end of doGet()
}// end of class
