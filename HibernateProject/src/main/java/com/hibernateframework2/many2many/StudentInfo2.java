package com.hibernateframework2.many2many;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="studentInfo2")
public class StudentInfo2 {
	@Id
	private int rollno;
	private String name;
	@OneToMany(mappedBy="student")
	private List<Laptop2> laptop = new ArrayList<>();
	 
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
	 
	public List<Laptop2> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop2> laptop) {
		this.laptop = laptop;
	}
	public StudentInfo2() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
