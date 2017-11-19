package test;

import static org.junit.Assert.*;

import org.junit.Test;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

public class TestFunctionThemMatHang {

	@Test
	// test : mặt hàng không có giá trị
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
