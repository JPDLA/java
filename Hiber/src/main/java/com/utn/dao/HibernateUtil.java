package com.utn.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionfactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
				return new Configuration().configure().buildSessionFactory();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static SessionFactory getSession(){
		return sessionfactory;
	}

	public static void closeSession(){
		sessionfactory.close();
	}
	
}
