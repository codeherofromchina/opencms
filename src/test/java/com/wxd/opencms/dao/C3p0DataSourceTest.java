package com.wxd.opencms.dao;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters; 

import com.wxd.opencms.BaseJunit4Test;

/**
 * 测试c3p0数据源的连通性
 * 
 * @date Oct 28, 2016
 * @author wangXiaodan
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class C3p0DataSourceTest extends BaseJunit4Test {
	@Resource(name = "dataSource")
	DataSource dataSource;

	public Connection getConn() throws SQLException {
		return dataSource.getConnection();
	}

	@Test
	public void test1Insert() throws SQLException {
		System.out.println(1);
		Connection conn = getConn();
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement("insert into test(name) values (?)");
			pstm.setString(1, "test_wangxiaodan");
			int insertNum = pstm.executeUpdate();
			assertTrue(insertNum == 1);
		} finally {
			close(conn, pstm, null);
		}
	}

	@Test
	public void test2Select() throws SQLException {
		System.out.println(2);
		Connection conn = getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement("select * from test where name=?");
			pstm.setString(1, "test_wangxiaodan");
			rs = pstm.executeQuery();
			if(rs.next()){
				assertTrue(rs.getString("name").equals("test_wangxiaodan"));
			}else {
				assertTrue(false);
			}
		} finally {
			close(conn, pstm, rs);
		}
	}
	
	@Test
	public void test3Delete() throws SQLException {
		System.out.println(3);
		Connection conn = getConn();
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement("delete from test where name=?");
			pstm.setString(1, "test_wangxiaodan");
			int delNum = pstm.executeUpdate();
			assertTrue(delNum == 1);
		} finally {
			close(conn, pstm, null);
		}
	}
}
