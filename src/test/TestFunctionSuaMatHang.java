package test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import BUS.MatHangBUS;
import DTO.MatHangDTO;

public class TestFunctionSuaMatHang {
	// Thá»±c ra class nÃ y viá»‡c kiá»ƒm tra test lÃ  khÃ´ng cáº§n thiáº¿t vÃ¬
	// viá»‡c sá»­a dá»¯ liá»‡u, thÃ¬ lÃºc kiá»ƒm tra ná»™i dung thÃ¬ hÃ m
	// kiá»ƒm tra há»£p lá»‡ hay khÃ´ng Ä‘Ã£ check rá»“i, cÃ²n viá»‡c sai mÃ£ lÃ 
	// Ä‘iá»�u ko thá»ƒ, vÃ¬ click chuá»™t vÃ o
	// báº£ng sáº½ tá»± Ä‘á»™ng láº¥y mÃ£ máº·t hÃ ng.

	// #Test khÃ´ng há»£p lá»‡
	// test : Sá»­a máº·t hÃ ng khÃ´ng cÃ³ giÃ¡ trá»‹
	@Test
	public void testSuaMH() {
		MatHangDTO dto = new MatHangDTO();
		assertFalse(MatHangBUS.SuaMatHang(dto));
	}

	// vÃ¬ Ä‘iá»�n thÃ´ng tin vÃ o báº£ng máº¥t tg nÃªn nhÃ³m quyáº¿t Ä‘á»‹nh Ä‘áº·t
	// trá»±c tiáº¿p giÃ¡ trá»‹
	@Test
	public void testSuaMH_1() {
		MatHangDTO dto = new MatHangDTO();
		assertFalse(MatHangBUS.SuaMatHang(dto));
	}

	@Test
	public void testSuaMH_2() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh0001");
		assertFalse(MatHangBUS.SuaMatHang(dto));
	}

	@Test
	public void testSuaMH_3() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh001");
		dto.setTenMatHang("USB King Max");
		dto.setDonGia(-800000);
		dto.setMoTa("USB made in Taiwain");
		assertFalse(MatHangBUS.SuaMatHang(dto));
	}

	@Test
	public void testSuaMH_4() {
		MatHangDTO dto = new MatHangDTO();
		dto.setMaMatHang("mh001");
		dto.setTenMatHang("USB King Max");
		dto.setDonGia(800000);
		dto.setMoTa("USB made in Taiwain");
		assertFalse(MatHangBUS.SuaMatHang(dto));
	}

}
