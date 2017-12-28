package com.qhit.lh.g4.ZWK.SBM.user.service.impl;

import java.util.List;

import com.qhit.lh.g4.ZWK.SBM.user.bean.User;
import com.qhit.lh.g4.ZWK.SBM.user.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.ZWK.SBM.user.service.UserService;


public class UserServiceImpl implements UserService {
	UserDaoImpl udi = new UserDaoImpl();
	@Override
	public User doLogin(String name, String passWord) {
		// TODO Auto-generated method stub
		return udi.doLogin(name, passWord);
	}

	@Override
	public int updatePassword(String newPwd , int userId) {
		// TODO Auto-generated method stub
		return udi.updatePassword(newPwd, userId);
	}

/*	@Override
	public List selectUser(PageBean userPage) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().selectUser(userPage);
	}*/

	@Override
	public int addUser(User addUser) {
		// TODO Auto-generated method stub
		return udi.addUser(addUser);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.ZWK.SBM.user.service.UserService#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return udi.getAllUser();
	}

}
