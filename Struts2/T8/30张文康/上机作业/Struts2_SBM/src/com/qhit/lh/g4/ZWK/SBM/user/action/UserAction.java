/**
 * 
 */
package com.qhit.lh.g4.ZWK.SBM.user.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.ZWK.SBM.user.bean.User;
import com.qhit.lh.g4.ZWK.SBM.user.service.impl.UserServiceImpl;

/**
 * @author ZWK
 *2017年12月8日下午5:36:22
 *TODO
 */
public class UserAction extends ActionSupport {

	//创建User对象
	private User user ;
	private List<User> list = new ArrayList<User>();
	UserServiceImpl usi = new UserServiceImpl();
	
	public String Login(){
		user = usi.doLogin(user.getUserName(), user.getUserPassword());
		if(user != null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "LoginSuccess";
		}else{
			super.addFieldError("Login", "您输入的账号或密码有误");
			return "loginField";
		}
		
	}
	public String getAll(){
		list = usi.getAllUser();
		if(list != null){
			
			return "getList";
		}else{
			super.addFieldError("Login", "您输入的账号或密码有误");
			return "loginField";
		}
	}
	

	/**
	 * @return 创建Set/Get方法
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	
}
