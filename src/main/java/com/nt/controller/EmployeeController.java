package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeSERVICE;
import com.nt.vo.EmployeeVO;

public class EmployeeController {
	
	private EmployeeSERVICE service;
		
 public EmployeeController(EmployeeSERVICE service) {
		this.service = service;
 }
 
public String process(EmployeeVO vo)throws Exception {
	
	EmployeeDTO dto=null;
	
	//crearing EmployeeDTO object
	
	dto=new EmployeeDTO();
	//converting vo to dto;
	
	System.out.println("EmployeeController.process()"+vo.getBsalary());
	
	dto.setEname(vo.getEname());
	dto.setEadd(vo.getEadd());
	dto.setEdept(vo.getEdept());
	dto.setEdesignation(vo.getEdesignation());
	dto.setBsalary(Float.parseFloat(vo.getBsalary()));
	 
	 return service.calcSalary(dto);
 }
	
}
