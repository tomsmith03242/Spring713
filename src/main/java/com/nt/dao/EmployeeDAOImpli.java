package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

/**
 * @author Unanimous
 *
 */
public class EmployeeDAOImpli implements EmployeeDAO {
	
	private static final String INSERT_RECORDS="INSERT INTO emp_reg(ENAME,EADD,EDEPT,EDESIGNATION,BSALARY,EDA,EHRA,GROSSSALARY) VALUES (?,?,?,?,?,?,?,?)";
	
	private DataSource ds;
	
	/**
	 * @param ds
	 */
	public EmployeeDAOImpli(DataSource ds) {
		this.ds = ds;
	}

	/**
	 *
	 */
	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		
		//Create connection
		con=ds.getConnection();
		//create prepare statement
		ps=con.prepareStatement(INSERT_RECORDS);
		System.out.println("EmployeeDAOImpli.insert()");
		System.out.println("Basic salary"+bo.getBsalary());
		//set query parameter values
		ps.setString(1,bo.getEname());
		ps.setString(2, bo.getEadd());
		ps.setString(3, bo.getEdept());
		ps.setString(4, bo.getEdesignation());
		ps.setFloat(5, bo.getBsalary());
		ps.setFloat(6, bo.getEda());
		ps.setFloat(7, bo.getHra());
		ps.setFloat(8, bo.getGrossSalary());
		
		//execute query
		int count=ps.executeUpdate();

		return count;
	}

}
