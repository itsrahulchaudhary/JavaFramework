package com.hibernateframework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
        // get() , load()
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// get()
		Student student = (Student) session.get(Student.class, 101);
		System.out.println(student);
		
		// get()
		Student student2 = (Student) session.load(Student.class, 101);
		System.out.println(student2);
		
		//Address ad = (Address) session.get(Address.class, 1);
		//System.out.println(ad.getCity());

	}

}
