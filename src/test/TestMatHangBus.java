package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import BUS.MatHangBUS;
import DTO.MatHangDTO;

public class TestMatHangBus {

	@Test
	public void testKiemTraMatHangHopLe_1() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("test");
		dto.setTenMatHang("test");
		dto.setDonGia(0);
		dto.setMoTa("test");
		assertFalse(MatHangBUS.KiemTraMatHangHopLe(dto));
	}

	@Test
	public void testKiemTraMatHangHopLe_2() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("test");
		dto.setTenMatHang("test");
		dto.setDonGia(-10);
		dto.setMoTa("test");
		assertFalse(MatHangBUS.KiemTraMatHangHopLe(dto));
	}

	@Test
	public void testKiemTraMatHangHopLe_3() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("");
		dto.setTenMatHang("test");
		dto.setDonGia(10);
		dto.setMoTa("test");
		assertFalse(MatHangBUS.KiemTraMatHangHopLe(dto));
	}

	@Test
	public void testKiemTraMatHangHopLe_4() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("");
		dto.setTenMatHang("");
		dto.setDonGia(10);
		dto.setMoTa("");
		assertFalse(MatHangBUS.KiemTraMatHangHopLe(dto));
	}

	@Test
	public void testKiemTraMatHangHopLe_5() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("test");
		dto.setTenMatHang("test");
		dto.setDonGia(10);
		dto.setMoTa("test");
		assertTrue(MatHangBUS.KiemTraMatHangHopLe(dto));
	}
}
