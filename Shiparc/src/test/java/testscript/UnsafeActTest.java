package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import automationcore.Base;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ReportPage;
import pages.UnsafeActPage;
import utilities.ExcelUtility;

public class UnsafeActTest extends Base{
	HomePage homepage;
	ReportPage reportpage;
	UnsafeActPage unsafeactpage;
	@Test(description = "Verifying whether Admin can Start Reporting Unsafe Act/ Behaviour")

	public void verifyAdminLogOut() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(0, 0, "loginpage"); // 0th row, 0th coloumn, sheetname
		String passwordvalue = ExcelUtility.getStringData(0, 1, "loginpage"); // 0th row, 1st column, sheetname
		String descriptionUnsafeAct= ExcelUtility.getStringData(0, 0, "unsafeactpage");
		String descriptionCorrectiveAction= ExcelUtility.getStringData(0, 1, "unsafeactpage");
		String descriptionSuggestions= ExcelUtility.getStringData(0, 2, "unsafeactpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameToUserNameField(usernamevalue).enterPasswordToPasswordField(passwordvalue);
		homepage = loginpage.clickLoginButton();
		homepage.clickReportsMenu();
		unsafeactpage=reportpage.clickUnsafeActBehaviourButton();		
		unsafeactpage.clickstartReportingButton().clickYesAnonymousUser().clickReportNext().clicktypeUnsafeAct().enterTextDescriptionOfUnsafeAct(descriptionUnsafeAct).clickUploadFileButton().clickNextButton().clickreaOfWorkACRoom().enterTextDescriptionCorrectiveAction(descriptionCorrectiveAction).clickObservationPPE().clickInterventionNoAction().clickCategoryOfObservation().clickOutcomeCorrected().clickStatusOpen().enterTextDescriptionSuggestions(descriptionSuggestions).clickReviewButton().clickSubmitButton().clickViewReportButton(); 
		String expectedtext = "Submitted Reports";
		String actualtext = reportpage.submittedReportsTextDisplay();
		Assert.assertEquals(actualtext, expectedtext, Constant.ADMINUNABLETOVIEWREPORTSOFUNSAFEACTBEHAVIOUR);
	}
		
		
}
