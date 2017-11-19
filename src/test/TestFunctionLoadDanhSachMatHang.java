package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.junit.Before;
import org.junit.Test;

import DAO.MatHangDAO;

public class TestFunctionLoadDanhSachMatHang {

	private Shell mainShell;
	private Group grpDanhSch;

	@Before
	public void Init() {
		mainShell = new Shell();
		mainShell.setSize(600, 430);
		grpDanhSch = new Group(mainShell, SWT.NONE);
		grpDanhSch.setBounds(10, 147, 564, 169);
	}

	@Test
	public void test1() {
		Table table1 = new Table(grpDanhSch, SWT.BORDER | SWT.FULL_SELECTION | SWT.VIRTUAL);
		assertTrue(MatHangDAO.LoadDanhSachMatHang(table1));
	}

	@Test
	public void test2() {
		Table table = null;
		assertFalse(MatHangDAO.LoadDanhSachMatHang(table));
	}
}
