package com.hibernateframework2.many2many;
 

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="laptopInfo2")
public class Laptop2 {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<StudentInfo2> student = new ArrayList<>();
	
	public List<StudentInfo2> getStudent() {
		return student;
	}

	public void setStudent(List<StudentInfo2> student) {
		this.student = student;
	}

	public Laptop2() {
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
