package com.hybernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FingByName {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter name");
	    String name = scan.next();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select u from User u where u.name=?1"); 
		query.setParameter(1, name);
	//	List list = query.getResultList();
	//	System.out.println(list);
		
		User dbUser = (User) query.getSingleResult();
	 	System.out.println(dbUser);

	}

}
