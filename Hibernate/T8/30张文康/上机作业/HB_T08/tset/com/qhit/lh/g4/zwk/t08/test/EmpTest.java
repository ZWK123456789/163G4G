/**
 * 
 */
package com.qhit.lh.g4.zwk.t08.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.junit.Test;

import com.qhit.lh.g4.zwk.t08.bean.Dept;
import com.qhit.lh.g4.zwk.t08.bean.Emp;
import com.qhit.lh.g4.zwk.t08.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.zwk.t08.utils.HibernateSessionFactory;

/**
 * @author ZWK
 *2017年12月26日上午11:30:36
 *TODO
 */
public class EmpTest {

	private BaseServiceImpl bsi = new BaseServiceImpl();
	@Test
	public void QBCQuery() {
	//Session session = HibernateSessionFactory.getSession();
	//单表的模糊查询
	//Criteria criteria = session.createCriteria(Emp.class)
		//	.add(Restrictions.like("empName", "t%"));
	
	//投影查询，即相当于HQL的属性查询
	/*Criteria criteria = session.createCriteria(Emp.class)
					.add(Restrictions.like("empName", "t%"));
	ProjectionList projectionlist = Projections.projectionList()
													.add(Projections.property("empName"))
													.add(Projections.property("empSex"))
													.add(Projections.property("birthday"));
	
  criteria.setProjection(projectionlist);*/
	
	//多表查询，其实与HQL语句的多表查询一样，dept还是预先设置的关联属性
	//注意这里的FetchMode.JOIN中的JOIN为预先抓取
	/*Criteria criteria = session.createCriteria(Emp.class)
								.setFetchMode("dept",FetchMode.JOIN )
								.createAlias("dept", "d")
								.add(Restrictions.like("d.deptName", "研发部"));*/
	//进行统计查询
	/*Criteria criteria = session.createCriteria(Dept.class)
								.setFetchMode("emps", FetchMode.JOIN)
								.createAlias("emps", "e", JoinType.LEFT_OUTER_JOIN);
								//这个方法不能用了，过时了
								//.createAlias("emps", "e",criteria.LEFT_JOIN);
								//.add(Restrictions.like("e.empName","研发部" ));
	ProjectionList projectionlist = Projections.projectionList()
			//这是分组属性
													.add(Projections.groupProperty("deptName"))
													.add(Projections.groupProperty("address"))
													.add(Projections.count("e.eid"));
												
	criteria.setProjection(projectionlist);*/
  DetachedCriteria detachedcriteria = DetachedCriteria.forClass(Dept.class);
		  detachedcriteria.setFetchMode("emps", FetchMode.JOIN)
		  								.createAlias("emps", "e",JoinType.LEFT_OUTER_JOIN);
		  //虽然是离线查询，但仍然需要session建立连接
  Session session = HibernateSessionFactory.getSession();
  Criteria criteria = detachedcriteria.getExecutableCriteria(session);
	List<Object> list = criteria.list();
	//查询出的是Dept类的对象
	for(Object obj : list){
		//Emp emp = (Emp) obj;
		Dept dept = (Dept) obj;
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDeptName()+":"+emp.getEmpName());
			System.out.println(obj);
		}
	
		
		//System.out.println(obj[0]+"\t"+obj[1]+"\t"+obj[2]);
	}
	}
}
