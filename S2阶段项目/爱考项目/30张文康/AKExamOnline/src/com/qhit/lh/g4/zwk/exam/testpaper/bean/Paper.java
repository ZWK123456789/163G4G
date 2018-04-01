package com.qhit.lh.g4.zwk.exam.testpaper.bean;

/**
 * Paper entity. @author MyEclipse Persistence Tools
 */

public class Paper implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private Integer ptime;
	private Integer ptotalScore;
	private Integer csId;
	private Integer qtotal;
	private Integer qscore;
	private String ptype;
	private String pstate;

	//与试卷-班级表建立多对一的关系
	private Paper_Class paperClass;
	// Constructors

	/** default constructor */
	public Paper() {
	}

	/** full constructor */
	public Paper(String pname, Integer ptime, Integer ptotalScore,
			Integer csId, Integer qtotal, Integer qscore, String ptype,
			String pstate) {
		this.pname = pname;
		this.ptime = ptime;
		this.ptotalScore = ptotalScore;
		this.csId = csId;
		this.qtotal = qtotal;
		this.qscore = qscore;
		this.ptype = ptype;
		this.pstate = pstate;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPtime() {
		return this.ptime;
	}

	public void setPtime(Integer ptime) {
		this.ptime = ptime;
	}

	public Integer getPtotalScore() {
		return this.ptotalScore;
	}

	public void setPtotalScore(Integer ptotalScore) {
		this.ptotalScore = ptotalScore;
	}

	public Integer getCsId() {
		return this.csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public Integer getQtotal() {
		return this.qtotal;
	}

	public void setQtotal(Integer qtotal) {
		this.qtotal = qtotal;
	}

	public Integer getQscore() {
		return this.qscore;
	}

	public void setQscore(Integer qscore) {
		this.qscore = qscore;
	}

	public String getPtype() {
		return this.ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPstate() {
		return this.pstate;
	}

	public void setPstate(String pstate) {
		this.pstate = pstate;
	}

	/**
	 * @return the paperClass
	 */
	public Paper_Class getPaperClass() {
		return paperClass;
	}

	/**
	 * @param paperClass the paperClass to set
	 */
	public void setPaperClass(Paper_Class paperClass) {
		this.paperClass = paperClass;
	}

}