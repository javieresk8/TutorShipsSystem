package com.model.jpa;

import com.model.dao.TeacherDAO;
import com.model.entidades.Teacher;

public class JPATeacherDAO extends JPAGenericDAO<Teacher, Integer> implements TeacherDAO{

	public JPATeacherDAO() {
		super(Teacher.class);
		// TODO Auto-generated constructor stub
	}

}
