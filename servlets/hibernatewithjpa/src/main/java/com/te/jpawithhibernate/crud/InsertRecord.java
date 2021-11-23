package com.te.jpawithhibernate.crud;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.jpawithhibernate.bean.InternsInfo;

public class InsertRecord {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager manager = null;
		EntityTransaction trans = null;

		InternsInfo info = new InternsInfo();
		info.setBloodgroup("B+");
		info.setDateofbirth(Date.valueOf("1998-09-09"));
		info.setDeptid(100);
		info.setDesignation("developer");
		info.setEmail("naveen@info.com");
		info.setGender("M");
		info.setId(37);
		info.setMobileno(8938938938l);
		info.setSalary(34000.0);
		info.setName("nveen");

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			manager = emf.createEntityManager();
			trans = manager.getTransaction();
			trans.begin();
			manager.persist(info);
			trans.commit();
			System.out.println("data inserted sucessfully");

		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			try {
				emf.close();
				manager.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
