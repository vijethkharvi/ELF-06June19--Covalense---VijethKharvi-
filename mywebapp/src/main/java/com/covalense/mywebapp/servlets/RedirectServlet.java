package com.covalense.mywebapp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//String url = "http://www.google.com"; 
		//String url = "search?id=1001"; 
		String url = "index.html";

		response.sendRedirect(url);
	}// end of doGet

}// end of class
 