package GUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import BUS.MatHangBUS;

public class ManHinhQuanLyHangHoa {

	protected Shell mainShell;
	private Text txt_maMatHang;
	private Label lblTnMtHng;
	private Text txt_tenMatHang;
	private Label lblnGi;
	private Text txt_donGia;
	private Label lblGhiCh;
	private Text txt_moTa;
	private Table tbl_danhSachMatHang;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ManHinhQuanLyHangHoa window = new ManHinhQuanLyHangHoa();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		mainShell.open();
		mainShell.layout();
		while (!mainShell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		mainShell = new Shell();
		mainShell.setText("Qu\u1EA3n l\u00FD M\u1EB7t H\u00E0ng");
		mainShell.setSize(600, 430);

		Group grpDetails = new Group(mainShell, SWT.NONE);
		grpDetails.setText("Chi tiết");
		grpDetails.setBounds(10, 10, 564, 131);

		Label lblMMtHng = new Label(grpDetails, SWT.NONE);
		lblMMtHng.setBounds(30, 27, 90, 15);
		lblMMtHng.setText("Mã mặt hàng :");

		txt_maMatHang = new Text(grpDetails, SWT.BORDER);
		txt_maMatHang.setBounds(126, 24, 140, 21);

		lblTnMtHng = new Label(grpDetails, SWT.NONE);
		lblTnMtHng.setText("Tên mặt hàng :");
		lblTnMtHng.setBounds(302, 27, 90, 15);

		txt_tenMatHang = new Text(grpDetails, SWT.BORDER);
		txt_tenMatHang.setBounds(398, 24, 140, 21);

		lblnGi = new Label(grpDetails, SWT.NONE);
		lblnGi.setText("Đơn giá :");
		lblnGi.setBounds(30, 65, 90, 15);

		txt_donGia = new Text(grpDetails, SWT.BORDER);
		txt_donGia.setBounds(126, 62, 140, 21);

		lblGhiCh = new Label(grpDetails, SWT.NONE);
		lblGhiCh.setText("Mô tả :");
		lblGhiCh.setBounds(302, 62, 90, 15);

		txt_moTa = new Text(grpDetails, SWT.BORDER | SWT.MULTI);
		txt_moTa.setBounds(398, 59, 140, 62);

		Group grpDanhSch = new Group(mainShell, SWT.NONE);
		grpDanhSch.setText("Danh sách");
		grpDanhSch.setBounds(10, 147, 564, 169);

		tbl_danhSachMatHang = new Table(grpDanhSch, SWT.BORDER | SWT.FULL_SELECTION);
		tbl_danhSachMatHang.setBounds(30, 29, 505, 117);
		tbl_danhSachMatHang.setHeaderVisible(true);
		tbl_danhSachMatHang.setLinesVisible(true);

		Button btnThem = new Button(mainShell, SWT.NONE);
		btnThem.setBounds(10, 356, 75, 25);
		btnThem.setText("Thêm");

		Button btnCapNhat = new Button(mainShell, SWT.NONE);
		btnCapNhat.setBounds(91, 356, 75, 25);
		btnCapNhat.setText("Cập nhật");

		Button btnReset = new Button(mainShell, SWT.NONE);
		btnReset.setBounds(172, 356, 75, 25);
		btnReset.setText("Reset");

		Button btnThoat = new Button(mainShell, SWT.NONE);
		btnThoat.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				mainShell.dispose();
			}
		});
		btnThoat.setBounds(499, 356, 75, 25);
		btnThoat.setText("Thoát");

		Button btnXoa = new Button(mainShell, SWT.NONE);
		btnXoa.setBounds(418, 356, 75, 25);
		btnXoa.setText("Xóa");

		// first load
		MatHangBUS.HienThiDanhSachMatHang(tbl_danhSachMatHang);
	}
}
