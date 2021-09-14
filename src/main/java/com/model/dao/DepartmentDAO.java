package com.model.dao;

import java.util.List;

import com.model.entidades.Department;

public interface DepartmentDAO  extends GenericDAO<Department, Integer>{
	public List<Department> getDepartments();

}
