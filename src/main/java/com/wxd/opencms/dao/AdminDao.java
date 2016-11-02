package com.wxd.opencms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxd.opencms.pojo.Admin;

public interface AdminDao {
	
	/**
	 * 查找管理员群组下的所有管理员，包括被锁定的管理员
	 * @author wangXiaodan
	 * @param groupId
	 * @return
	 */
	public List<Admin> findByGroupid(int groupId);
	public Admin findByMobile(String mobile);
	public Admin findByEmail(String email);
	public Admin findById(Integer id);
	
	/**
	 * 插入新管理员，插入成功后参数中通过getId()获取新插入数据的主键
	 * @author wangXiaodan
	 * @param admin
	 * @return	返回插入成功的条数
	 */
	public int insert(Admin admin);
	
	public int updatePwdById(@Param("id")int id,@Param("password")String password);
	public int updateNicknameById(@Param("id")int id,@Param("nickname")String nickname);
	public int update(Admin admin);
	
	/**
	 * 锁定/解锁管理员
	 * @author wangXiaodan
	 * @param id
	 * @param flag true:锁定给定ID管理员   false:解锁给定ID管理员
	 */
	public int locked(@Param("id")int id,@Param("flag")boolean flag);
	
	/**
	 * 彻底删除管理员
	 * @author wangXiaodan
	 * @param admin
	 */
	public int deleteById(int id);
	
}
