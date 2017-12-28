/**
 * 
 */
package com.qhit.lh.g4.ZWK.T05.service;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.ZWK.T05.bean.TbUser;

/**
 * @author ZWK
 *2017年12月28日下午5:16:00
 *TODO
 */
public interface BaseService {

	public void add(Object obj);
	public void delete(Object arg0);
	public TbUser getQueryById(Class clazz, Serializable id);
	public void update(Object obj);
	public List<Object> getList(String str);
}
