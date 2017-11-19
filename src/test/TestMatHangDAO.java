package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

public class TestMatHangDAO {
	
	//kiem tra hop le, test chỉ một lần
	@Test
	public void testThemMH() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh008");
		dto.setTenMatHang("GTX 980 Ti");
		dto.setDonGia(500000);
		dto.setMoTa("GTX 980 Ti is the most polular in 2016");
		assertTrue(MatHangDAO.ThemMatHang(dto));
	}
	
	@Test
	public void testSuaMH() {
		MatHangDTO dto= new MatHangDTO();
		dto.setMaMatHang("mh003");
		dto.setTenMatHang("USB King Max");
		dto.setDonGia(800000);
		dto.setMoTa("USB made in Taiwain");
		assertTrue(MatHangDAO.SuaMatHang(dto));
	}
	
	@Test
	public void testXoaMH() {
		MatHangDTO dto= new MatHangDTO();
		dto.setMaMatHang("mh004");
		assertTrue(MatHangDAO.XoaMatHang(dto));
	}

}
