package com.srinu.pojo;

import java.util.Set;

public class Department {

	private int deparmentid;
	private String departmentname;
	private Set student;
	
	public int getDeparmentid() {
		return deparmentid;
	}
	public void setDeparmentid(int deparmentid) {
		this.deparmentid = deparmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public Set getStudent() {
		return student;
	}
	public void setStudent(Set student) {
		this.student = student;
	}
}
