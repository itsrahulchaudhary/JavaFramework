package com.hibernateframework.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonMain {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg1.xml").buildSessionFactory();
		
		Person person = new Person(122, "Rajesh", "Mumbai", "12345");
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(person);
		transaction.commit();
		session.close();
		factory.close();

	}

}
