package com.hibernateframework2.one2one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="studentInfo")
public class StudentInfo {
	@Id
	private int rollno;
	private String name;
	@OneToOne
	private Laptop laptop;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
