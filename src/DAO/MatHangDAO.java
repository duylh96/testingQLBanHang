package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import DTO.MatHangDTO;
import GUI.ManHinhQuanLyHangHoa;


public class MatHangDAO {
 
  
	 

	public static boolean ThemMatHang(MatHangDTO mh) {
		boolean result = false;

		// Lấy ra kết nối tới cơ sở dữ liệu.
		Connection connection;
		try {
			connection = ConnectionUtils.getMyConnection();

			// Tạo một câu SQL có tham số (?)
			String sql = "Insert into MATHANG(MaMatHang,TenMatHang,DonGia,MoTa) values(?,?,?,?) ";

			// Tạo một đối tượng PreparedStatement.
			PreparedStatement pstm = connection.prepareStatement(sql);

			pstm.setString(1, mh.getMaMatHang());
			pstm.setString(2, mh.getTenMatHang());
			pstm.setFloat(3, mh.getDonGia());
			pstm.setString(4, mh.getMoTa());

			pstm.executeUpdate();

			result = true;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//Xoa mat hang
	public static boolean XoaMatHang(MatHangDTO mh) {
		boolean result = false;
		
		// Lấy ra kết nối tới cơ sở dữ liệu.
		Connection connection;
		
		try {
			connection = ConnectionUtils.getMyConnection();
			
			// Tạo một câu SQL 
			String sql = "delete from  MATHANG where MaMatHang="+"'"+ManHinhQuanLyHangHoa.maMH+"'";
		 
			// Tạo một đối tượng PreparedStatement.
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.executeUpdate();

			result = true;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static boolean SuaMatHang(MatHangDTO mh) {
		boolean result = false;
		
		// Lấy ra kết nối tới cơ sở dữ liệu.
		Connection connection;
		
		try {
			connection = ConnectionUtils.getMyConnection();
			
			// Tạo một câu SQL 
			String sql = "update MATHANG set TenMatHang='"+ManHinhQuanLyHangHoa.tenMH+"', DonGia='"+ManHinhQuanLyHangHoa.donGia+"', MoTa='"+ManHinhQuanLyHangHoa.moTa+"' where MaMatHang='"+ManHinhQuanLyHangHoa.maMH+"'";
		 
			// Tạo một đối tượng PreparedStatement.
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.executeUpdate();

			result = true;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	

	public static boolean LoadDanhSachMatHang(Table tbl_danhSachMatHang) {

		tbl_danhSachMatHang.clearAll();
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
		tbl_danhSachMatHang.removeAll();
		tbl_danhSachMatHang.redraw();

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
		tbl_danhSachMatHang.redraw();
		return false;
	}
}
