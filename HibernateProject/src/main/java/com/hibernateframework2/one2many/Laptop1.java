package com.hibernateframework2.one2many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="laptopInfo1")
public class Laptop1 {
	@Id
	private int lid;
	private String lname;
	@ManyToOne()
	private StudentInfo1 student;
	
	public StudentInfo1 getStudent() {
		return student;
	}

	public void setStudent(StudentInfo1 student) {
		this.student = student;
	}
	
	public Laptop1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
