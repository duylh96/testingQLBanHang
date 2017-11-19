package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import GUI.ManHinhQuanLyHangHoa;

public class TestTachChuoi {

	// ham tach chuoi ben trong, vd: love is {beautiful} => beautiful

	// kiem tra ko hop le
	@Test
	public void testNull() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi(""));
	}
	// ham tach chuoi ben trong, vd: love is {beautiful} => beautiful

	// kiem tra ko hop le(chuoi trong hoac khong ton tai dau {})
	@Test
	public void testChuoiTrong() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi(""));
	}

	@Test
	public void testNotContain() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is beautiful"));
	}

	public void testKhongTonTai() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is beautiful"));
	}

	@Test
	public void testNotContain_1() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is [beautiful] "));
	}

	public void testKhongTonTai_1() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is [beautiful] "));

	}

	// kiem tra hop le
	@Test
	public void testContain() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is {beautiful} "));
	}

	public void testTonTai() {
		String s = "beautiful";
		assertEquals(s, ManHinhQuanLyHangHoa.tachChuoi("love is {beautiful} "));

	}

}
