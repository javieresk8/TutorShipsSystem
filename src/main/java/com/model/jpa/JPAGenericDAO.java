package com.model.jpa;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.model.dao.GenericDAO;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID>{
	protected EntityManager em;
	private Class<T> persistanceClass;
	
	

	public JPAGenericDAO(Class<T> persistanceClass) {
		
		this.persistanceClass = persistanceClass;
		this.em = Persistence.createEntityManagerFactory("FinalProject_AppWeb").createEntityManager(); //A Veces da errores, ctr C y ctr V
	}

	@Override
	public ArrayList<T> get() {
//		String query = "SELECT c FROM"
//		Query query = this.em.createNamedQuery("get");
//		List<T> entities = 
//		
		return null;
	}

	@Override
	public T getByID(ID id) {
		return em.find(persistanceClass, id);
	}

	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(">>>Error : JPAGenericDAO: create");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(">>> Error: JPAGenericDAO: update");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public boolean deleteByID(ID id) {
		T entity = this.getByID(id);
		if(entity != null) {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

}
