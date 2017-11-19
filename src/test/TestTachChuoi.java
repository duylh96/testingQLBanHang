package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.Test;

import GUI.ManHinhQuanLyHangHoa;

public class TestTachChuoi {
	
	//ham tach chuoi ben trong, vd: love is {beautiful} => beautiful
	
	//kiem tra ko hop le(chuoi trong hoac khong ton tai dau {})
	@Test
	public void testChuoiTrong() {
			String s="beautiful";
			assertNotEquals(s, ManHinhQuanLyHangHoa.tachChuoi("{  }"));

	}
	
	@Test
	public void testKhongTonTai() {
			String s="beautiful";
			assertNotEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love {is} beautiful"));

	}
	
	@Test
	public void testKhongTonTai_1() {
			String s="beautiful";
			assertNotEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is {[beautiful]} "));

	}
	
	//kiem tra hop le
	@Test
	public void testTonTai() {
			String s="beautiful";
			assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is {beautiful} "));

	}
	
	
	
	
}
