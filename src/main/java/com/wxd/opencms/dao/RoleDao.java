package com.wxd.opencms.dao;

import java.util.List;

import com.wxd.opencms.pojo.Role;

/**
 * 平台角色数据库操作接口规范.
 * 
 * @date Oct 28, 2016
 * @author wangXiaodan
 */
public interface RoleDao {
	/**
	 * 查找平台的所有角色
	 * @author wangXiaodan
	 * @return
	 */
	public List<Role> findAllRoles();
}
