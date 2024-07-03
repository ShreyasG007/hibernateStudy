package com.tka.hibernateStudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class client2 {
	public static void main(String[] args) {
		SessionFactory buildSessionFactory = HibernateConfig.getSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		
		Transaction transaction = openSession.beginTransaction();
		
		Employee employee = openSession.get(Employee.class, 1);
		
		transaction.commit();
		
		System.out.println(employee);
		
		openSession.close();
	}
}
