package com.te.jpawithhibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.jpawithhibernate.bean.InternsInfo;

public class DeleteRecords {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			manager = emf.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			InternsInfo info = manager.find(InternsInfo.class, 35);
			manager.remove(info);
			transaction.commit();
			System.out.println("Deleted");

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			try {
				manager.close();
				emf.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
