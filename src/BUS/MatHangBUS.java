package BUS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import DAO.ConnectionUtils;
import DTO.MatHangDTO;

public class MatHangBUS {

	public static boolean ThemMatHang(MatHangDTO mh) {

		return false;
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

		TableColumn tc1 = new TableColumn(tbl_danhSachMatHang, SWT.CENTER);
		TableColumn tc2 = new TableColumn(tbl_danhSachMatHang, SWT.CENTER);
		TableColumn tc3 = new TableColumn(tbl_danhSachMatHang, SWT.CENTER);
		TableColumn tc4 = new TableColumn(tbl_danhSachMatHang, SWT.CENTER);
		tc1.setText("Mã mặt hàng");
		tc2.setText("Tên mặt hàng");
		tc3.setText("Đơn giá");
		tc4.setText("Mô tả");
		tc1.setWidth(100);
		tc2.setWidth(120);
		tc3.setWidth(140);
		tc4.setWidth(150);

		try {
			Connection connection = ConnectionUtils.getMyConnection();
			Statement statement = connection.createStatement();
			String q = "SELECT * FROM MATHANG";
			ResultSet resultSet = statement.executeQuery(q);

			while (resultSet.next()) {
				TableItem item = new TableItem(tbl_danhSachMatHang, SWT.NONE);
				item.setText(new String[] { resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4) });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
