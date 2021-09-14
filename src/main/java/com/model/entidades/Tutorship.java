package com.model.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	private Integer idTutorship;
	
	@OneToOne
	@JoinColumn(name="id_schedule")
	private Schedule schedule;
	
	@OneToOne
	@JoinColumn(name="id_student")
	private Student student;
	
	@OneToOne
	@JoinColumn(name="id_teacher")
	private Teacher teacher;
	
	//Constructors
	public Tutorship() {

	}
	
	public Tutorship(Schedule schedule, Student student, Teacher teacher) {
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


	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTutorship != null ? idTutorship.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Tutorship)) {
			return false;
		}
		Tutorship other = (Tutorship) object;
		if ((this.idTutorship == null && other.idTutorship != null)
				|| (this.idTutorship != null && !this.idTutorship.equals(other.idTutorship))) {
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
