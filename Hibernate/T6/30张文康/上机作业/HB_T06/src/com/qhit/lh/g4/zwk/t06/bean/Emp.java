/**
 * 
 */
package com.qhit.lh.g4.zwk.t06.bean;

/**
 * @author ZWK
 *2017年12月12日下午2:54:11
 *TODO员工类
 */
public class Emp {
	private int eid;
	private String  empName;
	private String  empSex;
	private String  birthday;
	private int depId;
	//一一对应的关系
	private UserInfo userinfo;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	public Emp(int eid, String empName, String empSex, String birthday,
			int depId) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.depId = depId;
	}

	public Emp(int eid, String empName, String empSex, String birthday,
			int depId, UserInfo userinfo) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.depId = depId;
		this.userinfo = userinfo;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
