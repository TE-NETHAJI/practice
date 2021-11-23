package com.te.employeeregisterations.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.employeeregisterations.dao.EntityClass;
import com.te.employeeregisterations.model.EmployeeBean;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityClass ec = new EntityClass();
		EmployeeBean bean = new EmployeeBean();

		try {
			 
	        
	       
		   ec.getEt().begin();
	       String update = "update emp_info set name =:nm, salary =:sal"+" where id =:id";
	       
	        bean = ec.getEm().find(EmployeeBean.class, req.getParameter("enterid"));
	        
	        Query querry = ec.getEm().createQuery(update);
	        querry.setParameter("id", req.getParameter("enterid"));
	        querry.setParameter("nm", req.getParameter("name"));
	        querry.setParameter("sal", req.getParameter("sal"));
	        querry.executeUpdate();
	        
	   
			
				
			
			
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
			 

			
			ec.getEt().commit();
			req.getRequestDispatcher("/updateok.jsp").forward(req, resp);
			
	
		} catch (Exception e) {
			e.printStackTrace();
			req.getRequestDispatcher("/updatefailed.jsp").forward(req, resp);;

		} finally {
			 ec.getEm().close();
			 ec.getEmf().close();
		}
	}

}
