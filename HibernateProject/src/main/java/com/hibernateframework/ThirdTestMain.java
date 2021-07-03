package com.hibernateframework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ThirdTestMain {

	public static void main(String[] args) {

		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student2 st = new Student2();
		st.setId(110);
		st.setName("Ranjan");
		st.setCity("Delhi");

		Certificate ct = new Certificate();
		ct.setCource("SpringBoot & Micro");
		ct.setDuration("3 months");

		st.setCertificate(ct);

		/*
		 * Test test = new Test(); test.setTestId(121); test.setName("AAAHib...");
		 */

		Session session = factory.openSession();
		Transaction txt = session.beginTransaction();
		session.save(st);

		txt.commit();
		session.close();
		factory.close();

	}

}
