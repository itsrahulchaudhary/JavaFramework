package com.hibernateframework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EMDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		/*
		 * Student2 st = new Student2(); st.setId(1101); st.setName("Ramu");
		 * st.setCity("noida");
		 * 
		 * Certificate ct = new Certificate(); ct.setCource("SpringBoot");
		 * ct.setDuration("3 months");
		 * 
		 * st.setCerti(ct);
		 */
		
		Test test = new Test();
		test.setTestId(121);
		test.setName("AAAHib...");
		
		Session session = factory.openSession();
	    Transaction txt = session.beginTransaction();
	    session.save(test);
	    
	   txt.commit();
	  session.close();
	   factory.close();
		
		
		
	}

}
