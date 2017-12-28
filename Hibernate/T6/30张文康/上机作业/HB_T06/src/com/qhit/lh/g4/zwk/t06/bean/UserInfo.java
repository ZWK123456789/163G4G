/**
 * 
 */
package com.qhit.lh.g4.zwk.t06.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 张文康
 *2017年12月25日下午6:26:11
 * TODO
 */
public class UserInfo {
	 //账户表变量
     private int uid;
	 private String userName;
	 private String userPassword;
	 //与角色表的实体类建立多对多关系
	 private Set<Roles> roles = new HashSet<Roles>();
	 //与员工表的实体类建立一对一关系
	 private Emp emp;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Set<Roles> getRoles() {
		return roles;
	}
	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(int uid, String userName, String userPassword,
			Set<Roles> roles, Emp emp) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.userPassword = userPassword;
		this.roles = roles;
		this.emp = emp;
	}
	public UserInfo(int uid, String userName, String userPassword) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.userPassword = userPassword;
	} 
	
}
