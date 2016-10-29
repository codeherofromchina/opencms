package com.wxd.opencms.pojo;

import java.io.Serializable;

/**
 * 管理員信息
 * 
 * @date Oct 28, 2016
 * @author wangXiaodan
 */
public class Admin implements Serializable{
	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String mobile;
	private String email;
	private String password;
	private String nickname;
	private String truename;
	private boolean locked = false;
	private boolean superAdmin = false;
	
	public boolean isSuperAdmin() {
		return superAdmin;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
}
