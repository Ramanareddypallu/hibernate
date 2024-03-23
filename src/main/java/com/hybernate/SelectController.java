package com.hybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectController {

	public static void main(String[] args) {
			                                                                                                                                                                                                                              
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			User retrievedUser = entityManager.find(User.class, 1);
			
			if(retrievedUser != null) {
				System.out.println("user Found: "+retrievedUser );
			//	System.out.println("user Found: " +retrievedUser.getId());
	        //	System.out.println("user Found: " +retrievedUser.getAddress());
			}
			else {
				System.out.println("user not Found");
			}
			entityTransaction.commit();

		}

}
