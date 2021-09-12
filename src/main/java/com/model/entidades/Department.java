package com.model.entidades;

import java.io.Serializable;

public class Department implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idDepartment;
	private String nombreDepartamento;
	
	//Constructors
	public Department(){
		
	}
	
	public Department(int idDepartment, String nombreDepartamento) {
		this.idDepartment = idDepartment;
		this.nombreDepartamento = nombreDepartamento;
	}
	
	
	
	//Getters and Setters
	public int getIdDepartment() {
		return idDepartment;
	}
	
	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}
	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	
	
}
