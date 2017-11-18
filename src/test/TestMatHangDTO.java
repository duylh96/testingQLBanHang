package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import DTO.MatHangDTO;

public class TestMatHangDTO {

	@Test
	public void testCreate() {
		MatHangDTO dto = new MatHangDTO();
		assertNotNull(dto);
	}

	@Test
	public void testSetMaMatHang() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh001");
		assertEquals(dto.getMaMatHang(), "mh001");
	}

	@Test
	public void testSetTenMatHang() {
		MatHangDTO dto = new MatHangDTO();
		dto.setTenMatHang("GTX 1080");
		assertEquals(dto.getTenMatHang(), "GTX 1080");
	}

	@Test
	public void testSetMoTa() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMoTa("Day la mo ta");
		assertEquals(dto.getMoTa(), "Day la mo ta");
	}

	@Test
	public void testSetDonGia() {
		MatHangDTO dto = new MatHangDTO();
		dto.setDonGia(15000);
		assertEquals(dto.getDonGia(), 15000, 0);
	}

	@Test
	public void testSetDonGia2() {
		MatHangDTO dto = new MatHangDTO();
		dto.setDonGia(15000);
		assertNotEquals(dto.getDonGia(), "15000");
	}
}
