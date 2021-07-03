package com.hibernateframework2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class InsertEmployee {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory(reg);
		Session session = factory.openSession(); 
		Employee emp = new Employee();
		emp.setEmp_Id(100);
		emp.setEmp_Name("Jatin");
		
		Address ad = new Address();
		ad.setPinCode("12345");
		ad.setCity("Gurugram");
		ad.setState("Haryana");
		
		emp.setAddress(ad);
		Transaction txt = session.beginTransaction();
		session.save(emp);
		txt.commit();
		session.close();
	}

}
