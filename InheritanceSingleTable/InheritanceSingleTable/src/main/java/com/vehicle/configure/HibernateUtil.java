package com.vehicle.configure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//creating session method with in HibernateUtil class

public class HibernateUtil {   // util class
	
	
	public static Session activateSession() { // creating and returning session method
		
		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session =sFactory.openSession();
		return session;   // returning the session
		
	}

}
