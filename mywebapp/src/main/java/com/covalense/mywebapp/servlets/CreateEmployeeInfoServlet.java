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

import com.covalense.mywebapp.beans.EmployyeBeanJava;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/save")
public class CreateEmployeeInfoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idValue = req.getParameter("id");
		String nameValue = req.getParameter("name");
		String ageValue = req.getParameter("age");
		String genderValue = req.getParameter("gender");
		String idSalary = req.getParameter("salary");
		String idPhone = req.getParameter("phone");
		String idJD = req.getParameter("joining_date");
		String idAccountNo = req.getParameter("account_number");
		String idEmail = req.getParameter("Email");
		String idDesignation = req.getParameter("designation");
		String idDob = req.getParameter("dob");
		String idDept = req.getParameter("dept");
		String idManager = req.getParameter("manager");

		EmployyeBeanJava bean = new EmployyeBeanJava();
		bean.setId(Integer.parseInt(idValue));
		bean.setName(nameValue);
		bean.setAge(Integer.parseInt(ageValue));
		bean.setGender(genderValue);
		bean.setSalary(Double.parseDouble(idSalary));
		bean.setPhone(Long.parseLong(idPhone));
		SimpleDateFormat format = new SimpleDateFormat();
		Date date;
		try {
			date = format.parse(idJD);
			bean.setJoiningDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		bean.setAccno(Long.parseLong(idAccountNo));
		bean.setEmail(idEmail);
		bean.setDesignation(idDesignation);
		Date date2;
		try {
			date2 = format.parse(idDob);
			bean.setDob(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setDepartmentId(Integer.parseInt(idDept));
		bean.setManagerId(Integer.parseInt(idManager));

		// interact with db &emp info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		dao.createEmployeeInfo(bean);
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
