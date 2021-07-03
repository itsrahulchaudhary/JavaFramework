package com.hibernateframework.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class One2OneMain {
	public static void main(String[] args) {
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating object
		Question q1 = new Question();
		q1.setQuestionId(124);
		q1.setQuestion("What is Java???");

		// creating object
		Answer an = new Answer();
		an.setAnswerId(101);
		an.setAnswer("Java is a programming language");

		q1.setAnswer(an);
		an.setQuestion(q1);
		Session session = factory.openSession();

		Transaction txt = session.beginTransaction();
		session.save(q1);
		session.save(an);
		txt.commit();
		
		// fetching data
		Question ques = (Question)session.get(Question.class, 124);
		System.out.println(ques.getQuestion());
		System.out.println(ques.getAnswer().getAnswer());
		
		session.close();
		factory.close();

	}

}
