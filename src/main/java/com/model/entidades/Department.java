package com.model.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries({
	@NamedQuery(name="getDepartments", query = "SELECT d FROM Department d")
})
@Entity
@Table(name="Department")
public class Department implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_department")
	private Integer idDepartment;
	
	@Column(name="nombreDepar")
	private String nombreDepartamento;
	
	//Constructors
	public Department(){
		
	}
	
	public Department(String nombreDepartamento) {
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDepartment != null ? idDepartment.hashCode() : 0);
		return hash;
	}
	

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Department)) {
			return false;
		}
		Department other = (Department) object;
		if ((this.idDepartment == null && other.idDepartment != null)
				|| (this.idDepartment != null && !this.idDepartment.equals(other.idDepartment))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
