package com.rmpksoft.pgsql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start Demo");
		
		SessionFactory sessionFactory = HibernateHelper.getSessionFactory();
		System.out.println(sessionFactory);
		
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
		
		session.getTransaction().commit();
		session.close();

	}

}
