package com.qhit.lh.g4.ZWK.HB_T05.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String empName;
	private String empSex;
	private String birthday;
	private Integer depId;
	//进行一对一关联
	private UserInfo userinfo;
	//进行多对一关联
	private Dept dept;
	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(String empName, String empSex) {
		this.empName = empName;
		this.empSex = empSex;
	}

	/** full constructor */
	public Emp(String empName, String empSex, String birthday, Integer depId) {
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.depId = depId;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return this.empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	/**
	 * @return the userinfo
	 */
	public UserInfo getUserinfo() {
		return userinfo;
	}

	/**
	 * @param userinfo the userinfo to set
	 */
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	/**
	 * @return the dept
	 */
	public Dept getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(Dept dept) {
		this.dept = dept;
	}

}