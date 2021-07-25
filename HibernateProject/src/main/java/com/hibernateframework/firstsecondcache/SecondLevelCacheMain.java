package com.hibernateframework.firstsecondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateframework.hql.StudentDetail;

public class SecondLevelCacheMain {
	public static void main(String[] args) {
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		StudentDetail std = (StudentDetail) session.get(StudentDetail.class, 2);
		System.out.println(std);
		session.close();
		System.out.println("-------------------------------------");
		
		Session session2 = factory.openSession();
		StudentDetail std2 = (StudentDetail) session2.get(StudentDetail.class, 2);
		System.out.println(std2);
		session2.close();
		
	}
}
