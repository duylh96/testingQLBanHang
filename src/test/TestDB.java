package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import DAO.ConnectionUtils;
import DAO.MatHangDAO;
import DTO.MatHangDTO;

public class TestDB {

	@Test
	public void testConnection_0() {
		try {
			assertNull(ConnectionUtils.getSQLServerConnection("", "", "", "", ""));
		} catch (SQLException e) {
		}
	}

	@Test
	public void testConnection_1() {
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
}
