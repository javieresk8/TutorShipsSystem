package com.model.dao;

public interface UserDAO {
	public boolean authorize(String cedula, String clave, String rol);

}
