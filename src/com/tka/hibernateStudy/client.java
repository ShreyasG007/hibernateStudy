package com.tka.hibernateStudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class client {
	public static void main(String[] args) {
		SessionFactory buildSessionFactory = HibernateConfig.getSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		
		Transaction transaction = openSession.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("Shreeraj");
		e1.setSalary(10000);
		e1.setProfile("dev");
		
		Employee e2 = new Employee();
		e2.setId(3);
		e2.setName("Mihira");
		e2.setSalary(20000);
		e2.setProfile("Test");
		
		openSession.saveOrUpdate(e1);
		openSession.saveOrUpdate(e2);
		transaction.commit();
		
		System.out.println("Employee Inserted Success");
		
		openSession.close();
	}
}
