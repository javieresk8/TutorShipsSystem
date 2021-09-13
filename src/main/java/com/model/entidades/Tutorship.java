package com.model.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tutorship")
public class Tutorship implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tutorship")
	private int idTutorship;
	
	@Column(name="schedule")
	private Schedule schedule;
	
	@Column(name="student")
	private Student student;
	
	@Column(name="teacher")
	private Teacher teacher;
	
	//Constructors
	public Tutorship() {

	}
	
	public Tutorship(int idTutorship, Schedule schedule, Student student, Teacher teacher) {
		super();
		this.idTutorship = idTutorship;
		this.schedule = schedule;
		this.student = student;
		this.teacher = teacher;
	}


	//Getters and setters
	public int getIdTutorship() {
		return idTutorship;
	}

	public void setIdTutorship(int idTutorship) {
		this.idTutorship = idTutorship;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	
	
	

}
