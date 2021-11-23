package com.te.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateInfo {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
        EntityTransaction entityTransaction = manager.getTransaction();
        entityTransaction.begin();
        
        String update = " update InternsInfo set name = 'Vishant',"
        		+ "salary = 40000.0 where id = 35";
        
        Query querry = manager.createQuery(update);
        int res = querry.executeUpdate();
        System.out.println("datas Affected "+res);
        
        entityTransaction.commit();
       
        manager.close();
        factory.close();
	}

}
