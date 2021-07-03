package com.hibernateframework2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class InsertAlien {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	//	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Alien ai =new  Alien();
		ai.setAid(101);
		ai.setAname("Rocky");
		ai.setColor("blue");
		Transaction txt = session.beginTransaction();
		session.save(ai);
		txt.commit();
		session.close();
		
	}

}
