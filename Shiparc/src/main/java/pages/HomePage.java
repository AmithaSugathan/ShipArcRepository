package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	

	public class HomePage {
		
		public WebDriver driver;
		
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//span[text()='Reports']") WebElement reportsMenu;
		@FindBy(xpath="//p[text()='Reports']") WebElement reportsPageMenu;
		
		
		public ReportPage clickReportsMenu()
		{
			reportsMenu.click();
			return new ReportPage(driver);
		}
		public String isReportsPageMenuTextReturned()
		{
			return reportsPageMenu.getText();
		}
			
		
		
	}

	
