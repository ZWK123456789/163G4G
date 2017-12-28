/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T05.sevice;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZWK
 *2017年12月13日下午5:38:01
 *TODO
 */
public interface BaseService {

	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> query(String str);
}
