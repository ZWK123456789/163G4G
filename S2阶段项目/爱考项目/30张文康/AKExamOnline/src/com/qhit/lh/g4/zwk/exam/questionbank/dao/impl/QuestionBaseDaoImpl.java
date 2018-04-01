/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.questionbank.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.zwk.exam.common.bean.PageBean;
import com.qhit.lh.g4.zwk.exam.common.dao.SessionFactory;
import com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest;
import com.qhit.lh.g4.zwk.exam.questionbank.dao.QuestionBaseDao;
import com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course;

/**
 * @author ZWK
 *2018年1月3日下午6:01:46
 *TODO
 */
public class QuestionBaseDaoImpl extends SessionFactory implements QuestionBaseDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.dao.QuestionBaseDao#getCourseInfo(java.util.Map)
	 */
	@Override
	public List<Object> getCourseInfo(Map<String, String> parameter) {
		// TODO Auto-generated method stub
		//创建HQL语句
		StringBuffer hql = new StringBuffer();
		hql.append("select course from Course course where  1 = 1");
		//拼接hql语句
		if(parameter.get("major") != null && !" ".equals(parameter.get("major"))){
			hql.append(" and course.major = :major ");
		}
		if(parameter.get("stage") != null && !" ".equals(parameter.get("stage"))){
			hql.append(" and course.stage = :stage ");
		}	
		//获取Query对象
		Query query = getSession().createQuery(hql.toString());
		//设置参数
		if(parameter.get("major") != null && !" ".equals(parameter.get("major"))){
			query.setString("major", parameter.get("major"));
		}
		if(parameter.get("stage") != null && !" ".equals(parameter.get("stage"))){
			query.setString("stage", parameter.get("stage"));
		}
		//执行查询并返回
		List<Object> list = query.list();
		Transaction tx = getSession().beginTransaction();
		tx.commit();
		//关闭会话
		getSession().close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.dao.QuestionBaseDao#getWrittenQuestion(com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course)
	 */
	@Override
	public PageBean<WrittenTest> getWrittenQuestion(PageBean<WrittenTest> pagebean, Course course,int pageIndex) {
		// TODO Auto-generated method stub
		//StringBuffer hql = new StringBuffer();
		//hql.append("select course fromCourse course where course.csId = :csId");
		//Query query = SessionFactory.getSession().createQuery(hql.toString());
		//query.setInteger("csId", course.getCsId());
		System.out.println("查找笔试题");
		StringBuffer hql = new StringBuffer();
		hql.append("select w from WrittenTest w where w.csId = :csId");
		//获取查询器
		Query query = getSession().createQuery(hql.toString());
		//设置分页查询参数，科目ID
		query.setInteger("csId", course.getCsId());
		//总记录数
		int count = query.list().size();
		pagebean.setTotalCount(count);
		//设置当前页
		pagebean.setPageIndex(pageIndex);
		//当前页数据，进行分页
		List<WrittenTest> list = query.setFirstResult((pagebean.getPageIndex()-1)*pagebean.getPageSize())
				.setMaxResults(pagebean.getPageSize())
				.list();
		//设置pagebean的数据集合
		pagebean.setList(list);
		Transaction tx = getSession().beginTransaction();
		tx.commit();
		//关闭会话
		getSession().close();
		return pagebean;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.dao.QuestionBaseDao#addWritten(com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest)
	 */
	@Override
	public void addWritten(WrittenTest written) {
		// TODO Auto-generated method stub
		//getSession().clear();
		Session session = getSession();
		Transaction ts = session.beginTransaction();
		//进行数据持久化操作
		session.save(written);
		//提交事务
		ts.commit();
		//关闭session对象
		session.close();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.dao.QuestionBaseDao#inportWrittenQuestions(java.util.List)
	 */
	@Override
	public void inportWrittenQuestions(List<WrittenTest> writtenQuestionList) {
		// TODO Auto-generated method stub
		//创建事物对象
		Transaction tx = getSession().beginTransaction();
		for(WrittenTest question :writtenQuestionList){
			//保存数据
			getSession().save(question);
		}
		//提交事物
		tx.commit();
		//关闭会话
		getSession().close();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.dao.QuestionBaseDao#getWrittenQuestionById()
	 */
	@Override
	public WrittenTest getWrittenQuestionById(Class clazz ,Serializable i) {
		// TODO Auto-generated method stub
		//创建事物对象
			Transaction tx = getSession().beginTransaction();			
		//保存数据
			 Object obj = getSession().get(clazz, i);	
			
		//提交事物
				tx.commit();
		return (WrittenTest) obj;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.dao.QuestionBaseDao#updateWrittenQuestion()
	 */
	@Override
	public void updateWrittenQuestion(WrittenTest written) {
		// TODO Auto-generated method stub
		//清除session中缓存对象:http://blog.csdn.net/jayliu1989/article/details/78979022
			getSession().clear();
		//创建事物对象
			Transaction tx = getSession().beginTransaction();
		//保存数据
			getSession().update(written);
		//提交事物
		tx.commit();
		//关闭会话
		getSession().close();
	}

	



}
