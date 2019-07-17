package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployyeBeanJava;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
@WebServlet(urlPatterns="/search",initParams= {@WebInitParam(name="actress",value="basanthi")})
public class EmployeeSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idValue = req.getParameter("id");
		
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletContext config=getServletContext();
		String actorName=config.getInitParameter("actor");
		
		String actessName=config.getInitParameter("actress");
		
		
		// interact with db &emp info
		com.covalense.mywebapp.dao.EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployyeBeanJava bean = dao.getEmployeeInfo(idValue);

		// send response to browser
		PrintWriter out = resp.getWriter();

		if (bean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Employee Not Found!!!</span></H1>");
			out.print("<br><br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<br><br>");
			out.print("<H1><span style=\"color:green\">Employee Found...</span></H1>");
			out.print("<br>employee id is " + bean.getId());
			out.print("<br>employee name is " + bean.getName());
			out.print("<br>employee age is " + bean.getAge());
			out.print("<br>employee gender is " + bean.getGender());
			out.print("<br>employee salary is " + bean.getSalary());
			out.print("<br>employee phone is " + bean.getPhone());
			out.print("<br>employee joining_date is " + bean.getJoiningDate());
			out.print("<br>employee acount_number is " + bean.getAccno());
			out.print("<br>employee email is " + bean.getEmail());
			out.print("<br>employee designation is " + bean.getDesignation());
			out.print("<br>employee dob is " + bean.getDob());
			out.print("<br>employee Dept_id is " + bean.getDepartmentId());
			out.print("<br>employee manager_id is " + bean.getManagerId());
			out.print("<br>Movie " +movieName);
			out.print("<br>Actor " +actorName);
			out.print("<br>Actress Name " +actessName);

			
			out.print("</BODY>");
			out.print("</HTML>");

		}
	}//end doget
}//end of class
