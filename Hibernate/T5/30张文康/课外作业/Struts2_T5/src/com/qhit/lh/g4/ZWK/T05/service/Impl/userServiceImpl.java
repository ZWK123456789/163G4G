package com.qhit.lh.g4.ZWK.T05.service.Impl;

import java.util.List;

import com.qhit.lh.g4.ZWK.T05.bean.TbUser;
import com.qhit.lh.g4.ZWK.T05.dao.Impl.userDaoImpl;
import com.qhit.lh.g4.ZWK.T05.service.userService;

public class userServiceImpl implements userService {

	@Override
	public List getAlls(TbUser user) {
		// TODO Auto-generated method stub
		return new userDaoImpl().getAlls(user);
	}

	@Override
	public int delete(int uid) {
		// TODO Auto-generated method stub
		return new userDaoImpl().delete(uid);
	}

	@Override
	public int addUser(TbUser user) {
		// TODO Auto-generated method stub
		return new userDaoImpl().addUser(user);
	}

	@Override
	public TbUser getUser(int uid) {
		// TODO Auto-generated method stub
		return new userDaoImpl().getUser(uid);
	}

	@Override
	public int update(TbUser user) {
		// TODO Auto-generated method stub
		return new userDaoImpl().update(user);
	}

	@Override
	public List All() {
		// TODO Auto-generated method stub
		return new userDaoImpl().All();
	}

}
