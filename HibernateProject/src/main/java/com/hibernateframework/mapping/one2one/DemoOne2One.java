package com.hibernateframework.mapping.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DemoOne2One {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory(reg);
		Session session = factory.openSession();
		// creating object
	    Answer an = new Answer();
		an.setAnswerId(101);
		an.setAnswer("Java is a programming language");
		// creating object
		Question q1 = new Question();
		q1.setQuestionId(124);
		q1.setQuestion("What is Java???");
		
		q1.setAnswer(an);
		 
		Transaction txt = session.beginTransaction();
		session.save(an);
		session.save(q1);
		txt.commit();
		session.close();
		//factory.close();
		
				
				
	}

}
