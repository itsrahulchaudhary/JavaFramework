package com.hibernateframework;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test {
	@Id
	private int testId;
	private String name;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int testId, String name) {
		super();
		this.testId = testId;
		this.name = name;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
