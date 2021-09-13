package com.model.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Student")
public class Student extends User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_student")
	private Integer idStudent;
	
	
	//Constructors
	public Student() {

	}
	
	
	


	public Student(Integer idStudent) {
		this.idStudent = idStudent;
	}





	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idStudent != null ? idStudent.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Student)) {
			return false;
		}
		Student other = (Student) object;
		if ((this.idStudent == null && other.idStudent != null)
				|| (this.idStudent != null && !this.idStudent.equals(other.idStudent))) {
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
