package com.te.employeedatabaseproject.fetching;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.employeedatabaseproject.driver.ReturnMethod;
import com.te.employeedatabaseproject.module.EmployeeInfoBean;

public class DeletingOperation {

	public static void delete(Scanner sc) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empInfo");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
	

		try {
			System.out.println("Enter ID which records to be deleted from databas");
			Integer in = sc.nextInt();
			EmployeeInfoBean bean = manager.find(EmployeeInfoBean.class, in);

			transaction.begin();
			manager.remove(bean);
			transaction.commit();

			System.out.println("specified record deleted from you database");
			ReturnMethod.goBack();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			sc.close();
			emf.close();
			manager.close();

		}
	}

}
