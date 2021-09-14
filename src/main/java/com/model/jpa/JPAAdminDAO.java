package com.model.jpa;

import com.model.dao.AdminDAO;
import com.model.entidades.Admin;

public class JPAAdminDAO extends JPAGenericDAO<Admin, Integer> implements AdminDAO{

	public JPAAdminDAO() {
		super(Admin.class);
		// TODO Auto-generated constructor stub
	}

}
