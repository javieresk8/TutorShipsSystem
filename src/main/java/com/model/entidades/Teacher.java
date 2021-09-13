package com.model.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_teacher")
	private int idTeacher;
	
	@Column(name="departamento")
	private Department departamento;
	
	@Column(name="schedule")
	private Schedule schedule;
	
	
	//Constructors
	public Teacher() {

	}
	public Teacher(int idTeacher, Department departamento, Schedule schedule) {
		super();
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
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	
	

}
