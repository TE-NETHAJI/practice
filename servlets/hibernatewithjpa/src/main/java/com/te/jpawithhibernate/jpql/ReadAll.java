package com.te.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.jpawithhibernate.bean.InternsInfo;

public class ReadAll {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();

		String read = " from InternsInfo";
		Query query = manager.createQuery(read);
		List<InternsInfo> internsInfo = query.getResultList();

		for (InternsInfo info : internsInfo) {
			System.out.println(info.getDeptid());
			System.out.println(info.getDateofbirth());
			System.out.println(info.getMobileno());
			System.out.println(info.getBloodgroup());
			System.out.println(info.getDesignation());

		}

		manager.close();
		factory.close();

	}

}
