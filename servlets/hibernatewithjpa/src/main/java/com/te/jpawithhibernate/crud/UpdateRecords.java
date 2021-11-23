package com.te.jpawithhibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.jpawithhibernate.bean.InternsInfo;

public class UpdateRecords {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			manager = emf.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			
			InternsInfo info = null;
			info=manager.find(InternsInfo.class, 35);
			info.setName("Boopathy");
			info.setSalary(30000.0);
			transaction.commit();
			System.out.println("Updated");

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			try {
				manager.close();
				emf.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
