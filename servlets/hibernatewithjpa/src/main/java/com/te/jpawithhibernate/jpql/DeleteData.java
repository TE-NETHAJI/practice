package com.te.jpawithhibernate.jpql;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteData {
	public static void main(String[] args) {
		Logger.getLogger("Org.hibernate").setLevel(Level.SEVERE);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction entityTransaction = manager.getTransaction();
		entityTransaction.begin();

		String update = " delete InternsInfo where id =37";
		Query querry = manager.createQuery(update);
		int res = querry.executeUpdate();
		System.out.println("datas affected " + res);

		entityTransaction.commit();
		manager.close();
		factory.close();
	}

}
