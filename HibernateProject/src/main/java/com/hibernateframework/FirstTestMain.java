package com.hibernateframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstTestMain {

	public static void main(String[] args) throws IOException {

		System.out.println("Hibernate Project Started ::");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		// Create student object
		Student st = new Student();
		st.setId(102);
		st.setName("Shashank");
		st.setCity("Delhi");
		System.out.println(st);
		
		// Create address object
		Address ad = new Address();
		ad.setStreet("stree-1");
		ad.setCity("Noida");
		ad.setCreatedDate(new Date());
		ad.setOpen(true);
		ad.setX(12.12);
		System.out.println(ad);
		
		// Reading pic
		FileInputStream fs = new FileInputStream("src/main/java/kia.png");
		byte[] data = new byte[fs.available()];
	    fs.read(data);
		ad.setImg(data);
		fs.close();
		
		Session session = factory.openSession();
		Transaction txt = session.beginTransaction();
		session.save(st);
		session.save(ad);
		
		txt.commit();
		session.close();
	}

}
