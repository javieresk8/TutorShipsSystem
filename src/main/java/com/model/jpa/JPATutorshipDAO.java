package com.model.jpa;

import com.model.dao.TutorshipDAO;
import com.model.entidades.Tutorship;


public class JPATutorshipDAO extends JPAGenericDAO<Tutorship, Integer> implements TutorshipDAO{

	public JPATutorshipDAO() {
		super(Tutorship.class);
	}

	

}
