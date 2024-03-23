package com.hybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User dbUser = entityManager.find(User.class, 5);
	//  System.out.println(dbUser);
		if(dbUser!=null) {
			System.out.println(dbUser);
		}else {
			System.out.println("Sorry Id is not present");
		}

	}

}
