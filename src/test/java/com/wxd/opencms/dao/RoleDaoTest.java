package com.wxd.opencms.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.wxd.opencms.BaseJunit4Test;
import com.wxd.opencms.pojo.Role;

/**
 * TODO 未完成
 * 
 * @date Oct 29, 2016
 * @author wangXiaodan
 */
public class RoleDaoTest extends BaseJunit4Test{
	@Resource(name="roleDao")
	protected RoleDao roleDao;
	
	@Test
	public void testFindAllRole() {
		List<Role> allRoles = roleDao.findAllRoles();
		assertTrue(allRoles.size() > 0);
	}
	
}
