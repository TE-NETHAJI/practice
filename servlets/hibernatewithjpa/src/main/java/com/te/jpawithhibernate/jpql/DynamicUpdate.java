package com.te.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction entityTransaction = manager.getTransaction();
		entityTransaction.begin();
		
		String update = "update InternsInfo set name =:nm, salary =:sal"+" where id =:id";
		
		Query querry = manager.createQuery(update);
		querry.setParameter("nm", "Vivek");
		querry.setParameter("sal", 45000.00);
		querry.setParameter("id",35);
		//demo querry.setParameter("id", 67);
		
		int res = querry.executeUpdate();
		entityTransaction.commit();
		System.out.println("Rows affected " +res);
		manager.close();
		factory.close();
		

	}

}
