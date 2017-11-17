package DTO;

public class MatHangDTO {
	//Khong dung toi

	private String maMatHang;
	private String tenMatHang;
	private String moTa;
	private float donGia;

	public MatHangDTO() {
		super();
	}

	public MatHangDTO(String maMatHang, String tenMatHang, String moTa, float donGia) {
		super();
		this.maMatHang = maMatHang;
		this.tenMatHang = tenMatHang;
		this.moTa = moTa;
		this.donGia = donGia;
	}

	public String getMaMatHang() {
		return maMatHang;
	}

	public void setMaMatHang(String maMatHang) {
		this.maMatHang = maMatHang;
	}

	public String getTenMatHang() {
		return tenMatHang;
	}

	public void setTenMatHang(String tenMatHang) {
		this.tenMatHang = tenMatHang;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
}
