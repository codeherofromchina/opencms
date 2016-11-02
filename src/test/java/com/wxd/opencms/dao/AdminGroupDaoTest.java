package com.wxd.opencms.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.wxd.opencms.BaseJunit4Test;
import com.wxd.opencms.pojo.AdminGroup;

public class AdminGroupDaoTest extends BaseJunit4Test{
	
	@Resource
	private AdminGroupDao adminGroupDao;
	
	@Test
	public void testInsert() {
		AdminGroup adminGroup = new AdminGroup();
		adminGroup.setGroupDesc("super");
		adminGroup.setGroupName("super");
		adminGroup.setSort(1);
		
		int insert = adminGroupDao.insert(adminGroup);
		assertTrue(insert == 1);
		assertTrue(adminGroup!=null);
	}

	@Test
	public void testFindById() {
		AdminGroup adminGroup = adminGroupDao.findById(1);
		
		assertTrue(adminGroup != null);
	}

	@Test
	public void testFindByAdminidOrderSortDesc() {
		List<AdminGroup> adminGroups = adminGroupDao.findByAdminidOrderSortDesc(1);
		assertTrue(adminGroups.size() > 0);
	}

	@Test
	public void testJoinAdmin() {
		int joinAdmin = adminGroupDao.joinAdmin(1, 1);
		assertEquals(joinAdmin, 1);
	}

	@Test
	public void testRemoveAdminByAdminid() {
		int removeNum = adminGroupDao.removeAdminByAdminid(1, 1);
		assertEquals(removeNum, 1);
	}

	@Test
	public void testUpdate() {
		AdminGroup aGroup = adminGroupDao.findById(1);
		aGroup.setGroupName(aGroup.getGroupName() + "1");
		
		int updateNum = adminGroupDao.update(aGroup);
		assertEquals(updateNum, 1);
	}

	@Test
	public void testDeleteById() {
		int delNum = adminGroupDao.deleteById(1);
		assertEquals(delNum, 1);	
	}

}
