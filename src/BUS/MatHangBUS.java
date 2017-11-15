package BUS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
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
		try {
			Connection connection = ConnectionUtils.getMyConnection();
			Statement statement = connection.createStatement();
			String q = "SELECT * FROM MATHANG";
			ResultSet resultSet = statement.executeQuery(q);
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			int columnsNumber = resultSetMetaData.getColumnCount();

			TableItem item;
			while (resultSet.next()) {
				item = new TableItem(tbl_danhSachMatHang, SWT.NONE);
				for (int i = 1; i <= columnsNumber; i++) {
					item.setText(i-1, resultSet.getString(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
