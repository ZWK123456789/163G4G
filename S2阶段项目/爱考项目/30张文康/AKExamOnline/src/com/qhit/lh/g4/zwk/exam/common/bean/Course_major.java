package com.qhit.lh.g4.zwk.exam.common.bean;

/**
 * Course_major entity. @author MyEclipse Persistence Tools
 */

public class Course_major implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer csId;
	private Integer mjId;

	// Constructors

	/** default constructor */
	public Course_major() {
	}

	/** full constructor */
	public Course_major(Integer csId, Integer mjId) {
		this.csId = csId;
		this.mjId = mjId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCsId() {
		return this.csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public Integer getMjId() {
		return this.mjId;
	}

	public void setMjId(Integer mjId) {
		this.mjId = mjId;
	}

}