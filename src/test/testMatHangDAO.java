package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import BUS.MatHangBUS;
import DAO.MatHangDAO;
import DTO.MatHangDTO;

public class testMatHangDAO {

// Không tiến hành kiểm tra xóa và sửa tại vì hàm xóa, sẽ dựa vào vị trí con trỏ để xóa mặt hàng 
//nên không có vụ true/false được, sửa cũng dựa vào dữ liệu ở các textview, mà đã có hàm kiểm
//tra và được test ở bển test mặt hàng bus
	
	//kiem tra khong hop le
	@Test
	public void testThemMH_1() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("test");
		dto.setTenMatHang("test");
		dto.setDonGia(0);
		dto.setMoTa("test");
		assertFalse(MatHangDAO.ThemMatHang(dto));
	}
	
	@Test
	public void testThemMH_2() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("test");
		dto.setTenMatHang("test");
		dto.setDonGia(-10);
		dto.setMoTa("test");
		assertFalse(MatHangDAO.ThemMatHang(dto));
	}
	@Test
	public void testThemMH_3() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh001");
		dto.setTenMatHang("Graphic card gtx 840");
		dto.setDonGia(3000000);
		dto.setMoTa("Graphic card gtx 840 for gamer");
		assertFalse(MatHangDAO.ThemMatHang(dto));
	}
	//kiem tra hop le
	@Test
	public void testThemMH_4() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh008");
		dto.setTenMatHang("GTX 980 Ti");
		dto.setDonGia(500000);
		dto.setMoTa("GTX 980 Ti is the most polular in 2016");
		assertTrue(MatHangDAO.ThemMatHang(dto));
	}

}
