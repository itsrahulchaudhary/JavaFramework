package com.hibernateframework2.one2many;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="studentInfo1")
public class StudentInfo1 {
	@Id
	private int rollno;
	private String name;
	@OneToMany(mappedBy="student")
	private List<Laptop1> laptop = new ArrayList<>();
	 
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
	 
	public List<Laptop1> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop1> laptop) {
		this.laptop = laptop;
	}
	public StudentInfo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
