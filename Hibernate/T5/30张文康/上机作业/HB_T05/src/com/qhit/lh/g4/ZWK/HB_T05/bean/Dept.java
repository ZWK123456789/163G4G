package com.qhit.lh.g4.ZWK.HB_T05.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer depId;
	private String deptName;
	private String address;
	//一对多
	private Set<Emp> emps =new  HashSet<Emp>();
	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String deptName, String address) {
		this.deptName = deptName;
		this.address = address;
	}

	// Property accessors

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the emps
	 */
	public Set<Emp> getEmps() {
		return emps;
	}

	/**
	 * @param emps the emps to set
	 */
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}