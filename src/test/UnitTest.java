package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.SQLException;

import org.junit.Test;

import DAO.ConnectionUtils;

public class UnitTest {

	@Test
	public void test0() {
		try {
			assertNull(ConnectionUtils.getSQLServerConnection("", "", "", "", ""));
		} catch (SQLException e) {
		}
	}

	@Test
	public void test1() {
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String database = "QLBanHang";
		String userName = "sa";
		String password = "Tivippro1996uit";
		try {
			assertNotNull(
					ConnectionUtils.getSQLServerConnection(hostName, sqlInstanceName, database, userName, password));
		} catch (SQLException e) {
		}
	}
	
	@Test
	public void test2() {
		
	}
}
