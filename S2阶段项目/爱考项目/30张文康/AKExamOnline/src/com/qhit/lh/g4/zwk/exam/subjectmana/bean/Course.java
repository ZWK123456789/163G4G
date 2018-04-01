package com.qhit.lh.g4.zwk.exam.subjectmana.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Integer csId;
	private String csName;
	private String stage;
	
	//与方向表进行多对多关联
	private Set<Object> major = new HashSet<Object>();
	//与机试题表进行一对多关联
	private Set<Object> MachineTest = new HashSet<Object>();
	//与机试题表进行一对多关联
	private Set<Object> WrittenTest = new HashSet<Object>();
	// Constructors


	/** default constructor */
	public Course() {
	}

	/**
	 * @return the machineTest
	 */
	public Set<Object> getMachineTest() {
		return MachineTest;
	}

	/**
	 * @param machineTest the machineTest to set
	 */
	public void setMachineTest(Set<Object> machineTest) {
		MachineTest = machineTest;
	}

	/**
	 * @return the writtenTest
	 */
	public Set<Object> getWrittenTest() {
		return WrittenTest;
	}

	/**
	 * @param writtenTest the writtenTest to set
	 */
	public void setWrittenTest(Set<Object> writtenTest) {
		WrittenTest = writtenTest;
	}

	public Set<Object> getMajor() {
		return major;
	}

	public void setMajor(Set<Object> major) {
		this.major = major;
	}

	/** full constructor */
	public Course(String csName, String stage) {
		this.csName = csName;
		this.stage = stage;
	}

	// Property accessors

	public Integer getCsId() {
		return this.csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getCsName() {
		return this.csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

}