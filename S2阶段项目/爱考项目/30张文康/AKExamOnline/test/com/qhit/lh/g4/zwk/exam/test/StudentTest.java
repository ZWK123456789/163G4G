/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.zwk.exam.common.bean.Student;
import com.qhit.lh.g4.zwk.exam.common.bean.User;
import com.qhit.lh.g4.zwk.exam.common.service.impl.UserBaseServiceImpl;

/**
 * @author ZWK
 *2017年12月29日上午11:18:47
 *TODO
 */
public class StudentTest {
	
	private UserBaseServiceImpl ubsi = new UserBaseServiceImpl();
	@Test
	public void add() {
		Student student = new Student();
		student.setSname("小明");
		student.setSex("M");
		//student.setcCode(160001);
		//入学年份这里只能写4个字符
		student.setEnterSchool("2016");
		
		User user = new User();
		user.setName("16030321001");
		user.setPwd("123456");
		user.setRole(1);

		student.setUser(user);
		ubsi.add(student);
		
	}

}
