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
	private Integer idSchedule;
	
	@Column(name="dia")
	private String dia;
	
	@Column(name="horaFin")
	private String horaFin; //Cambiar en el modelo el tipo de dato 
	
	@Column(name="horaInicio")
	private String horaInicio ;
	
	
	//Constructors
	public Schedule() {

	}

	public Schedule( String dia, String horaFin, String horaInicio) {
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
	
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idSchedule != null ? idSchedule.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Schedule)) {
			return false;
		}
		Schedule other = (Schedule) object;
		if ((this.idSchedule == null && other.idSchedule != null)
				|| (this.idSchedule != null && !this.idSchedule.equals(other.idSchedule))) {
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
