package com.qhit.lh.g4.zwk.t06.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {

	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	//这里的id的类型用int类型也行
	public Object getQueryById(Class clazz ,Serializable id);
	public List <Object> getAll(String str);
}
