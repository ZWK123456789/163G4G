/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T03;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.ZWK.HB_T05.bean.Dept;
import com.qhit.lh.g4.ZWK.HB_T05.bean.Emp;
import com.qhit.lh.g4.ZWK.HB_T05.bean.UserInfo;
import com.qhit.lh.g4.ZWK.HB_T05.sevice.impl.BaseServiceImpl;

/**
 * @author ZWK
 *2017年12月13日下午5:45:08
 *TODO
 */
public class EmpTest {
	private BaseServiceImpl bsi = new BaseServiceImpl(); 
	//@Test
	public void add() {
		//创建员工类对象
		Emp emp = new Emp();
		emp.setEmpName("bobe");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-13");
		//创建员工信息类对象
		UserInfo userinfo = new UserInfo();
		userinfo.setUserName("bobe");
		userinfo.setUserPassword("123456");
		//进行一对一映射
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		//获取员工部门对象
		Dept dept = (Dept) bsi.getObjectById(Dept.class, 1);
		emp.setDept(dept);
		bsi.add(emp);
	}
	//@Test
	public void update() {
		Emp emp = (Emp) bsi.getObjectById(Emp.class, 1);
		Emp emp1 = (Emp) bsi.getObjectById(Emp.class, 2);
		Dept dept = (Dept) bsi.getObjectById(Dept.class, 4);
		emp.setDept(dept);
		emp1.setDept(dept);
		bsi.update(emp);
		bsi.update(emp1);
		
	}
	//@Test
	public void delete() {
		
	}
	//@Test
	public void query() {
		
	}
	

}
