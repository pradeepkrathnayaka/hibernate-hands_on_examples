package com.rmpksoft.pgsql;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {
	final static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("TESTAPP");

	public static void main(String[] args) {
		try {
			System.out.println(ENTITY_MANAGER_FACTORY);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
