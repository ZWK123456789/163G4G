/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T05.sevice.impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.ZWK.HB_T05.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.ZWK.HB_T05.sevice.BaseService;

/**
 * @author ZWK
 *2017年12月13日下午5:38:29
 *TODO
 */
public class BaseServiceImpl implements BaseService {
	private BaseDaoImpl bdi = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T03.sevice.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		bdi.add(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T03.sevice.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		bdi.delete(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T03.sevice.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		bdi.update(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T03.sevice.BaseService#getObjectById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return bdi.getObjectById(clazz, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T03.sevice.BaseService#query(java.lang.String)
	 */
	@Override
	public List<Object> query(String str) {
		// TODO Auto-generated method stub
		return bdi.query(str);
	}

}
