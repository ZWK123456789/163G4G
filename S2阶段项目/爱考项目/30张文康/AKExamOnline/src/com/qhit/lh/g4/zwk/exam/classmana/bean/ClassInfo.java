package com.qhit.lh.g4.zwk.exam.classmana.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.qhit.lh.g4.zwk.exam.common.bean.Teacher;
import com.qhit.lh.g4.zwk.exam.majordirection.bean.Major;

/**
 * ClassInfo entity. @author MyEclipse Persistence Tools
 */

public class ClassInfo implements java.io.Serializable {

	// Fields

	private String ccode;
	private String cname;
	private Integer mjId;
	private String insId;
	private String iecId;
	private Date cdate;
	private Integer g1num;
	private Integer g2num;
	private Integer g3num;
	private Integer csId;
	private String cremark;

	//与学生表进行一对多的关联
	private Set<Object> students = new HashSet<Object>();
	//与教师表辅导员进行多对一的关联
	//private Set<Object> teachers = new HashSet<Object>();
	private Teacher insIdTeacher;
	//与教师表讲师进行多对一的关联
	private Teacher iecIdTeacher;
	//与方向表进行多对一的关联
	private Major major ;
	// Constructors

	/** default constructor */
	public ClassInfo() {
	}

	/** minimal constructor */
	public ClassInfo(String cname, Integer mjId, String insId, String iecId,
			Date cdate) {
		this.cname = cname;
		this.mjId = mjId;
		this.insId = insId;
		this.iecId = iecId;
		this.cdate = cdate;
	}

	/** full constructor */
	public ClassInfo(String cname, Integer mjId, String insId, String iecId,
			Date cdate, Integer g1num, Integer g2num, Integer g3num,
			Integer csId, String cremark) {
		this.cname = cname;
		this.mjId = mjId;
		this.insId = insId;
		this.iecId = iecId;
		this.cdate = cdate;
		this.g1num = g1num;
		this.g2num = g2num;
		this.g3num = g3num;
		this.csId = csId;
		this.cremark = cremark;
	}

	// Property accessors

	public String getCcode() {
		return this.ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getMjId() {
		return this.mjId;
	}

	public void setMjId(Integer mjId) {
		this.mjId = mjId;
	}

	public String getInsId() {
		return this.insId;
	}

	public void setInsId(String insId) {
		this.insId = insId;
	}

	public String getIecId() {
		return this.iecId;
	}

	public void setIecId(String iecId) {
		this.iecId = iecId;
	}

	public Date getCdate() {
		return this.cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Integer getG1num() {
		return this.g1num;
	}

	public void setG1num(Integer g1num) {
		this.g1num = g1num;
	}

	public Integer getG2num() {
		return this.g2num;
	}

	public void setG2num(Integer g2num) {
		this.g2num = g2num;
	}

	public Integer getG3num() {
		return this.g3num;
	}

	public void setG3num(Integer g3num) {
		this.g3num = g3num;
	}

	public Integer getCsId() {
		return this.csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getCremark() {
		return this.cremark;
	}

	public void setCremark(String cremark) {
		this.cremark = cremark;
	}

	public Set<Object> getStudents() {
		return students;
	}

	public void setStudents(Set<Object> students) {
		this.students = students;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	/**
	 * @return the insIdTeacher
	 */
	public Teacher getInsIdTeacher() {
		return insIdTeacher;
	}

	/**
	 * @param insIdTeacher the insIdTeacher to set
	 */
	public void setInsIdTeacher(Teacher insIdTeacher) {
		this.insIdTeacher = insIdTeacher;
	}

	/**
	 * @return the iecIdTeacher
	 */
	public Teacher getIecIdTeacher() {
		return iecIdTeacher;
	}

	/**
	 * @param iecIdTeacher the iecIdTeacher to set
	 */
	public void setIecIdTeacher(Teacher iecIdTeacher) {
		this.iecIdTeacher = iecIdTeacher;
	}


}