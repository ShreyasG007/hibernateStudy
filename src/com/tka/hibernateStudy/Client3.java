package com.tka.hibernateStudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Client3 {
	public static void main(String[] args) {
		SessionFactory buildSessionFactory = HibernateConfig.getSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		
		Transaction transaction = openSession.beginTransaction();
		Employee employee = openSession.get(Employee.class, 2);
		
		System.out.println(employee);
		transaction.commit();
		
		openSession.close();
	}
}
