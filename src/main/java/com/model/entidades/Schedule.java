package com.model.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Schedule")
public class Schedule implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_schedule")
	private int idSchedule;
	
	@Column(name="dia")
	private String dia;
	
	@Column(name="horaFin")
	private String horaFin; //Cambiar en el modelo el tipo de dato 
	
	@Column(name="horaInicio")
	private String horaInicio ;
	
	
	//Constructors
	public Schedule() {

	}

	public Schedule(int idSchedule, String dia, String horaFin, String horaInicio) {
		super();
		this.idSchedule = idSchedule;
		this.dia = dia;
		this.horaFin = horaFin;
		this.horaInicio = horaInicio;
	}
	
	//Getters and setters
	public int getIdSchedule() {
		return idSchedule;
	}

	public void setIdSchedule(int idSchedule) {
		this.idSchedule = idSchedule;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	

	
	
	
	

}
