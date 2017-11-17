package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

class IntegrationTest {

	@Test
	// test : mặt hàng có giá trị null
	void test1() {
		MatHangDTO matHangDTO = new MatHangDTO();
		assertFalse(MatHangDAO.ThemMatHang(matHangDTO));
	}

	@Test
	// test : mặt hàng có mã mặt hàng trùng với cái đã có sẵn
	void test2() {
		MatHangDTO matHangDTO = new MatHangDTO();
		matHangDTO.setMaMatHang("mh001");
		assertFalse(MatHangDAO.ThemMatHang(matHangDTO));
	}

	// @Test
	// test : mặt hàng hợp lệ
	void test3() {
		MatHangDTO matHangDTO = new MatHangDTO("mh010", "Dell Vostro 3559",
				"Laptop Dell vostro 3559 siu phẩm mạnh mẽ...", 15000000);
		assertTrue(MatHangDAO.ThemMatHang(matHangDTO));
	}
}
