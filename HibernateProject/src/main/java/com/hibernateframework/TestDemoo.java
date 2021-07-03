package com.hibernateframework;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestDemoo {
	
	public static void main(String[] args) {
		
		System.out.println("Hibernate Project Started ::");
		Configuration cfg = new Configuration();
		cfg.configure("hib.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("I am working");
		
	}

}
