/**
 * 
 */
package com.qhit.lh.g4.ZWK.T05.dao;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.ZWK.T05.bean.TbUser;

/**
 * @author ZWK
 *2017年12月28日下午5:14:56
 *TODO
 */
public interface BaseDao {

	public void add(Object obj);
	public void delete(Object arg0);
	public TbUser getQueryById(Class clazz, Serializable id);
	public void update(Object obj);
	public List<Object> getList(String str);
}
