package com.wxd.opencms.pojo;

import java.io.Serializable;

/**
 * 角色信息
 * 
 * @date Oct 28, 2016
 * @author wangXiaodan
 */
public class Role implements Serializable{
	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 角色ID,主键
	 */
	private int id;
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 角色编码
	 */
	private String roleCode;
	/**
	 * 角色职能描述
	 */
	private String roleDesc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRoleCode() {
		return roleCode;
	}
	
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	
}
