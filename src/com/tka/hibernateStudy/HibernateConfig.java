package com.tka.hibernateStudy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public static final SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		return buildSessionFactory;
	}
}
