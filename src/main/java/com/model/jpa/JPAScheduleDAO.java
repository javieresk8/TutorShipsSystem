package com.model.jpa;

import javax.persistence.Query;

import com.model.dao.ScheduleDAO;
import com.model.entidades.Schedule;

public class JPAScheduleDAO extends JPAGenericDAO<Schedule, Integer> implements ScheduleDAO{

	public JPAScheduleDAO() {
		super(Schedule.class);
	}

	@Override
	public void createWithId(Schedule s, Integer idTeacher) {
		String sql = "INSERT INTO `Schedule` (`dia`, `horaFin`, `horaInicio`, `id_teacher`) VALUES (?, ?, ?, ?);";
		em.getTransaction().begin();
		try {
			Query query = em.createNativeQuery(sql);
			query.setParameter(1, s.getDia());
			query.setParameter(2, s.getHoraFin());
			query.setParameter(3, s.getHoraInicio());
			query.setParameter(4, idTeacher);
			query.executeUpdate();
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>Error : JPASchuduleDAO: createWithID");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
		}
		
		
		}
	}

}
