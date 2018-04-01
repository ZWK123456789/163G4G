/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.g4.zwk.exam.common.utils.HibernateSessionFactory;

/**
 * @author ZWK
 *2018年1月5日上午11:09:01
 *TODO
 */
public class SessionFactory {

	public  Session getSession(){
		return HibernateSessionFactory.getSession();
	}
	public static  void close(){
		 HibernateSessionFactory.closeSession();;
	}
}
