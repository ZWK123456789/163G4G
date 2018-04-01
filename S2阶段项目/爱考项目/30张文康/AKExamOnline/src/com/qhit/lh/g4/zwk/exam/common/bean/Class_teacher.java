package com.qhit.lh.g4.zwk.exam.common.bean;

/**
 * Class_teacher entity. @author MyEclipse Persistence Tools
 */

public class Class_teacher implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ccode;
	private String tid;

	// Constructors

	/** default constructor */
	public Class_teacher() {
	}

	/** full constructor */
	public Class_teacher(String ccode, String tid) {
		this.ccode = ccode;
		this.tid = tid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCcode() {
		return this.ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

}