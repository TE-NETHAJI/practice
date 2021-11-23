package com.te.servlets.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = "./first.jsp"; // static resource
//		String uri = "./second"; //dynamic resource
//		String url = "https://www.flipkart.com/";
		
		req.getRequestDispatcher(uri).forward(req, resp);;
	}
}










