/**
 * 
 */
package com.qhit.lh.g4.zwk.t08.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.zwk.t08.dao.BaseDao;
import com.qhit.lh.g4.zwk.t08.utils.HibernateSessionFactory;

/**
 * @author ZWK
 *2017年12月26日上午11:16:01
 *TODO
 */
public class BaseDaoImpl implements BaseDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.dao.BaseDao#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//通过Session工厂类获取Session实例
		Session session = HibernateSessionFactory.getSession();
		//通过Session实例获取事件实例
		Transaction tx = session.beginTransaction();
		//通过Session进行数据持久化操作
		session.save(obj);
		//通过事件对象进行事件提交
		tx.commit();
		//关闭Session实例，结束会话
		HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//通过Session工厂类获取Session实例
		Session session = HibernateSessionFactory.getSession();
		//通过Session实例获取事件实例
		Transaction tx = session.beginTransaction();
		//通过Session进行数据持久化操作
		session.delete(obj);
		//通过事件对象进行事件提交
		tx.commit();
		//关闭Session实例，结束会话
		HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//通过Session工厂类获取Session实例
		Session session = HibernateSessionFactory.getSession();
		//通过Session实例获取事件实例
		Transaction tx = session.beginTransaction();
		//通过Session进行数据持久化操作
		session.update(obj);
		//通过事件对象进行事件提交
		tx.commit();
		//关闭Session实例，结束会话
		HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.dao.BaseDao#getQueryById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getQueryById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		//通过Session工厂类获取Session实例
		Session session = HibernateSessionFactory.getSession();
		//通过Session实例获取事件实例
		Transaction tx = session.beginTransaction();
		//通过Session进行数据持久化操作
		Object obj = session.get(clazz, id);
		//通过事件对象进行事件提交
		tx.commit();
		//关闭Session实例，结束会话
		HibernateSessionFactory.closeSession();
		return obj;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.t07.dao.BaseDao#getAll(java.lang.String)
	 */
	@Override
	public List<Object> getAll(String str) {
		// TODO Auto-generated method stub
		//通过Session工厂类获取Session实例
		Session session = HibernateSessionFactory.getSession();
		//通过Session实例获取事件实例
		Transaction tx = session.beginTransaction();
		//通过Session进行数据持久化操作
		//先获取Hibernate中Query的实例，再获取list集合对象
		Query query  =  session.createQuery(str);
		List<Object> list = query.list();
		//通过事件对象进行事件提交
		tx.commit();
		//关闭Session实例，结束会话
		HibernateSessionFactory.closeSession();
		return list;
	}

}
