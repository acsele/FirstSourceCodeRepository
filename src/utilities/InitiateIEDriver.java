package utilities;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class InitiateIEDriver {

	public static void WindowsAuthenticationlogin(String sUserName, String sPassword) throws Exception {

		try {
			// wait - increase this wait period if required
			Thread.sleep(5000);

			// create robot for keyboard operations
			Robot rb = new Robot();

			// Enter user name by CTRL-V
			StringSelection username = new StringSelection(sUserName);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);

			// tab to password entry field
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);

			// Enter password by CTRL-V
			StringSelection pwd = new StringSelection(sPassword);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);

			// press enter
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			// wait
			Thread.sleep(3000);
		} catch (Exception ex) {
			System.out.println("Error in Login Thread: " + ex.getMessage());
		}}}


	
	


