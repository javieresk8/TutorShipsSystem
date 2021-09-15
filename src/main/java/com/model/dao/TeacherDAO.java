package com.model.dao;

import java.util.List;

import com.model.entidades.Teacher;
import com.model.entidades.Tutorship;


public interface TeacherDAO extends GenericDAO<Teacher, Integer>{
	public  List<Tutorship> getTutorshipsById(Integer idTeacher);
}
