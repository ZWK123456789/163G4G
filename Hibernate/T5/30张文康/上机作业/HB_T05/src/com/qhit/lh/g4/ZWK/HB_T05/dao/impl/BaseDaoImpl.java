/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T05.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.ZWK.HB_T05.dao.BaseDao;
import com.qhit.lh.g4.ZWK.HB_T05.utils.HibernateSessionFactory;

/**
 * @author ZWK
 *2017年12月13日下午5:37:40
 *TODO
 */
public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//通过session工厂类获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取事物类
		Transaction tx = session.beginTransaction();
		//保存数据
		session.save(obj);
		//提交事件
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//通过session工厂类获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取事物类
		Transaction tx = session.beginTransaction();
		//删除数据
		session.delete(obj);
		//提交事件
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//通过session工厂类获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取事物类
		Transaction tx = session.beginTransaction();
		//更新数据
		session.update(obj);
		//提交事件
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}

	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
				//通过session工厂类获取session对象
				Session session = HibernateSessionFactory.getSession();
				//获取事物类
				Transaction tx = session.beginTransaction();
				//获取数据
				Object obj = session.get(clazz, id);
				//提交事件
				tx.commit();
				//关闭session
				HibernateSessionFactory.closeSession();
				return obj;
	}

	@Override
	public List<Object> query(String str) {
		// TODO Auto-generated method stub
				//通过session工厂类获取session对象
				Session session = HibernateSessionFactory.getSession();
				//获取事物类
				Transaction tx = session.beginTransaction();
				//获取集合
				Query query =  session.createQuery(str);
				List<Object> list = query.list();
				//提交事件
				tx.commit();
				//关闭session
				HibernateSessionFactory.closeSession();
				return list;
	}

}
