package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class StudentEntity {
	
	   @Id
	   @GeneratedValue
       private int id;
       private String name;
       private String deptid;
       private String mailid;
	public StudentEntity(int id, String name, String deptid, String mailid) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.mailid = mailid;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
       
}
