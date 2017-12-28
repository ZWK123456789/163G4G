package com.qhit.lh.g4.zwk.t06.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService {
	
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getQueryById(Class clazz , Serializable id);
	public List <Object> getAll(String str);
}
