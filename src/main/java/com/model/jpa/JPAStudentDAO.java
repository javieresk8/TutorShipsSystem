package com.model.jpa;

import java.util.List;

import javax.persistence.Query;

import com.model.dao.StudentDAO;
import com.model.entidades.Student;
import com.model.entidades.Tutorship;

public class JPAStudentDAO extends JPAGenericDAO<Student, Integer> implements StudentDAO {

	public JPAStudentDAO() {
		super(Student.class);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tutorship> getTutorshipsById(Integer idStudent) {
		String sql = "SELECT t FROM Tutorship t WHERE t.student.idStudent = :param_idStudent";
		Query query = em.createQuery(sql);
		query.setParameter("param_idStudent", idStudent);
		return query.getResultList();
	}

}
