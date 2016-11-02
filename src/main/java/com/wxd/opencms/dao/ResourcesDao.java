package com.wxd.opencms.dao;

import java.util.List;

import com.wxd.opencms.pojo.Resources;

/**
 * 资源路径数据查找规范接口
 * 
 * @date Oct 29, 2016
 * @author wangXiaodan
 */
public interface ResourcesDao {
	public List<Resources> findByRoleid(int roleId);
	
	public List<Resources> findByPath(String path);
}
