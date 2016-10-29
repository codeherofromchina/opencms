package com.wxd.opencms.pojo;

import java.io.Serializable;
/**
 * 系统资源
 * 
 * @date Oct 29, 2016
 * @author wangXiaodan
 */
public class Resources implements Serializable{
	private static final long serialVersionUID = 1L;

	private int id;
	/**
	 * 资源路径或路径正则
	 */
	private String path;
	private String resDesc;
	private Role role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getResDesc() {
		return resDesc;
	}
	public void setResDesc(String resDesc) {
		this.resDesc = resDesc;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}	
