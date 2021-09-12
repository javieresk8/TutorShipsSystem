package com.model.dao;

import com.model.jpa.JPADAOFactory;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		//Inyeccion de dependencias
		//Le indicamos la clase concreta que vamos a enviar 
		return factory; 
	}
	
	//Se listan todos los metodos que permiten acceder a los objetos del modelo
	
	public abstract UserDAO getUserDAO();
	public abstract DepartmentDAO getDapartmentDAO();
	public abstract ScheduleDAO getScheduleDAO();
	public abstract StudentDAO getStudentDAO();
	public abstract TeacherDAO getTeacherDAO();
	public abstract TutorshipDAO getTutorshipDAO();

	
	

}
