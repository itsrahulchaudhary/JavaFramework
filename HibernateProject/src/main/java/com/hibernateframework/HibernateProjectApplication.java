package com.hibernateframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateProjectApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HibernateProjectApplication.class, args);
		System.out.println("Hibernate Project Started ::");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		//System.out.println(factory);
		Student st = new Student();
		st.setId(101);
		st.setName("Jatin G");
		st.setCity("Gurugram");
		
		Address ad = new Address();
		ad.setStreet("Line-1");
		ad.setCity("Noida");
		ad.setCreatedDate(new Date());
		ad.setOpen(true);
		ad.setX(12.12);
		// Reading pic
		FileInputStream fs = new FileInputStream("src/main/java/kia.png");
		byte[] data = new byte[fs.available()];
		fs.read(data);
		ad.setImg(data);
		
		Session session = factory.openSession();
		Transaction txt = session.beginTransaction();
		session.save(st);
		session.save(ad);
		txt.commit();
		session.close();
		
	}

}
