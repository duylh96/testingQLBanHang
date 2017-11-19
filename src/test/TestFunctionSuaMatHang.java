package test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

public class TestFunctionSuaMatHang {
	//Thực ra class này việc kiểm tra test là không cần thiết vì việc sửa dữ liệu, thì lúc kiểm tra nội dung thì hàm
	//kiểm tra hợp lệ hay không đã check rồi, còn việc sai mã là điều ko thể, vì click chuột vào
	//bảng sẽ tự động lấy mã mặt hàng.
	
	//#Test không hợp lệ
		// test : Sửa mặt hàng không có giá trị
	@Test
	public void testSuaMH() {
		MatHangDTO dto= new MatHangDTO();
		assertFalse(MatHangDAO.SuaMatHang(dto));
	}
	
	//vì điền thông tin vào bảng mất tg nên nhóm quyết định đặt trực tiếp giá trị
	@Test
	public void testSuaMH_1() {
		MatHangDTO dto= new MatHangDTO();
		assertFalse(MatHangDAO.SuaMatHang(dto));
	}
	
	@Test
	public void testSuaMH_2() {
		MatHangDTO dto= new MatHangDTO();
		dto.setMaMatHang("mh0001");
		assertFalse(MatHangDAO.SuaMatHang(dto));
	}
	
	@Test
	public void testSuaMH_3() {
		MatHangDTO dto= new MatHangDTO();
		dto.setMaMatHang("mh001");
		dto.setTenMatHang("USB King Max");
		dto.setDonGia(-800000);
		dto.setMoTa("USB made in Taiwain");
		assertFalse(MatHangDAO.SuaMatHang(dto));
	}
	
	@Test
	public void testSuaMH_4() {
		MatHangDTO dto= new MatHangDTO();
		dto.setMaMatHang("mh001");
		dto.setTenMatHang("USB King Max");
		dto.setDonGia(800000);
		dto.setMoTa("USB made in Taiwain");
		assertFalse(MatHangDAO.SuaMatHang(dto));
	}
	
}
