package com.rmpksoft.hbtest;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppLaunch {
	
	private static void create(Session session) {
        System.out.println("Creating Customer records...");
        try {
			Customer cust = new Customer();
			cust.setId(2);
			cust.setName("Pradeep"); 
			
			session.beginTransaction();
			session.save(cust);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
    }
	
	private static void read(Session session) {
        Query q = session.createQuery("select c from Customer c");
        List<Customer> custList = q.getResultList();
         
        custList.forEach(e->{
        	System.out.println(e);
        });
    }

	public static void main(String[] args) {
		 try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			//create(session);
			read(session);
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}
