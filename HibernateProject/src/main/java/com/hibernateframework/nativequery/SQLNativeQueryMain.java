package com.hibernateframework.nativequery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateframework.hql.StudentDetail;

public class SQLNativeQueryMain {
	public static void main(String[] args) {
		
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//SQL Query
		String q = "select * from studentdetail";
		SQLQuery createSQLQuery = session.createSQLQuery(q);
	    createSQLQuery.addEntity(StudentDetail.class);
		List<StudentDetail> list = createSQLQuery.list();
		for(StudentDetail detail : list) {
			System.out.println(detail.getId()+" :: "+detail.getName()+" :: "+detail.getCity());
		}
		session.close();
		factory.close();
	}

}
