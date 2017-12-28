/**
 * 
 */
package com.qhit.lh.g4.ZWK.Struts2_T06.action;

import java.util.regex.Pattern;

import org.apache.commons.lang3.Validate;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.ZWK.Struts2_T06.bean.User;

/**
 * @author ZWK
 *2017年12月6日上午9:38:11
 *TODO
 */
public class UserAction extends ActionSupport {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String show() {
		
		return "show";
	}
	public String lang() {
		System.out.println(122121);
		return "language";
	}
	
	/**
	 * 
	 */
/* (non-Javadoc)
 * @see com.opensymphony.xwork2.ActionSupport#validate()
 */
@Override
public void validate() {
	// TODO Auto-generated method stub
	super.validate();
	Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z1-9_-]+$");
	//matcher得到对象matchers为方法
	if(!pattern.matcher(user.getUname()).matches()) {
		super.addFieldError("label.login", getText("用户名格式不对"));
	}
		if(" ".equals(user.getUname())){
			super.addFieldError("label.login", "没有填写用户名");
		}else if("".equals(user.getUpwd())){
			super.addFieldError("label.login", "没有填写密码");
		}
	}

	
}
