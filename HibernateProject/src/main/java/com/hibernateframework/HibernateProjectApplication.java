package com.hibernateframework;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateProjectApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HibernateProjectApplication.class, args);
		System.out.println("Hibernate Project Started ::");
		List<String> ls = new ArrayList<String>();
		ls.add("1- FirstTestMain :: com.hibernateframework");
		ls.add("2- SecondTestMain :: com.hibernateframework");
		ls.add("3- ThirdTestMain :: com.hibernateframework");
		
		
		ls.add("1- One2OneMain :: com.hibernateframework.one2one");
		
		ls.add("1- StatesMain :: com.hibernateframework.states");
		ls.add("1- HQLMain :: com.hibernateframework.hql");
		ls.add("1- HQLPaginationMain :: com.hibernateframework.hql");
		ls.add("1- SQLNativeQueryMain :: com.hibernateframework.nativequery");
		ls.add("1- CascadeMain :: com.hibernateframework.cascade");
		ls.add("1- FirstLevelCacheMain :: com.hibernateframework.firstlevelcache");
		ls.add("1- SecondLevelCacheMain :: com.hibernateframework.firstsecondcache");
		ls.add("1- PersonMain :: com.hibernateframework.mapping.xml");

		ls.add("1- SecondLevelCacheMain :: com.hibernateframework.firstsecondcache");





		for (String s : ls) {
			System.out.println(s);
		}

	}

}
