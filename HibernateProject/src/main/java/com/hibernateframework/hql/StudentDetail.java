package com.hibernateframework.hql;

import javax.persistence.Cacheable;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.CacheConcurrencyStrategy;  
import org.hibernate.annotations.Cache;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class StudentDetail {
	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	@Id
	private int id;
	private String name;
	private String city;
	public StudentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetail(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
