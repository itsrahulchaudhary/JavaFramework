package com.hibernateframework.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernateframework.hql.StudentDetail;

public class CriteriaMain {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg1.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(StudentDetail.class);
	   //criteria.add(Restrictions.eq("city", "Noida"));
		criteria.add(Restrictions.gt("id", 30));

		List<StudentDetail> list = criteria.list();
		for(StudentDetail sd : list) {
			System.out.println(sd.getId()+" :: "+sd.getName());
		}
		session.close();
		factory.close();
		
	}

}
