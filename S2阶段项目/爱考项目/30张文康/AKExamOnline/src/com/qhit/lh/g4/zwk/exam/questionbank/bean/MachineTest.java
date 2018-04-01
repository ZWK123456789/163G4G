package com.qhit.lh.g4.zwk.exam.questionbank.bean;

import com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course;

/**
 * MachineTest entity. @author MyEclipse Persistence Tools
 */

public class MachineTest implements java.io.Serializable {

	// Fields

	private Integer qid;
	private String qtitle;
	private String degree;
	private Integer csId;
	private String chapter;

	//与课程表进行多对一关联
	private Course course;
	// Constructors

	/** default constructor */
	public MachineTest() {
	}

	/** minimal constructor */
	public MachineTest(String qtitle, String degree, Integer csId) {
		this.qtitle = qtitle;
		this.degree = degree;
		this.csId = csId;
	}

	/** full constructor */
	public MachineTest(String qtitle, String degree, Integer csId,
			String chapter) {
		this.qtitle = qtitle;
		this.degree = degree;
		this.csId = csId;
		this.chapter = chapter;
	}

	// Property accessors

	public Integer getQid() {
		return this.qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public String getQtitle() {
		return this.qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}



	/**
	 * @return the csId
	 */
	public Integer getCsId() {
		return csId;
	}

	/**
	 * @param csId the csId to set
	 */
	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getChapter() {
		return this.chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

}