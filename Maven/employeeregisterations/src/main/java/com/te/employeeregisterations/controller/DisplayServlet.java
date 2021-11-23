package com.te.employeeregisterations.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.employeeregisterations.dao.EntityClass;
import com.te.employeeregisterations.model.EmployeeBean;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EntityClass ec = new EntityClass();

		try {

			String read = "from EmployeeBean";
			
			Query query = ec.getEm().createQuery(read);
			
			@SuppressWarnings("unchecked")
			List<EmployeeBean> info = query.getResultList();
			
			req.setAttribute("dis", info);
			resp.sendRedirect("/display.jsp");
		} catch (Exception e) {
			req.getRequestDispatcher("/displayfailed.html").forward(req, resp);
		} finally {
			ec.getEmf().close();
		}

	}

}
