package com.te.employeeregisterations.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.employeeregisterations.dao.EntityClass;
import com.te.employeeregisterations.model.EmployeeBean;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityClass ec = new EntityClass();
		EmployeeBean bean = new EmployeeBean();

		try {

			bean.setName(req.getParameter("name"));

			bean.setId(Integer.parseInt(req.getParameter("id")));

			Date date = null;

			date = new SimpleDateFormat("yyyy-mm-dd").parse(req.getParameter("dob"));

			bean.setDob(date);

			bean.setRole(req.getParameter("role"));

			bean.setGender(req.getParameter("gen"));

			bean.setMobileNo(Long.parseLong(req.getParameter("tel")));
			
			bean.setSalary(Double.parseDouble(req.getParameter("sal")));

			bean.setEmail(req.getParameter("mail"));

			bean.setBloodGroup(req.getParameter("bg"));

			ec.getEt().begin();
			ec.getEm().persist(bean);
			ec.getEt().commit();
			req.getRequestDispatcher("/registerok.jsp").forward(req, resp);

		} catch (Exception e) {
			req.getRequestDispatcher("/registerfailed.html");

		} finally {
			 ec.getEm().close();
			 ec.getEmf().close();
		}

	}
}
