/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.common.interceptor;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qhit.lh.g4.zwk.exam.common.bean.User;
import com.qhit.lh.g4.zwk.exam.common.utils.Constans;

/**
 * @author 张文康
 *2018年1月1日下午5:42:03
 * TODO
 */
public class LoginInterceptor extends AbstractInterceptor {

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user == null){
			//登录失败
			return Constans.VIEW_LOGIN;
		}
		return arg0.invoke();
	}

}
