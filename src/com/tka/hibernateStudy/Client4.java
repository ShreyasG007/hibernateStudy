package com.tka.hibernateStudy;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

public class Client4 {
	public static void main(String[] args) {
		SessionFactory buildSessionFactory = HibernateConfig.getSessionFactory();
		Session openSession = buildSessionFactory.openSession();

		NativeQuery<Employee> query = openSession.createNativeQuery("SELECT * FROM Employee", Employee.class);
		List<Employee> employees = query.getResultList();

		// Print all employees
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	
		openSession.clear();
		openSession.close();
	}
}
