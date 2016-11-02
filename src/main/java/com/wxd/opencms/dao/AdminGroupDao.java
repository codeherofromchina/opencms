package com.wxd.opencms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxd.opencms.pojo.AdminGroup;

public interface AdminGroupDao {
	
	public int insert(AdminGroup group);
	public AdminGroup findById(int groupId);
	
	public List<AdminGroup> findByAdminidOrderSortDesc(int adminId);
	/**
	 * 群组内加入管理员
	 * @author wangXiaodan
	 */
	public int joinAdmin(@Param("groupId")int groupId,@Param("adminId")int adminId);
	public int removeAdminByAdminid(@Param("groupId")int groupId,@Param("adminId")int adminId);
	
	public int update(AdminGroup group);
	
	public int deleteById(int id);
}
