package com.te.employeedatabaseproject.module;

import java.sql.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.employeedatabaseproject.driver.ReturnMethod;
import com.te.employeedatabaseproject.exceptions.InvalidInputGiven;

public class InsertEmployeeDetails {
	

	public static void insertDatas(Scanner sc) {
		LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE);
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empInfo");

		EntityManager manager = emf.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		try {

			EmployeeInfoBean bean = new EmployeeInfoBean();
            System.out.println("<---------Enter Employee Details------>");
            System.out.println();
			transaction.begin();
			
			System.out.println("Enter First and Last name:");
			String name = sc.next();
			if(name.matches("[A-Za-z]+")) {
			name += sc.next().trim();
			bean.setName(name);
			}
			else {
				  throw new InvalidInputGiven("Name Should be in alfabets");
			}

			System.out.println("Enter employee ID:");
			Integer id = Integer.parseInt(sc.next());
			bean.setId(id);

			System.out.println("Enter DOB (YYYY-MM-DD): ");
			bean.setDob(Date.valueOf(sc.next()));

			System.out.println("Enter the role: ");
			String role = sc.next();
			//role += scanner.next().trim();
			bean.setRole(role);
			
			System.out.println("Enter gender: ");
			String gen =sc.next();
			bean.setGender(gen);

			System.out.println("Mobile:");
			Long ph = Long.parseLong(sc.next());
			bean.setMobileNo(ph);
			
			System.out.println("salary: ");
			Double db = Double.parseDouble(sc.next());
			bean.setSalary(db);

			System.out.println("Email: ");
			String email = sc.next();
			bean.setEmail(email);

			manager.persist(bean);
			transaction.commit();
			System.out.println("Inserted sucessfully");
			
			ReturnMethod.goBack();
			
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Invalid Input");
		} finally {
			sc.close();
			emf.close();
			manager.close();

		}
		
		

	}
	
}
