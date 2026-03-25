package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnsafeActPage {
	public WebDriver driver;
	
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
		startReportingButton.click();
		return this;
	}
	public UnsafeActPage clickYesAnonymousUser()
	{
		yesAnonymousUser.click();
		return this;
	}	
	public UnsafeActPage clickReportNext()
	{
		reportNext.click();
		return this;
	}
	public UnsafeActPage clicktypeUnsafeAct()
	{
		typeUnsafeAct.click();
		return this;
	}
	public UnsafeActPage enterTextDescriptionOfUnsafeAct(String descriptionUnsafeAct)
	{
		textDescriptionOfUnsafeAct.sendKeys(descriptionUnsafeAct);//Valid Password. passwordvalue: to store excel read data
		return this;
	}
	public UnsafeActPage clickUploadFileButton()
	{
		uploadFileButton.click();
		return this;
	}
	public UnsafeActPage clickNextButton()
	{
		nextButton.click();
		return this;
	}
	
	public UnsafeActPage clickreaOfWorkACRoom()
	{
		areaOfWorkACRoom.click();
		return this;
	}
	public UnsafeActPage enterTextDescriptionCorrectiveAction(String descriptionCorrectiveAction)
	{
		textDescriptionCorrectiveAction.sendKeys(descriptionCorrectiveAction);//Valid Password. passwordvalue: to store excel read data
		return this;
	}
	public UnsafeActPage clickObservationPPE()
	{
		observationPPE.click();
		return this;
	}
	public UnsafeActPage clickInterventionNoAction()
	{
		interventionNoAction.click();
		return this;
	}
	
	public UnsafeActPage clickCategoryOfObservation()
	{
		categoryOfObservation.click();
		return this;
	}	
	public UnsafeActPage clickOutcomeCorrected()
	{
		outcomeCorrected.click();
		return this;
	}
	public UnsafeActPage clickStatusOpen()
	{
		statusOpen.click();
		return this;
	}
	public UnsafeActPage enterTextDescriptionSuggestions(String descriptionSuggestions)
	{
		textDescriptionSuggestions.sendKeys(descriptionSuggestions);//Valid Password. passwordvalue: to store excel read data
		return this;
	}
	public UnsafeActPage clickReviewButton()
	{
		reviewButton.click();
		return this;
	}
	public UnsafeActPage clickSubmitButton()
	{
		submitButton.click();
		return this;
	}
	public UnsafeActPage clickViewReportButton()
	{
		viewReportButton.click();
		return this;
	}
	
	
}
