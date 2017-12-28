package com.qhit.lh.g4.ZWK.SBM.user.service;

import java.util.List;

import com.qhit.lh.g4.ZWK.SBM.user.bean.User;

//import com.qhit.sbm.common.bean.PageBean;


public interface UserService {

	
	public User doLogin(String name,String passWord);
	public int updatePassword(String newPwd , int userId);
	//public List selectUser(PageBean userPage);
	public int addUser(User addUser);
	public List<User> getAllUser();
}
