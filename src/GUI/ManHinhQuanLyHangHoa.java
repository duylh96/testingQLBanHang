package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ManHinhQuanLyHangHoa {

	protected Shell mainShell;

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
		mainShell.setSize(450, 300);

	}

}
