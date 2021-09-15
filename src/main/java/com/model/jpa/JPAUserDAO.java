package com.model.jpa;

import java.util.List;

import javax.persistence.Query;

import com.model.dao.UserDAO;
import com.model.entidades.User;


public class JPAUserDAO extends JPAGenericDAO<User, Integer> implements UserDAO{

	public JPAUserDAO() {
		//Le pasamos la clase de persistencia
		//Indica que todo lo que hagamos es contra User
		super(User.class);
		
	}

	@Override
	public boolean authorize(String cedula, String clave, String rol) {
		String sentenceJPQL = "SELECT e FROM User e WHERE e.cedula = :param_cedula AND e.clave = :param_clave AND e.rol = :param_rol";
		Query query =  em.createQuery(sentenceJPQL);
		query.setParameter("param_cedula", cedula);
		query.setParameter("param_clave", clave);
		query.setParameter("param_rol", rol);
		User result = null;
		try {
			result = (User) query.getSingleResult();
		} catch (Exception e) {
			return false;
//			System.out.println(">>> Error JPAUserDAO:" + e);
//			System.out.println(">>> Error JPAUserDAO:" + e);
			
		}
		
		
		//Validamos los datos
		if (result != null) {
			return true;
		}
		return false;		
	}

	@Override
	public List<User> getUsers() {
		Query query = this.em.createNamedQuery("getUsers");
		@SuppressWarnings("unchecked")
		List<User> users = query.getResultList();
		return users;
	}

}
