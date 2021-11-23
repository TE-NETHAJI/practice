package com.te.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReadSingleDatas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();

		String read = " select name from InternsInfo ";
		String rd =   "select name,id from InternsInfo";
		Query query = manager.createQuery(read);
		Query query2 = manager.createQuery(rd);
		
		List<String> internsInfo = query.getResultList();
		List<Object[]> obj = query.getResultList();

		for (String info : internsInfo) {
			System.out.println(info);

		}
		System.out.println("--------------------------");
		for (Object[] objects : obj) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			
		}
		

		manager.close();
		factory.close();
	}

}
