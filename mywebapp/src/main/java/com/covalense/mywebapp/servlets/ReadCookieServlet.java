package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get the cookies from request
		Cookie[] recievedCookies = request.getCookies();

		PrintWriter out = response.getWriter();

		if (recievedCookies == null) {
			out.print("Cookies are not present!...");
		} else {
			out.print("Cookies are  present!...");
			for (Cookie rcvdCookie : recievedCookies) {
				out.print("Cookie Name : " + rcvdCookie.getName());
				out.print("Cookie Value : " + rcvdCookie.getValue());

			}//end of for

		}//end of if else

	}// end of doGet

}// end of class
