package BUS;

import org.eclipse.swt.widgets.Table;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

public class MatHangBUS {

	public static boolean ThemMatHang(MatHangDTO mh) {

		if (KiemTraMatHangHopLe(mh)) {
			return MatHangDAO.ThemMatHang(mh);
		}
		return false;
	}

	public static boolean XoaMatHang(MatHangDTO mh) {

		return MatHangDAO.XoaMatHang(mh);

	}

	public static boolean SuaMatHang(MatHangDTO mh) {

		return MatHangDAO.SuaMatHang(mh);

	}

	public static boolean KiemTraMatHangHopLe(MatHangDTO mh) {
		try {
			mh.getDonGia();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return mh.getMaMatHang().length() != 0 && mh.getTenMatHang().length() != 0 && mh.getMoTa().length() != 0
				&& mh.getDonGia() > 0;

	}

	public static boolean HienThiDanhSachMatHang(Table tbl_danhSachMatHang) {
		return MatHangDAO.LoadDanhSachMatHang(tbl_danhSachMatHang);
	}

}
