package com.hybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteController {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(5);
		user.setName("SuperMan");
		user.setAddress("marvel");
		                                                                                                                                                                                                                              
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(entityManager.merge(user));
		entityTransaction.commit();

	}

}
