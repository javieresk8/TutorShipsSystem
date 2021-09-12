package com.model.jpa;

import com.model.dao.DAOFactory;
import com.model.dao.DepartmentDAO;
import com.model.dao.ScheduleDAO;
import com.model.dao.StudentDAO;
import com.model.dao.TeacherDAO;
import com.model.dao.TutorshipDAO;
import com.model.dao.UserDAO;

//Este es el catalogo de funciones disponibles para los controladores
public class JPADAOFactory extends DAOFactory{
	
	@Override
	public UserDAO getUserDAO() {
		return new JPAUserDAO();
	}

	@Override
	public DepartmentDAO getDapartmentDAO() {
		return new JPADepartmentDAO();
	}

	@Override
	public ScheduleDAO getScheduleDAO() {
		return new JPAScheduleDAO();
	}

	@Override
	public StudentDAO getStudentDAO() {
		return new JPAStudentDAO();
	}

	@Override
	public TeacherDAO getTeacherDAO() {
		return new JPATeacherDAO();
	}

	@Override
	public TutorshipDAO getTutorshipDAO() {
		return new JPATutorshipDAO();
	}
	
	

}
