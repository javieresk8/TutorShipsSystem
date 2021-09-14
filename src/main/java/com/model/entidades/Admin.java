package com.model.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
//@Table(name="Admin")
public class  Admin extends User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_admin")
	private Integer idAdmin;
	
	
	public Admin() {

	}


	public Admin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}


	public Integer getIdAdmin() {
		return idAdmin;
	}


	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}
	
	//Getters and setters 
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idAdmin != null ? idAdmin.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Admin)) {
			return false;
		}
		Admin other = (Admin) object;
		if ((this.idAdmin == null && other.idAdmin != null)
				|| (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
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
