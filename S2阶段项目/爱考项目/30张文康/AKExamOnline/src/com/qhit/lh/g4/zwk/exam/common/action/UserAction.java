/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.zwk.exam.common.bean.User;
import com.qhit.lh.g4.zwk.exam.common.service.impl.UserBaseServiceImpl;

/**
 * @author ZWK
 *2017年12月29日上午10:47:07
 *TODO
 */
public class UserAction extends ActionSupport {

	private User user;
	private UserBaseServiceImpl ubsi = new UserBaseServiceImpl();
	
	public String Login(){
		user = (User) ubsi.UserLogin(user);
		if (user != null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "Loginsuccess";
		}else{
			super.addFieldError("Error", "您输入的信息有误，请重新输入");
			return "LoginFaile";
		}
		
	}
	
	
	
	
	/**
	 * @return the user
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
	
}
