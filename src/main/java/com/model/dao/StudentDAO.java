package com.model.dao;

import java.util.List;

import com.model.entidades.Student;
import com.model.entidades.Tutorship;


public interface StudentDAO extends GenericDAO<Student, Integer>{
	
	public List<Tutorship> getTutorshipsById(Integer idStudent);

}
