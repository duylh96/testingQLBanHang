package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import BUS.MatHangBUS;
import DTO.MatHangDTO;
import GUI.ManHinhQuanLyHangHoa;

public class TestFunctionXoaMatHang {

	//thực ra ở việc xóa mặt hàng, việc này ko thể sai được, vì mã sản phẩm được lấy từ table.
	//test 1 lần
	@Test
	public void testXoaMH_2() {
		ManHinhQuanLyHangHoa.maMH="mh004";
		MatHangDTO dto= new MatHangDTO();
		assertTrue(MatHangBUS.XoaMatHang(dto));
	}
}
