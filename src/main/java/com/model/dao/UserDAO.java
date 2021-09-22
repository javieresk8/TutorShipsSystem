package com.model.dao;

import java.util.List;

import com.model.entidades.User;

public interface UserDAO extends GenericDAO<User, Integer>{
	public User authorize(String cedula, String clave, String rol);
	
	public List<User> getUsers();

}
