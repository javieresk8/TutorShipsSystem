package com.model.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher extends User  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_teacher")
	private Integer idTeacher;
	
	//Muchos profesores pertenecen a un departamento
	//JoinColum indica el nombre de la clave foranea que va a tener la tabla
	
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private Department departamento;
	
	//Crea clave foranea en Schedule
	@OneToMany
	@JoinColumn(name="id_teacher")
	private List<Schedule> schedule;
	
	
	//Constructors
	public Teacher() {

	}
	


	public Teacher(Integer idTeacher, Department departamento, List<Schedule> schedule) {
		this.idTeacher = idTeacher;
		this.departamento = departamento;
		this.schedule = schedule;
	}

	
	
	//Getters and Setters
	public int getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}
	public Department getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}
	
	
	public List<Schedule> getSchedule() {
		return schedule;
	}



	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}



	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTeacher != null ? idTeacher.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Teacher)) {
			return false;
		}
		Teacher other = (Teacher) object;
		if ((this.idTeacher == null && other.idTeacher != null)
				|| (this.idTeacher != null && !this.idTeacher.equals(other.idTeacher))) {
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
