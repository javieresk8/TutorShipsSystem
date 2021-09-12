package com.model.dao;

public interface UserDAO {
	public boolean autorizar(String cedula, String clave, String rol);

}
