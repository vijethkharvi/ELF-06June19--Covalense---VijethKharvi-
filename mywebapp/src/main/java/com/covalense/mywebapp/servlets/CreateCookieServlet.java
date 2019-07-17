package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// create cookie
		Cookie myNameCookie = new Cookie("myName", "vijeth");
		Cookie myLocation = new Cookie("myLocation", "kundapura");
		myLocation.setMaxAge(7*24*60*60);//time in sec

		// send the above cookie to browser
		response.addCookie(myNameCookie);
		response.addCookie(myLocation);

		PrintWriter out = response.getWriter();
		out.print("created cookie!...");
		
	}// end of doGet()
}// end of class
