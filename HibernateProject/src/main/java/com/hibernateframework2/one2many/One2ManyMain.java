package com.hibernateframework2.one2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
 

public class One2ManyMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory(reg);
		Session session = factory.openSession();
		
		Laptop1 lp = new Laptop1();
		lp.setLid(10);
		lp.setLname("HP");
		
		StudentInfo1 st = new StudentInfo1();
		st.setRollno(20);
		st.setName("Ramesh");
		st.getLaptop().add(lp);
		lp.setStudent(st);
		
		Transaction txt = session.beginTransaction();
		session.save(lp);
		session.save(st);
		txt.commit();
	}

}
