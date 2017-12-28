package com.qhit.lh.g4.zwk.t06.bean;

import java.util.HashSet;
import java.util.Set;

public class Roles{
    //角色表变量
	private int roleId;
	private String roleName;
	private String memo;
	//与账户表实体类建立多对多关系
	private Set<UserInfo> userInfos = new HashSet<UserInfo>();
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Set<UserInfo> getUserInfos() {
		return userInfos;
	}
	public void setUserInfos(Set<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Roles(int roleId, String roleName, String memo,
			Set<UserInfo> userInfos) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
		this.userInfos = userInfos;
	}
	public Roles(int roleId, String roleName, String memo) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.memo = memo;
	}
	
	
}
