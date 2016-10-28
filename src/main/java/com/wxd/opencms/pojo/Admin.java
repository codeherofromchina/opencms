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
	
	private int id;
	private int mobile;
	private String email;
	private String password;
	private String nickname;
	private String truename;
	private boolean locked = false;
	private boolean superAdmin = false;
	
	public boolean isSuperAdmin() {
		return superAdmin;
	}
}
