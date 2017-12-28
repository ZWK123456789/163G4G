package com.qhit.lh.g4.ZWK.HB_T05.bean;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String userName;
	private String userPassword;
	//进行关联
	private Emp emp;
	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String userName) {
		this.userName = userName;
	}

	/** full constructor */
	public UserInfo(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the emp
	 */
	public Emp getEmp() {
		return emp;
	}

	/**
	 * @param emp the emp to set
	 */
	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}