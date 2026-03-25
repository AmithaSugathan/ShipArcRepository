package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ReportPage;
import utilities.ExcelUtility;

public class ReportTest extends Base {
	HomePage homepage;
	ReportPage reportpage;
	@Test(description = "Verifying whether Admin can Click UnsafeAct Behaviour")

	public void verifyAdminLogOut() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(0, 0, "loginpage"); // 0th row, 0th coloumn, sheetname
		String passwordvalue = ExcelUtility.getStringData(0, 1, "loginpage"); // 0th row, 1st column, sheetname

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameToUserNameField(usernamevalue).enterPasswordToPasswordField(passwordvalue);
		homepage = loginpage.clickLoginButton();

		homepage.clickReportsMenu();		

		String expectedtext = "Unsafe Act / Behaviour";
		String actualtext = reportpage.clickUnsafeActBehaviourDisplay();
		Assert.assertEquals(actualtext, expectedtext, Constant.ADMINUNABLETOCLICKUNSAFEACTBEHAVIOUR);
	}


}
