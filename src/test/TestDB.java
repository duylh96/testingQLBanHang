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

	@Test
	// test : mặt hàng có giá trị null
	public void test1() {
		MatHangDTO matHangDTO = new MatHangDTO();
		assertFalse(MatHangDAO.ThemMatHang(matHangDTO));
	}

	@Test
	// test : mặt hàng có mã mặt hàng trùng với cái đã có sẵn
	public void test2() {
		MatHangDTO matHangDTO = new MatHangDTO();
		matHangDTO.setMaMatHang("mh001");
		assertFalse(MatHangDAO.ThemMatHang(matHangDTO));
	}

	// @Test
	// test : mặt hàng hợp lệ
	public void test3() {
		MatHangDTO matHangDTO = new MatHangDTO("mh010", "Dell Vostro 3559",
				"Laptop Dell vostro 3559 siu phẩm mạnh mẽ...", 15000000);
		assertTrue(MatHangDAO.ThemMatHang(matHangDTO));
	}
}
