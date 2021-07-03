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
		ls.add("1- FirstTestMain");
		for (String s : ls) {
			System.out.println(s);
		}

	}

}
