package com.nt.dao;

import com.nt.bo.EmployeeBO;

/**
 * @author Unanimous
 *
 */
public interface EmployeeDAO {
	
	/**
	 * @param bo
	 * @return
	 * @throws Exception
	 */
	public int insert(EmployeeBO bo) throws Exception;

}
