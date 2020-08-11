package com.nt.client;

import java.util.Scanner;


import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.EmployeeController;
import com.nt.vo.EmployeeVO;

/**
 * @author Unanimous
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		EmployeeController ec=null;
		EmployeeVO vo =null;
		Scanner scn=null;
		
		factory=new DefaultListableBeanFactory();
		
		reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		ec=factory.getBean("controller" , EmployeeController.class);
		
		//creating vo object	
		vo=new EmployeeVO();
		//creating Scanner obj
		scn=new Scanner(System.in);
		
		System.out.println("Enter Employee name");
		vo.setEname(scn.nextLine());
		System.out.println("Enter Employee Address");
		vo.setEadd(scn.nextLine());
		System.out.println("Enter Employee Department");
		vo.setEdept(scn.nextLine());
		System.out.println("Enter Employee Designation");
		vo.setEdesignation(scn.nextLine());
		System.out.println("Enter Employee Basic Salary");
		vo.setBsalary(scn.nextLine());
		
		try {
			String result=ec.process(vo);
			System.out.println(result);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal problem, try Again");
		}
		
	}

}
