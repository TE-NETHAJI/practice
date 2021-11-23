package com.te.carazoo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import lombok.Data;
@Data
public class EntityClass {
	private EntityManagerFactory emf =null;
	private EntityManager em = null;
	private EntityTransaction et = null;
	
	public EntityClass() {
	
		emf= Persistence.createEntityManagerFactory("Test");
		em= emf.createEntityManager();
		et= em.getTransaction();
	}

}
