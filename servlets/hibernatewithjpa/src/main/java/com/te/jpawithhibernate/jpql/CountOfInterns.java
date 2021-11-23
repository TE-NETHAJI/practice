package com.te.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountOfInterns {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();

		String countOf = "select count(*) from InternsInfo";

		Query querry = manager.createQuery(countOf);

		Object res = querry.getSingleResult();
		System.out.println("No of Employess => " + res);

	}

}
