package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	
	private String ename;
	private String eadd;
	private String edept;
	private String edesignation;
	private float bsalary;
	//setters & getters
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public float getBsalary() {
		return bsalary;
	}
	public void setBsalary(float bsalary) {
		this.bsalary = bsalary;
	}
}
