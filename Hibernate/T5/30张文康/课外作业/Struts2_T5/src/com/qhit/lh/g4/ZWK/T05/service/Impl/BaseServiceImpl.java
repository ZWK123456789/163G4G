/**
 * 
 */
package com.qhit.lh.g4.ZWK.T05.service.Impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.ZWK.T05.bean.TbUser;
import com.qhit.lh.g4.ZWK.T05.dao.Impl.BaseDaoImpl;
import com.qhit.lh.g4.ZWK.T05.service.BaseService;

/**
 * @author ZWK
 *2017年12月28日下午5:16:19
 *TODO
 */
public class BaseServiceImpl implements BaseService {

private BaseDaoImpl bdi = new BaseDaoImpl();
	
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		bdi.add(obj);
	}

	@Override
	public void delete(Object arg0) {
		// TODO Auto-generated method stub
		bdi.delete(arg0);
	}

	@Override
 public TbUser getQueryById(Class clazz, Serializable id){
		// TODO Auto-generated method stub
		return bdi.getQueryById(clazz, id);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		bdi.update(obj);
	}

	@Override
	public List<Object> getList(String str) {
		// TODO Auto-generated method stub
		return bdi.getList(str);
	}
}
