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
	 * 
	 * @author wangXiaodan
	 * @return
	 */
	public List<Role> findAllRoles();

	public Role findById(int id);

	public List<Role> findByAdmingroupid(int groupId);

	/**
	 * 查询管理员下的所有角色，包括此管理员所在群组的角色
	 * 
	 * @author wangXiaodan
	 * @param adminId
	 * @return
	 */
	public List<Role> findByAdminid(int adminId);
}
