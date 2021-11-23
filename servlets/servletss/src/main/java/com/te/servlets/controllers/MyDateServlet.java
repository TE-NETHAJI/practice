package com.te.servlets.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyDateServlet extends HttpServlet{
	
	public  MyDateServlet() {
		System.out.println(" Instantiation phase");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println(" this init method");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" Service method is executed");
		resp.setContentType("text/html"); // setting the content to html
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> First </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Welcome to TechnoElevate, Being less complex</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	@Override
	public void destroy() {
		System.out.println(" This is destroy method");
	}
}
