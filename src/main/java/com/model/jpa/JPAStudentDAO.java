package com.model.jpa;

import com.model.dao.StudentDAO;
import com.model.entidades.Student;

public class JPAStudentDAO extends JPAGenericDAO<Student, Integer> implements StudentDAO {

	public JPAStudentDAO() {
		super(Student.class);
		// TODO Auto-generated constructor stub
	}

}
