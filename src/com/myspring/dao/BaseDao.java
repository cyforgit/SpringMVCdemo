package com.myspring.dao;

import java.io.Serializable;

public interface BaseDao<T> {
	T get(Class<T> entityClazz,Serializable id);
	Serializable save(T entity);
}
