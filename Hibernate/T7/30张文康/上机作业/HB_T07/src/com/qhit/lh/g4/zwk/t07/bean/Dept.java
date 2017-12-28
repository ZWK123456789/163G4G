package com.qhit.lh.g4.zwk.t07.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZWK
 * 创建部门表的实体类
 */

public class Dept  {
    // Fields    
     private Integer depId;
     private String deptName;
     private String address;
     //与员工表的实体类创建一对多关系
     private Set<Emp> emps = new HashSet<Emp>();
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


	/**
	 * @param depId
	 * @param deptName
	 * @param address
	 * @param emps
	 */
	public Dept(Integer depId, String deptName, String address, Set<Emp> emps) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.address = address;
		this.emps = emps;
	}


	/**
	 * @param depId
	 * @param deptName
	 * @param address
	 */
	public Dept(Integer depId, String deptName, String address) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.address = address;
	}
   








}