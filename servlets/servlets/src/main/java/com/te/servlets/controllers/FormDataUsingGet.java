package com.te.servlets.controllers;

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

@WebServlet("/read")
public class FormDataUsingGet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String fname = req.getParameter("firstname");
		String lname = req.getParameter("last");
		String gender =  req.getParameter("gender");
		String state = req.getParameter("state");
		String email = req.getParameter("mail");
		Long mobileNo = Long.parseLong(req.getParameter("tel"));
		Date date = null;
		try {
			 date = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("dob"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		String feedback = req.getParameter("feedback");
		String checkBox = req.getParameter("checked");
		String pwd = req.getParameter("pwd");
		
		
		out.println("<h1> Reading form Data Http Method - " + req.getMethod() + "</h1>");
		out.println("<h4>First Name  : " +fname + "</h4>");
		out.println("<h4>Last Name  : " +lname + "</h4>");
		out.println("<h4>Gender  : " +gender + "</h4>");
		out.println("<h4>State  : " +state + "</h4>");
		out.println("<h4>Email  : " +email + "</h4>");
		out.println("<h4>Mobile  : " +mobileNo + "</h4>");
		out.println("<h4>DOB : " +date + "</h4>");
		out.println("<h4>Feedback  : " +feedback+ "</h4>");
		out.println("<h4>Agreed ?  : " +checkBox+ "</h4>" );
		out.println("<h4>Password  : " +pwd+ "</h4>" );
		
	}
}
