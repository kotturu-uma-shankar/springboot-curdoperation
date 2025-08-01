 package com.uma.youtube2.model;

import javax.persistence.Entity;
import javax.persistence.Id;





@Entity    //if we add this annodation it will automacally create table in the database
public class Alien {
	
	
	@Id
	private int aid;
	private String aname;
	private String tech;
	private String mukesh;
	
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

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}

	
	
	

}
