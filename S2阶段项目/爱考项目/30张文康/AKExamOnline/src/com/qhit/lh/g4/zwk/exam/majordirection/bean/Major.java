package com.qhit.lh.g4.zwk.exam.majordirection.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Major entity. @author MyEclipse Persistence Tools
 */

public class Major implements java.io.Serializable {

	// Fields

	private Integer mjId;
	private String mjName;

	//与班级表进行一对多关联
	private Set<Object> classInfo = new HashSet<Object>();
	//与课程表进行多对多关联
	private Set<Object> course = new HashSet<Object>();
	// Constructors

	public Set<Object> getCourse() {
		return course;
	}

	public void setCourse(Set<Object> course) {
		this.course = course;
	}

	public Set<Object> getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(Set<Object> classInfo) {
		this.classInfo = classInfo;
	}

	/** default constructor */
	public Major() {
	}

	/** full constructor */
	public Major(String mjName) {
		this.mjName = mjName;
	}

	// Property accessors

	public Integer getMjId() {
		return this.mjId;
	}

	public void setMjId(Integer mjId) {
		this.mjId = mjId;
	}

	public String getMjName() {
		return this.mjName;
	}

	public void setMjName(String mjName) {
		this.mjName = mjName;
	}

}