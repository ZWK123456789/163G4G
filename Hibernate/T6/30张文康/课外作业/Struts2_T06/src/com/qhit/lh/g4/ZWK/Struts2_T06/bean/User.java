/**
 * 
 */
package com.qhit.lh.g4.ZWK.Struts2_T06.bean;

/**
 * @author ZWK
 *2017年12月6日上午9:54:26
 *TODO
 */
public class User {

	private int uid;
	private String uname;
	private String upwd;
	private String email;
	private String tel;
	private String adders;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdders() {
		return adders;
	}
	public void setAdders(String adders) {
		this.adders = adders;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String upwd, String email, String tel, String adders) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.email = email;
		this.tel = tel;
		this.adders = adders;
	}
	
	
}
