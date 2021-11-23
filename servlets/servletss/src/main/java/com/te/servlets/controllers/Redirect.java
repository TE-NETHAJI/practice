package com.te.servlets.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class Redirect extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String url = "http://localhost:8081/servlets/form";// static  
//		String url = "http://localhost:8081/servlets/second";// dynamic 
		String url = "https://www.flipkart.com/";
		
		resp.sendRedirect(url);
	}
}








