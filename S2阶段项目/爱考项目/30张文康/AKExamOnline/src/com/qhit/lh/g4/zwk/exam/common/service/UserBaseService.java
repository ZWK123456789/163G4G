/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.common.service;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.zwk.exam.common.bean.User;

/**
 * @author ZWK
 *2017年12月26日上午11:14:56
 *TODO
 */
public interface UserBaseService {

	public User UserLogin(User user);
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	//这里的id的类型用int类型也行
	public Object getQueryById(Class clazz ,Serializable id);
	public List <Object> getAll(String str);
}
