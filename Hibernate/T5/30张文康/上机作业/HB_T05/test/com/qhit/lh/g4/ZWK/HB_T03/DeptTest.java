/**
 * 
 */
package com.qhit.lh.g4.ZWK.HB_T03;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

import com.qhit.lh.g4.ZWK.HB_T05.bean.Dept;
import com.qhit.lh.g4.ZWK.HB_T05.bean.Emp;
import com.qhit.lh.g4.ZWK.HB_T05.bean.UserInfo;
import com.qhit.lh.g4.ZWK.HB_T05.sevice.impl.BaseServiceImpl;

/**
 * @author ZWK
 *2017年12月15日上午9:27:54
 *TODO在操作中每个模块只对每个模块进行操作不要错乱
 */
public class DeptTest {
	private BaseServiceImpl bsi = new BaseServiceImpl(); 
	//@Test
	public void add() {
		//创建部门
		Dept dept =new Dept();
		dept.setDeptName("核弹部");
		dept.setAddress("撒哈拉沙漠");
		//1，没有分配员工
		//2，新招员工,添加到本部门
		Emp emp = new Emp();
		emp.setEmpName("H");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-15");
		//为新建员工分配账号
		UserInfo ui = new UserInfo ();
		ui.setUserName("H");
		ui.setUserPassword("123456");
		//执行一对一关系
		emp.setUserinfo(ui);
		ui.setEmp(emp);
		//添加多对一
		//emp.setDept(dept);
		//3,从老员工中调配
	   //Emp emp1 = (Emp) bsi.getObjectById(Emp.class, 2);
		//一对多的关系
	   //这里不需要在进行多对一的编写，因为无论是一对多还是多对一都是对一个对象的修改（这里指员工）
	   //所以不需要重复编写(编写了无所谓)
		emp.setDept(dept);
		dept.getEmps().add(emp);
		//dept.getEmps().add(emp1);
		bsi.add(dept);
	}
	//@Test
	public void delete() {
		//删除ID为5的部门
		Dept dept = (Dept) bsi.getObjectById(Dept.class, 5);
		bsi.delete(dept);
	}
	@Test
	public void query() {
		Dept dept = (Dept) bsi.getObjectById(Dept.class, 4);
	    //注意在这里进行强制类型转换会打印不出对象信息
		Set<Emp> set = dept.getEmps();
		for(Emp emp:set){
			System.out.println(dept.getDeptName()+":"+emp.getEmpName());
		}
	}
	//@Test
	public void update() {
		//更新部门信息
		Dept dept = new Dept();
		dept.setDeptName("外星部");
		dept.setAddress("神农架");
		dept.setDepId(1);
		//注意在更新部门信息是，部门下面的员工会丢失部门ID，故需要重新添加
		dept.getEmps().add((Emp)bsi.getObjectById(Emp.class,3));
		bsi.update(dept);
	}

}
