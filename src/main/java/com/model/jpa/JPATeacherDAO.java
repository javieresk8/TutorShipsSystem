package com.model.jpa;

import java.util.List;

import javax.persistence.Query;

import com.model.dao.TeacherDAO;
import com.model.entidades.Teacher;
import com.model.entidades.Tutorship;

public class JPATeacherDAO extends JPAGenericDAO<Teacher, Integer> implements TeacherDAO{

	public JPATeacherDAO() {
		super(Teacher.class);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tutorship> getTutorshipsById(Integer idTeacher) {
		String sql = "SELECT t FROM Tutorship t WHERE t.teacher.idUsuario = :param_idTeacher";
		Query query = em.createQuery(sql);
		query.setParameter("param_idTeacher", idTeacher);
		List<Tutorship> tutorShips =  query.getResultList();
		 
		return tutorShips;
	}

}
