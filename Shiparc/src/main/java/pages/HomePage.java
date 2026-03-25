package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

	public class HomePage {
		
		public WebDriver driver;
		PageUtility pageutility=new PageUtility();//Reusability of JavaScript-based click provided by PageUtility
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//span[text()='Reports']") WebElement reportsMenu;
		@FindBy(xpath="//p[text()='Reports']") WebElement reportsPageMenu;
		
		
		public ReportPage clickReportsMenu()
		{
			
			pageutility.javaScriptClick(driver, reportsMenu);//Implementing JavaScript-based click
			return new ReportPage(driver);
		}
		public String isReportsPageMenuTextReturned()
		{
			return reportsPageMenu.getText();
		}
			
		
		
	}

	
