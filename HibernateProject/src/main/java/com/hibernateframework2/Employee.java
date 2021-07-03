package com.hibernateframework2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_tab")
public class Employee {
	
	@Id
	private int emp_Id;
	private String emp_Name;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public Employee(int emp_Id, String emp_Name, Address address) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	
	

}
