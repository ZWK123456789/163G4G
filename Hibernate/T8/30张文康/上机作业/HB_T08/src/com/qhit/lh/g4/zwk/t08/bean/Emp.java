package com.qhit.lh.g4.zwk.t08.bean;



/**
 * @author ZWK
 * 创建员工表的实体类
 */

public class Emp  {


    // Fields    

     private Integer eid;
     private String empName;
     private String empSex;
     private String birthday;
     private Integer depId;
     //与部门表创建多对一关系
     private Dept dept ;

    // Constructors

    /** default constructor */
    public Emp() {
    }

	/** minimal constructor */
   /* public Emp(String empName, String empSex) {
        this.empName = empName;
        this.empSex = empSex;
    }*/
    
    /** full constructor */
    public Emp(String empName, String empSex, String birthday, Integer depId) {
        this.empName = empName;
        this.empSex = empSex;
        this.birthday = birthday;
        this.depId = depId;
    }

   
    // Property accessors

    public Integer getEid() {
        return this.eid;
    }
    
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return this.empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return this.empSex;
    }
    
    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public String getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getDepId() {
        return this.depId;
    }
    
    public void setDepId(Integer depId) {
        this.depId = depId;
    }

	/**
	 * @return the dept
	 */
	public Dept getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(Dept dept) {
		this.dept = dept;
	}

	/**
	 * @param eid
	 * @param empName
	 * @param empSex
	 * @param birthday
	 * @param depId
	 * @param dept
	 */
	public Emp(Integer eid, String empName, String empSex, String birthday,
			Integer depId, Dept dept) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.depId = depId;
		this.dept = dept;
	}

	/**
	 * @param eid
	 * @param empName
	 * @param empSex
	 * @param birthday
	 * @param depId
	 */
	public Emp(Integer eid, String empName, String empSex, String birthday,
			Integer depId) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.depId = depId;
	}

	/**
	 * @param empName
	 * @param birthday
	 */
	public Emp(String empName, String birthday) {
		super();
		this.empName = empName;
		this.birthday = birthday;
	}

}