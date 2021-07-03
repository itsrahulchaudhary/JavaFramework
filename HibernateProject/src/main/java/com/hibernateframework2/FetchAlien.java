package com.hibernateframework2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class FetchAlien {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory(reg);
		Session session = factory.openSession(); 
		Transaction txt = session.beginTransaction();
		Alien alien = (Alien) session.get(Alien.class, 10);
		System.out.println(alien);
		System.out.println("Name:: "+alien.getAname());
		txt.commit();
		session.close();
	}

}
