package com.wxd.opencms.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.wxd.opencms.BaseJunit4Test;
import com.wxd.opencms.pojo.Role;

public class RoleDaoTest extends BaseJunit4Test {
	@Resource(name="roleDao")
	protected RoleDao roleDao;
	
	@Test
	public void testFindAllRoles() {
		List<Role> allRoles = roleDao.findAllRoles();
		assertTrue(allRoles.size() > 0);
	}

	@Test
	public void testFindById() {
		Role role = roleDao.findById(1);
		assertTrue(role != null);
	}

	@Test
	public void testFindByAdmingroupid() {
		List<Role> roles = roleDao.findByAdmingroupid(1);
		assertTrue(roles.size() > 0 );
	}

	@Test
	public void testFindByAdminid() {
		List<Role> roles = roleDao.findByAdminid(1);
		assertTrue(roles.size() > 0 );
	}

}
