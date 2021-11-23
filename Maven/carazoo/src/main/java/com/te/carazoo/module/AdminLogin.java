package com.te.carazoo.module;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		final String userName = "nethaji";

		final String password = "root";

		String un = req.getParameter("uname");
		String psw = req.getParameter("psw");

		if (userName.equalsIgnoreCase(un) && password.equalsIgnoreCase(psw)) {
			out.println("<h>hello world</h>");
			if (un == "" || psw == "") {
				out.println("<h>null not accepteded</h>");
			}

		} else {
			out.println("<h>Invalid Crendentials</h>");
		}

	}

}
