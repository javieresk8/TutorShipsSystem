package com.model.dao;

import com.model.entidades.Schedule;

public interface ScheduleDAO extends GenericDAO<Schedule, Integer>{
	public void createWithId(Schedule s, Integer idTeacher);

}
