package com.hibernateframework2.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class One2OneMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Laptop lp = new Laptop();
		lp.setLid(10);
		lp.setLname("HP");
		StudentInfo st = new StudentInfo();
		st.setRollno(20);
		st.setName("Ramesh");
		st.setLaptop(lp);
		Transaction txt = session.beginTransaction();
		session.save(lp);
		session.save(st);
		txt.commit();
	}

}
