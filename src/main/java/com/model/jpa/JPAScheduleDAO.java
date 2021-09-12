package com.model.jpa;

import com.model.dao.ScheduleDAO;
import com.model.entidades.Schedule;

public class JPAScheduleDAO extends JPAGenericDAO<Schedule, Integer> implements ScheduleDAO{

	public JPAScheduleDAO() {
		super(Schedule.class);
		// TODO Auto-generated constructor stub
	}

}
