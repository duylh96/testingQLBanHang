package test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import BUS.MatHangBUS;
import DTO.MatHangDTO;

public class TestFunctionSuaMatHang {
	//Thực ra class này việc kiểm tra test là không cần thiết vì việc sửa dữ liệu, thì lúc kiểm tra nội dung thì hàm
	//kiểm tra hợp lệ hay không đã check rồi, còn việc sai mã là điều ko thể, vì click chuột vào
	//bảng sẽ tự động lấy mã mặt hàng.

	//Test không hợp lệ
	
	@Test
	public void testSuaMH() {
		MatHangDTO dto= new MatHangDTO();
		dto.setMaMatHang("mh001");
		dto.setTenMatHang("USB King Max");
		dto.setDonGia(-800000);
		dto.setMoTa("USB made in Taiwain");
		assertFalse(MatHangBUS.SuaMatHang(dto));
	}
	
	@Test
	public void testSuaMH_1() {
		MatHangDTO dto= new MatHangDTO();
		dto.setMaMatHang("mh001");
		dto.setTenMatHang(" ");
		dto.setDonGia(800000);
		assertFalse(MatHangBUS.SuaMatHang(dto));
	}
	 	
	
}
