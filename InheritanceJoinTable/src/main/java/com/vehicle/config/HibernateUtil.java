package com.vehicle.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {  // util class

	public static Session activateSession() {
		Configuration config = new Configuration().configure();
		SessionFactory sFactory = config.buildSessionFactory();
		Session session = sFactory.openSession();
		// return this session
		return session;
	}
}
