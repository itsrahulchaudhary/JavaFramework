package com.hibernateframework.one2many;

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
		an.setQuestion(q1);

		
		Answer an2 = new Answer();
		an2.setAnswerId(102);
		an2.setAnswer("with the help of java we develop software");
		an2.setQuestion(q1);

		
		List<Answer> ans = new ArrayList<Answer>();
		ans.add(an);
		ans.add(an2);
		
		q1.setAnswers(ans);
		Session session = factory.openSession();

		Transaction txt = session.beginTransaction();
		session.save(q1);
		session.save(an);
		session.save(an2);

		txt.commit();
		
		
		  // fetching data 
		  Question ques = (Question)session.get(Question.class, 124);
		  System.out.println(ques.getQuestion());
		  for(Answer a : ques.getAnswers()) {
			   System.out.println(a.getAnswer());
		  }
		 
		
		session.close();
		factory.close();

	}

}
