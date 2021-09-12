package com.model.jpa;

import com.model.dao.DepartmentDAO;
import com.model.entidades.Department;

public class JPADepartmentDAO extends JPAGenericDAO<Department, Integer> implements DepartmentDAO{

	public JPADepartmentDAO() {
		super(Department.class);
		// TODO Auto-generated constructor stub
	}

}
