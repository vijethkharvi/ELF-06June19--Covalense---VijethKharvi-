package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.DeptInfoBean;
import com.covalense.mywebapp.beans.EmployyeBeanJava;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/dept")
public class DepartmentIdServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idValue = req.getParameter("id");
		String idDept = req.getParameter("dept");

		DeptInfoBean bean = new DeptInfoBean();
		bean.setDeptId(Integer.parseInt(idValue));
		bean.setDeptName(idDept);

		// interact with db &emp info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		dao.createDeptInfoBean(bean);
		// send response to browser
		PrintWriter out = resp.getWriter();

		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<H1><span style=\"color:green\">Record Inserted successfully</span></H1>");
		out.print("<br><br>");
		out.print("</BODY>");
		out.print("</HTML>");

	}// end doget
}// end of class
