package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

/**
 * @author Unanimous
 *
 */
public class EmployeeSERVICEImpli implements EmployeeSERVICE {
	
	private EmployeeDAO dao;
	
	public EmployeeSERVICEImpli(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calcSalary(EmployeeDTO dto) throws Exception {
		
		System.out.println("EmployeeSERVICEImpli.calcSalary()");
		System.out.println(dto.getBsalary());
		
		float eda=0.0f, ehra=0.0f, epf=0.0f, grossSalary=0.0f;
		EmployeeBO bo=null;
		
		
		eda=dto.getBsalary()*0.1f;
		ehra=dto.getBsalary()*.2f;
		
		if(dto.getBsalary()>25000)
			epf=dto.getBsalary()*0.12f;
		else
			epf=dto.getBsalary()*.1f;
		
		grossSalary=dto.getBsalary()+eda+ehra-epf;
		
		//creating EMployeeBO object
		bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEadd(dto.getEadd());
		bo.setEdept(dto.getEdept());
		bo.setEdesignation(dto.getEdesignation());
		bo.setBsalary(dto.getBsalary());
		bo.setEda(eda);
		bo.setHra(ehra);
		bo.setGrossSalary(grossSalary);
		 
		 
		int count=dao.insert(bo);
		
		return count!=0?"Emplyee Salary Calculated & Inserted Successfully, Ename : "+dto.getEname()+"BAsic Salary: "+dto.getBsalary()+"Gross Salary: "+grossSalary
				     :"Emplyee Salary Calculated But Failed to  Inser, Ename : "+dto.getEname()+"BAsic Salary: "+dto.getBsalary()+"Gross Salary:"+grossSalary;
	}

}
