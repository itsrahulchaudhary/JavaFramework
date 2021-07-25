package com.hibernateframework.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateframework.one2many.Answer;
import com.hibernateframework.one2many.Question;

public class CascadeMain {
	// Cascade means it will same all data related to one question with multiple answers and we no need to save 
	// individual answer manuually.
	
	
	public static void main(String[] args) {
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// creating object
		Question q1 = new Question();
		q1.setQuestionId(125);
		q1.setQuestion("What is Hibernate???");

		// creating object
		Answer an = new Answer();
		an.setAnswerId(101);
		an.setAnswer("It is a framework");
		an.setQuestion(q1);

		
		Answer an2 = new Answer();
		an2.setAnswerId(102);
		an2.setAnswer("with the help of Hibernate we develop software");
		an2.setQuestion(q1);

		
		List<Answer> ans = new ArrayList<Answer>();
		ans.add(an);
		ans.add(an2);
		
		q1.setAnswers(ans);
		 
		Transaction txt = session.beginTransaction();
		session.save(q1);
	 

		txt.commit();
		session.close();
		
		
	}

}
