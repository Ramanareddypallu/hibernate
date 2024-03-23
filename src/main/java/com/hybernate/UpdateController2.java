package com.hybernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateController2 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Id : ");
		int id = scan.nextInt();
		
		User user = new User();
		System.out.println("Enter a  name : ");
		String name = scan.next();
		System.out.println("Enter  a address");
		String adress = scan.next();
		
		user.setAddress(adress);
		user.setName(name);
		
		UpdateController2 controller = new UpdateController2();
		controller.UpdateUser(id, user);
	}	
public void UpdateUser(int id, User user) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User dbUser = entityManager.find(User.class, id);
		
		if(dbUser!= null) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		user.setId(id);
		entityManager.merge(user);
		entityTransaction.commit();
      }
		else {
			System.out.println("sorry Id is not present to update the data");
		}

	}

}
