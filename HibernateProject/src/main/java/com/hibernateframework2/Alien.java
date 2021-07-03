package com.hibernateframework2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alien_tab")
public class Alien {
	@Id
	private int aid;
	@Column(name="AlienName")
	private String aname;
	@Column(name="AlienColor")
	private String color;
	 
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alien(int aid, String aname, String color) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.color = color;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
