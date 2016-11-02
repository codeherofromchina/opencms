package com.wxd.opencms.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.wxd.opencms.BaseJunit4Test;
import com.wxd.opencms.pojo.Resources;

public class ResourcesDaoTest extends BaseJunit4Test{
	@Resource
	private ResourcesDao resourcesDao;
	@Test
	public void testFindByRoleid() {
		List<Resources> resList = resourcesDao.findByRoleid(1);
		assertTrue(resList.size() > 0);
	}

	@Test
	public void testFindByPath() {
		List<Resources> resList = resourcesDao.findByPath("/index");
		assertTrue(resList.size() > 0);
	}

}
