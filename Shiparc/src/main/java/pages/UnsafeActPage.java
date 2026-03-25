package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnsafeActPage {
	public WebDriver driver;
		PageUtility pageutility=new PageUtility();//Reusability of JavaScript-based click provided by PageUtility
		WaitUtility waitutility=new WaitUtility();//Reusability of Explicit Wait click provided by WaitUtility
		
	public UnsafeActPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Start Reporting']") WebElement startReportingButton;
	@FindBy(xpath="//li[text()='YES']") WebElement yesAnonymousUser;
	@FindBy(xpath="//button[text()='Next']/following::span[@class='MuiTouchRipple-root css-4mb1j7']") WebElement reportNext;
	
	@FindBy(xpath="//li[text()='Unsafe Act']") WebElement typeUnsafeAct;
	@FindBy(xpath="//textarea[@id=':r27:']") WebElement textDescriptionOfUnsafeAct;
	@FindBy(xpath="//button[text()='Upload File']") WebElement uploadFileButton;
	@FindBy(xpath="//button[text()='Next']") WebElement nextButton;
	@FindBy(xpath="//li[text()='AC Room']") WebElement areaOfWorkACRoom;
	@FindBy(xpath="//textarea[@id=':r2i:']") WebElement textDescriptionCorrectiveAction;
	@FindBy(xpath="//li[text()='PPE']") WebElement observationPPE;
	@FindBy(xpath="//li[text()='No Action Taken']") WebElement interventionNoAction;
	@FindBy(xpath="//li[text()='High Risk ']") WebElement categoryOfObservation;
	@FindBy(xpath="//li[text()='Corrected']") WebElement outcomeCorrected;
	@FindBy(xpath="//li[text()='Open']") WebElement statusOpen;	
	@FindBy(xpath="//textarea[@id=':r3b:']") WebElement textDescriptionSuggestions;	
	@FindBy(xpath="//button[text()='Review']") WebElement reviewButton;
	@FindBy(xpath="//button[text()='Submit']") WebElement submitButton;
	@FindBy(xpath="//button[text()='View Submitted Reports']") WebElement viewReportButton;	
		
	public UnsafeActPage clickstartReportingButton()
	{
		pageutility.javaScriptClick(driver, startReportingButton);//Implementing JavaScript-based click
		return this;
	}
	public UnsafeActPage clickYesAnonymousUser()
	{
		waitutility.waitUntilElementToBeClickable(driver, yesAnonymousUser);//Implementing Explicit Wait
		return this;
	}	
	public UnsafeActPage clickReportNext()
	{
		waitutility.waitUntilElementToBeClickable(driver, reportNext);//Implementing Explicit Wait
		return this;
	}
	public UnsafeActPage clicktypeUnsafeAct()
	{
		pageutility.javaScriptClick(driver, typeUnsafeAct);//Implementing JavaScript-based click
		return this;
	}
	public UnsafeActPage enterTextDescriptionOfUnsafeAct(String descriptionUnsafeAct)
	{
		waitutility.waitUntilElementToBeClickable(driver, textDescriptionOfUnsafeAct);//Implementing Explicit Wait
		return this;
	}
	public UnsafeActPage clickUploadFileButton()
	{
		pageutility.javaScriptClick(driver, uploadFileButton);//Implementing JavaScript-based click
		return this;
	}
	public UnsafeActPage clickNextButton()
	{
		pageutility.javaScriptClick(driver, nextButton);//Implementing JavaScript-based click
		return this;
	}
	
	public UnsafeActPage clickreaOfWorkACRoom()
	{
		waitutility.waitUntilElementToBeClickable(driver, areaOfWorkACRoom);//Explicit Wait
		return this;
	}
	public UnsafeActPage enterTextDescriptionCorrectiveAction(String descriptionCorrectiveAction)
	{
		textDescriptionCorrectiveAction.sendKeys(descriptionCorrectiveAction);
		return this;
	}
	public UnsafeActPage clickObservationPPE()
	{
		waitutility.waitUntilElementToBeClickable(driver, observationPPE);//Explicit Wait
		return this;
	}
	public UnsafeActPage clickInterventionNoAction()
	{
		waitutility.waitUntilElementToBeClickable(driver, interventionNoAction);//Explicit Wait
		return this;
	}
	
	public UnsafeActPage clickCategoryOfObservation()
	{
		pageutility.javaScriptClick(driver, categoryOfObservation);//Implementing JavaScript-based click
		return this;
	}	
	public UnsafeActPage clickOutcomeCorrected()
	{
		pageutility.javaScriptClick(driver, outcomeCorrected);//Implementing JavaScript-based click
		return this;
	}
	public UnsafeActPage clickStatusOpen()
	{
		pageutility.javaScriptClick(driver, statusOpen);//Implementing JavaScript-based click
		return this;
	}
	public UnsafeActPage enterTextDescriptionSuggestions(String descriptionSuggestions)
	{
		textDescriptionSuggestions.sendKeys(descriptionSuggestions);//Valid Password. passwordvalue: to store excel read data
		return this;
	}
	public UnsafeActPage clickReviewButton()
	{
		pageutility.javaScriptClick(driver, reviewButton);//Implementing JavaScript-based click
		return this;
	}
	public UnsafeActPage clickSubmitButton()
	{
		pageutility.javaScriptClick(driver, submitButton);//Implementing JavaScript-based click
		return this;
	}
	public UnsafeActPage clickViewReportButton()
	{
		pageutility.javaScriptClick(driver, viewReportButton);//Implementing JavaScript-based click
		return this;
	}
	
	
}
