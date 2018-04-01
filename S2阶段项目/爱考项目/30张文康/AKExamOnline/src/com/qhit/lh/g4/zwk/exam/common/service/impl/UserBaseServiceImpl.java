/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.common.service.impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.zwk.exam.common.bean.User;
import com.qhit.lh.g4.zwk.exam.common.dao.impl.UserBaseDaoImpl;
import com.qhit.lh.g4.zwk.exam.common.service.UserBaseService;

/**
 * @author ZWK
 *2017年12月26日上午11:15:12
 *TODO
 */
public class UserBaseServiceImpl implements UserBaseService {

	private UserBaseDaoImpl bdi = new UserBaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		bdi.add(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		bdi.delete(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.service.BaseService#getQueryById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getQueryById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return bdi.getQueryById(clazz, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.service.BaseService#getAll(java.lang.String)
	 */
	@Override
	public List<Object> getAll(String str) {
		// TODO Auto-generated method stub
		return bdi.getAll(str);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.common.service.UserBaseService#UserLogin(com.qhit.lh.g4.zwk.exam.common.bean.User)
	 */
	@Override
	public User UserLogin(User user) {
		// TODO Auto-generated method stub
		return bdi.UserLogin(user);
	}

}
