/**
 * 
 */
package com.qhit.lh.g4.zwk.t06.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.qhit.lh.g4.zwk.t06.bean.Roles;
import com.qhit.lh.g4.zwk.t06.bean.UserInfo;
import com.qhit.lh.g4.zwk.t06.service.impl.BaseServiceImpl;

/**
 * @author 张文康
 *2017年12月25日下午7:42:18
 * TODO
 */
public class roles_userInfoTest {
	
	private BaseServiceImpl bsi = new BaseServiceImpl();
	//@Test
	public void add() {
		
		Roles roles = new Roles();
		roles.setRoleName("国防部长");
		roles.setMemo("北京");
		
		UserInfo userinfo =  (UserInfo) bsi.getQueryById(UserInfo.class, new Integer(1));
		
		//若把两条语句全写上，相当于重复了一遍，因为用了级联操作save-update
		roles.getUserInfos().add(userinfo);
		//userinfo.getRoles().add(roles);
		
		bsi.add(roles);
	}

	//@Test
	public void delete() {
		
		Roles roles = (Roles) bsi.getQueryById(Roles.class, 4);
		UserInfo userinfo =  (UserInfo) bsi.getQueryById(UserInfo.class, new Integer(1));
		
		//若把两条语句全写上，相当于重复了一遍，因为用了级联操作save-update
		roles.getUserInfos().remove(userinfo);
		userinfo.getRoles().remove(roles);
		//注意这个语句的删除还是对表的一个操作，若想只删除中间关联表的内容，需要对它单独操作
		bsi.delete(roles);
	}
	//@Test
	public void get(){
		Roles roles = (Roles) bsi.getQueryById(Roles.class, 5);
		System.out.println(roles.getUserInfos());
	}
	@Test
	public void update(){
		Roles roles = (Roles) bsi.getQueryById(Roles.class, 5);
		roles.setMemo("上海");
		
		UserInfo userinfo =  (UserInfo) bsi.getQueryById(UserInfo.class, new Integer(1));
		userinfo.getRoles().add(roles);
		//这里更新的还是单表，只是捎带把中间表更新了一下
		bsi.update(roles);
	}
}
