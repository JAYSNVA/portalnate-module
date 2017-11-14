package com.sapdb.crud;

import java.util.List;

public interface CRUDRepository<T> {
	
	public void save(Object entity, T clazz);
	public void delete (Object entity, T clazz);
	public boolean update (Object entity, T clazz);
	public List<T> findAll (T clazz);

}
