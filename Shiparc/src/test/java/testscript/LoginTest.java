package testscript;

	import java.io.IOException;

	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import automationcore.Base;
	import constants.Constant;
    import pages.HomePage;
    import pages.LoginPage;
	import utilities.ExcelUtility;

	public class LoginTest extends Base{
		HomePage homepage;//Reference Variable to implement Chaining
		
		@Test(priority=1, description="Verifying whether User can Login with Valid Credentials", groups= {"smoke"} )
		public void validateUserLoginWithValidCredentials() throws IOException
		{
			String usernamevalue=ExcelUtility.getStringData(0, 0, "loginpage"); //0th row, 0th coloumn, sheetname
			String passwordvalue=ExcelUtility.getStringData(0, 1, "loginpage"); //0th row, 1st column, sheetname
			
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserNameToUserNameField(usernamevalue).enterPasswordToPasswordField(passwordvalue);
			homepage=loginpage.clickLoginButton();
			//assertTrue()
			boolean isdashboarddisplayedvalue=loginpage.isDashboardDisplayed();	
			Assert.assertTrue(isdashboarddisplayedvalue, Constant.VALIDCREDENTIALERROR); //Error msg is false condition
			
		}
		
		@Test(description="Verifying whether User can Login with Invalid Credentials", retryAnalyzer=retry.Retry.class)
		public void validateUserWithInvalidCredentials() throws IOException
		{
			String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage"); //1th row, 0th coloumn, sheetname
			String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage"); //1th row, 1st column, sheetname
			
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserNameToUserNameField(usernamevalue).enterPasswordToPasswordField(passwordvalue).clickLoginButton();
			String expectedtext="SIGN-IN TO YOUR ACCOUNT";
			String actualtext=loginpage.isSigninPageTextReturned();
			Assert.assertEquals(actualtext, expectedtext, Constant.INVALIDCREDENTIALERROR);//Error msg is displayed on Jenkins console
		}
		
		@Test(description="Verifying whether User can Login with Invalid Username and Valid Password")	
		public void validateUserWithInvalidUsernameValidPassword() throws IOException
		{
			String usernamevalue=ExcelUtility.getStringData(2, 0, "loginpage"); //2ndh row, 0th coloumn, sheetname
			String passwordvalue=ExcelUtility.getStringData(2, 1, "loginpage"); //2nd row, 1st column, sheetname
			
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserNameToUserNameField(usernamevalue).enterPasswordToPasswordField(passwordvalue).clickLoginButton();
			String expectedtext="SIGN-IN TO YOUR ACCOUNT";
			String actualtext=loginpage.isSigninPageTextReturned();
			Assert.assertEquals(actualtext, expectedtext, Constant.INVALIDUSERNAMEVALIDPASSWORDERROR );//Error msg is displayed on Jenkins console
		}
		
		@Test(description="Verifying whether User can Login with Valid Username and Invalid Password")	
		public void validateUserWithValidUsernameInvalidPassword() throws IOException
		{
			String usernamevalue=ExcelUtility.getStringData(3, 0, "loginpage"); //3rd row, 0th coloumn, sheetname
			String passwordvalue=ExcelUtility.getStringData(3, 1, "loginpage"); //3rd row, 1st column, sheetname
			
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserNameToUserNameField(usernamevalue).enterPasswordToPasswordField(passwordvalue).clickLoginButton();
			String expectedtext="SIGN-IN TO YOUR ACCOUNT";
			String actualtext=loginpage.isSigninPageTextReturned();
			Assert.assertEquals(actualtext, expectedtext, Constant.VALIDUSERNAMEINVALIDPASSWORDERROR);//Error msg is displayed on Jenkins console
		}
		
	}


