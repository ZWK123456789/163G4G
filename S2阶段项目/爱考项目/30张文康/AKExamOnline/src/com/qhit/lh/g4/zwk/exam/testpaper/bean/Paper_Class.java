package com.qhit.lh.g4.zwk.exam.testpaper.bean;

import java.util.Date;

/**
 * Paper_Class entity. @author MyEclipse Persistence Tools
 */

public class Paper_Class implements java.io.Serializable {

	// Fields

	private Integer pcId;
	private Integer pid;
	private String ccode;
	private Date examDate;
	private Date endDate;

	// Constructors

	/** default constructor */
	public Paper_Class() {
	}

	/** full constructor */
	public Paper_Class(Integer pid, String ccode, Date examDate, Date endDate) {
		this.pid = pid;
		this.ccode = ccode;
		this.examDate = examDate;
		this.endDate = endDate;
	}

	// Property accessors

	public Integer getPcId() {
		return this.pcId;
	}

	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getCcode() {
		return this.ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public Date getExamDate() {
		return this.examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}