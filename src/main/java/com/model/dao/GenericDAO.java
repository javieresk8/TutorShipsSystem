package com.model.dao;

import java.util.ArrayList;

public interface GenericDAO <T, ID> {
	
	public ArrayList<T> get();
	public T getByID(ID id);
	public void create(T entity);
	public void update(T entity);
	public boolean deleteByID(ID  id);
}
