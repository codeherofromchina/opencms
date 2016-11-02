package com.wxd.opencms.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;

import com.wxd.opencms.BaseJunit4Test;
import com.wxd.opencms.pojo.Admin;

public class AdminDaoTest extends BaseJunit4Test{
	@Resource(name="adminDao")
	protected AdminDao adminDao;
	
	@Test
	public void test1Insert() {
		Admin admin = new Admin();
		admin.setMobile("13813813813");
		admin.setEmail("13813813813@qq.com");
		admin.setPassword("827ccb0eea8a706c4c34a16891f84e7b");
		admin.setNickname("jone");
		admin.setTruename("jone");
		int insert = adminDao.insert(admin);
		assertEquals(insert, 1);
		assertTrue(admin.getId()!=null);
	}
	
	@Test
	public void test2FindByMobile() {
		Admin admin = adminDao.findByMobile("13120178521");
		assertTrue(admin != null);
		assertTrue(admin.getId() != null);
		assertEquals(admin.getEmail(), "573977818@qq.com");
	}

	@Test
	public void test2FindByEmail() {
		Admin admin = adminDao.findByEmail("573977818@qq.com");
		assertTrue(admin != null);
		assertEquals(admin.getMobile(), "13120178521");
	}

	@Test
	public void test2FindById() {
		Admin admin = adminDao.findById(4);
		assertTrue(admin != null);
		assertEquals(admin.getMobile(), "13120178521");
	}
	
	/**
	 * TODO
	 * @author wangXiaodan
	 */
	@Test
	public void test2FindByGroupid() {
		assertTrue(true);
	}

	@Test
	public void test3UpdatePwdById() {
		String pwd = "e10adc3949ba59abbe56e057f20f883e";
		int update = adminDao.updatePwdById(4, pwd);
		Admin admin = adminDao.findById(4);
		assertEquals(update, 1);
		assertEquals(admin.getPassword(), pwd);
	}

	@Test
	public void test3UpdateNicknameById() {
		String nickname = "wangxiaodan";
		int update = adminDao.updateNicknameById(4, nickname);
		Admin admin = adminDao.findById(4);
		assertEquals(update, 1);
		assertEquals(admin.getNickname(), nickname);
	}

	@Test
	public void test3Update() {
		Admin admin = adminDao.findById(4);
		admin.setNickname(admin.getNickname() + "1");
		admin.setTruename(admin.getTruename() + "1");
		admin.setLocked(!admin.isLocked());
		
		int update = adminDao.update(admin);
		Admin admin2 = adminDao.findById(4);
		
		assertEquals(update, 1);
		assertEquals(admin.getNickname(), admin2.getNickname());
		assertEquals(admin.getTruename(), admin2.getTruename());
		assertEquals(admin.isLocked(), admin2.isLocked());
	}

	@Test
	public void test3Locked() {
		Admin admin = adminDao.findById(4);
		boolean lockFlag = admin.isLocked();
		int locked = adminDao.locked(admin.getId(), !lockFlag);
		assertEquals(locked, 1);
		admin = adminDao.findById(4);
		
		assertFalse(lockFlag == admin.isLocked()); // 来回不相等
		
		locked = adminDao.locked(admin.getId(), lockFlag);
		assertEquals(locked, 1);
		admin = adminDao.findById(4);
		
		assertTrue(lockFlag == admin.isLocked()); // 来回相等
	}

	
	@Test
	public void test5DeleteById() {
		Admin adminTmp = adminDao.findByMobile("13813813813");
		int deleteNum = adminDao.deleteById(adminTmp.getId());
		assertEquals(deleteNum, 1);
	}
}
