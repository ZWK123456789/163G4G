/**
 * 
 */
package com.qhit.lh.g4.zwk.t07.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.qhit.lh.g4.zwk.t07.bean.Dept;
import com.qhit.lh.g4.zwk.t07.bean.Emp;
import com.qhit.lh.g4.zwk.t07.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.zwk.t07.utils.HibernateSessionFactory;

/**
 * @author ZWK
 *2017年12月26日上午11:30:36
 *TODO
 */
public class EmpTest {

	private BaseServiceImpl bsi = new BaseServiceImpl();
	//@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEmpName("赵四");
		emp.setBirthday("2017-02-01");
		emp.setEmpSex("M");
		Dept dept = (Dept) bsi.getQueryById(Dept.class, 1);
		emp.setDept(dept);
		bsi.add(emp);
	}
	@Test
	public void getAttruse(){
		//用HQL语句查询所有员工
		//String hql = "select e from Emp e  ";
		
		//进行模糊查询，有两种方式
		//String hql = "select e from Emp e where e.empName like ? ";
		//String hql = "select e from Emp e where e.empName like :name ";
		
		//进行属性查询
	 	//String hql = "select e.empName,e.birthday from Emp e where e.empName like :name ";
		
		//实例化查询时实体类中必须有相应的构造函数，如下面的查询必须有姓名与出生日期的构造函数
		//String hql = "select new Emp(e.empName,e.birthday) from Emp e where e.empName like :name ";
		
		//当进行多表联查时，可以先查出“一”方的对象，再用“一”方设置的盛放“多”方的集合查询“多”方
		//String hql = "select d from Dept d where d.deptName like :name ";

		//HQL语句也能用聚合函数，这里的d.emps相当于一个表
		//String hql = "select d.deptName,count(e) from Dept d left join d.emps e where d.deptName like :name group by d.deptName ";
		
		//HQL子查询这里用的是“一”方预先设置的，“多”方的对象，且条件必须先写好，不能再用Set方法设置
		//String hql = "select e from Emp e where e.dept = (select d from Dept d where d.deptName='研发部' )";
		
		//HQL的多态查询可以一次查询整个实体类（表）的数据记录
		String hql = "select d from com.qhit.lh.g4.zwk.t07.bean.Dept d ";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		//为HQL语句增加条件
		//query.setString("name", "研发部");
		//进行属性查询时返回的是数组
		//List<Object[]> list = query.list();
		List<Object> list = query.list();
		
		/*for (Object obj : list) {
			Dept dept = (Dept) obj;	
			System.out.println(dept.getDeptName()+"员工有：");
			for(Object o :dept.getEmps()){
				Emp emp = (Emp) o;
				System.out.println(emp.getEmpName());
			}
		}*/
		for (Object obj : list) {
		
			System.out.println(obj);
		}
		HibernateSessionFactory.closeSession();
	}
}
