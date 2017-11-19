package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

public class TestFunctionXoaMatHang {

	// thực ra ở việc xóa mặt hàng, việc này ko thể sai được, vì
	// mã sản phẩm được lấy từ table.
	@Test
	public void testXoaMH() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang(" ");
		assertFalse(MatHangDAO.XoaMatHang(dto));
	}

	@Test
	public void testXoaMH_1() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh0001");
		assertFalse(MatHangDAO.XoaMatHang(dto));
	}

	@Test
	public void testXoaMH_2() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh004");
		assertTrue(MatHangDAO.XoaMatHang(dto));
	}
}
