package com.te.servlets.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class Include extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url= "./";//can redirect static ,dynamic
		PrintWriter out = resp.getWriter();
		out.println("<h>hello world</h>");
		req.getRequestDispatcher(url).include(req, resp);
	}

}
