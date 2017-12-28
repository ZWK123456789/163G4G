package com.qhit.lh.g4.ZWK.T05.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.ZWK.T05.bean.TbUser;
import com.qhit.lh.g4.ZWK.T05.service.Impl.BaseServiceImpl;
import com.qhit.lh.g4.ZWK.T05.service.Impl.userServiceImpl;

public class UserAction extends ActionSupport {
	private TbUser user;
	private List<Object> userList;
	private userServiceImpl usi = new userServiceImpl();
	private BaseServiceImpl bsi = new BaseServiceImpl();
	
	public String  getAll() throws Exception{
		userList = bsi.getList("from TbUser");
		if(userList != null ){
			return "listUser";
		}else{
			return "error";
		}
	}
	public String  All() throws Exception{
		userList = bsi.getList("from TbUser");
		if(userList != null ){
			return "listUser";
		}else{
			return "error";
		}

	}
	public String  Add() throws Exception{
		bsi.add(user);
		
			return "add";
		
	
	}
	public String  Update() throws Exception{
		 bsi.update(user);
		
			return "update";

	}
	public String  get() throws Exception{
		user =bsi.getQueryById(TbUser.class, user.getUid());
		if( user != null){
			return "getu";
		}else{
			return "error";
		}

	}
	public String  Delete() throws Exception{
		user =bsi.getQueryById(TbUser.class, user.getUid());
		if( user != null){
			bsi.delete(user);
			return "delete";
		}else{
			return "error";
		}

	}



	public TbUser getUser() {
		return user;
	}

	public void setUser(TbUser user) {
		this.user = user;
	}
	public List<Object> getUserList() {
		return userList;
	}
	public void setUserList(List<Object> userList) {
		this.userList = userList;
	}



}
