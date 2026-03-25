package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ReportPage {	
	public WebDriver driver;//Instance Variable
	WaitUtility waitutility=new WaitUtility();//Reusability of Explicit Wait click provided by WaitUtility
	
	public ReportPage(WebDriver driver) //Create Constructor with parameter WebDriver driver: local variable
		{
			this.driver=driver; //this used as Instance and Local variables are same
			PageFactory.initElements(driver, this);//PageFactory class has initElements class to initialize Elements
		}
	
	@FindBy(xpath="//p[text()='Unsafe Act / Behaviour']") WebElement unsafeActBehaviourButton;
	@FindBy(xpath="//div[text()='Unsafe Act / Behaviour']") WebElement unsafeActBehaviourDisplay;
	@FindBy(xpath="//p[text()='Submitted Reports']") WebElement submittedReportsDisplay;
		
	public UnsafeActPage clickUnsafeActBehaviourButton()
	{
		waitutility.waitUntilElementToBeClickable(driver, unsafeActBehaviourButton);//Implementing Explicit Wait
		unsafeActBehaviourButton.click();
		return new UnsafeActPage(driver);
	}
	public String clickUnsafeActBehaviourDisplay()
	{
		return unsafeActBehaviourDisplay.getText();	
    }
	public String submittedReportsTextDisplay()
	{
		return submittedReportsDisplay.getText();	
    }
}
