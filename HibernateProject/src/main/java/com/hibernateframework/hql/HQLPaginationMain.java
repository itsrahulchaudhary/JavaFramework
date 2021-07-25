package com.hibernateframework.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPaginationMain {
	public static void main(String[] args) {
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query createQuery = session.createQuery("from StudentDetail");
		createQuery.setFirstResult(0);
		createQuery.setMaxResults(5);
		
		List<StudentDetail> list = createQuery.list();
		for(StudentDetail sd : list) {
			System.out.println(sd.getId()+" :: "+sd.getName()+" :: "+sd.getCity());
		}
		session.close();
		factory.close();
	}

}
