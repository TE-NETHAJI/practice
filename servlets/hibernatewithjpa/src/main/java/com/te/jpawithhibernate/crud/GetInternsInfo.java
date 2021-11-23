package com.te.jpawithhibernate.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.jpawithhibernate.bean.InternsInfo;

public class GetInternsInfo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();

		//InternsInfo info = em.find(InternsInfo.class, 27);
		InternsInfo info = em.getReference(InternsInfo.class, 35);
		

		if (info != null) {
			System.out.println(info.getDeptid());
			System.out.println(info.getDateofbirth());
			System.out.println(info.getMobileno());
			System.out.println(info.getBloodgroup());
			System.out.println(info.getDesignation());

		}
		try {
			emf.close();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
