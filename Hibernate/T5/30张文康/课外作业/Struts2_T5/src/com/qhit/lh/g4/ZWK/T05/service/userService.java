package com.qhit.lh.g4.ZWK.T05.service;

import java.util.List;

import com.qhit.lh.g4.ZWK.T05.bean.TbUser;

public interface userService {
	public List All ();
	public List getAlls (TbUser user);
	public int delete(int uid);
	public int addUser(TbUser user);
	public TbUser getUser(int uid);
	public int update (TbUser user);
}
