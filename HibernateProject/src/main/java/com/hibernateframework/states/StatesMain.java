package com.hibernateframework.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateframework.Certificate;
import com.hibernateframework.Student2;

public class StatesMain {
	public static void main(String[] args) {
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Create the object
		Student2 st = new Student2();
		st.setId(110);
		st.setName("Ranjan");
		st.setCity("Delhi");
		st.setCertificate(new Certificate("SpringBoot", "2 months"));
		//student :: Transient


		Session session = factory.openSession();
		Transaction txt = session.beginTransaction();
		session.save(st);
        //student :: Persistent - session, database
		st.setName("Lala");
		
		txt.commit();
		session.close();
		//student :: Detached
		st.setName("Ramu");
		System.out.println("Name :: "+st.getName());
		factory.close();
	}

}
