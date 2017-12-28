/**
 * 
 */
package com.qhit.lh.g4.ZWK.T05.dao.Impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.ZWK.T05.bean.TbUser;
import com.qhit.lh.g4.ZWK.T05.utils.HibernateSessionFactory;
import com.qhit.lh.g4.ZWK.T05.dao.BaseDao;

/**
 * @author ZWK
 *2017年12月28日下午5:15:25
 *TODO
 */
public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//获取session对象
				Session session = HibernateSessionFactory.getSession();
				//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
				Transaction tx = session.beginTransaction();
				//添加（保存）数据对象
				session.save(obj);
				//事物对象提交
				tx.commit();
				//销毁session对象
				HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.T04.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object arg0) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
		Transaction tx = session.beginTransaction();
		//删除数据对象
		session.delete(arg0);
		//事物对象提交
		tx.commit();
		//销毁session对象
		HibernateSessionFactory.closeSession();
	
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.T04.dao.BaseDao#getUser(int)
	 */
	@Override
	public TbUser getQueryById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
		Transaction tx = session.beginTransaction();
		//获取数据对象
		Object obj =  session.get( clazz, id);
		//事物对象提交
		tx.commit();
		//销毁session对象
		HibernateSessionFactory.closeSession();
		return (TbUser) obj;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.T04.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//获取session对象
				Session session = HibernateSessionFactory.getSession();
				//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
				Transaction tx = session.beginTransaction();
				//更新数据对象
				session.update(obj);
				//事物对象提交
				tx.commit();
				//销毁session对象
				HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.T04.dao.BaseDao#getList(java.lang.String)
	 */
	@Override
	public List<Object> getList(String str) {
		// TODO Auto-generated method stub
		//获取session对象
				Session session = HibernateSessionFactory.getSession();
				//Hibernate是以事物驱动的ORM框架，所以需要创建事件对象
				Transaction tx = session.beginTransaction();
				//获取所有数据对象
				List<Object> list = new ArrayList<Object>();
				Query query = session.createQuery(str);
				list = query.list();
				//事物对象提交
				tx.commit();
				//销毁session对象
				HibernateSessionFactory.closeSession();
				return list;
	}

}
