package com.model.jpa;

import java.util.List;

import javax.persistence.Query;

import com.model.dao.DepartmentDAO;
import com.model.entidades.Department;

public class JPADepartmentDAO extends JPAGenericDAO<Department, Integer> implements DepartmentDAO{

	public JPADepartmentDAO() {
		super(Department.class);
		
	}

	@Override
	public List<Department> getDepartments() {
		Query query = this.em.createNamedQuery("getDepartments");
		@SuppressWarnings("unchecked")
		List<Department> departments = query.getResultList();
		return departments;
	}

}
