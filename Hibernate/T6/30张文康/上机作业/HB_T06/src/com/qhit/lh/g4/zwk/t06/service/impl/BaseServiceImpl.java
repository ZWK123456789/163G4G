package com.qhit.lh.g4.zwk.t06.service.impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.zwk.t06.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.zwk.t06.service.BaseService;

public class BaseServiceImpl implements BaseService {
	private BaseDaoImpl bdi = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		bdi.add(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		bdi.delete(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		bdi.update(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#getQueryById(java.lang.Class, int)
	 */
	@Override
	public Object getQueryById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return bdi.getQueryById(clazz, id) ;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.HB_T02.service.BaseService#getAll(java.lang.String)
	 */
	@Override
	public List<Object> getAll(String str) {
		// TODO Auto-generated method stub
		return bdi.getAll(str);
	}
}
