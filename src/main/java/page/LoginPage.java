package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
WebDriver driver;

	
	
	// Every Page must have a constructor to invite the driver hjjjjjjj
	
	  public LoginPage(WebDriver driver) { this.driver = driver; }
	 

	// Element Library

	/*
	 * @FindBy(how = How.LINK_TEXT, using = "Online Banking") WebElement
	 * ClickOnlineBanking;
	 */

	@FindBy(how = How.NAME, using = "SubmitButtonComponent-1")
	WebElement Submitt;

	@FindBy(how = How.XPATH, using = "//input[@id='TextInputComponent-1']")
	WebElement UserID;

	@FindBy(how = How.XPATH, using = "//input[@id='TextInputComponent-2']")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//option[@class='manage_auto']")
	WebElement ClickAuto;

	@FindBy(how = How.ID, using = "manage_select")
	WebElement ClickList;

	@FindBy(how = How.ID, using = "manageSubmit")
	WebElement SubmittLogin;

	@FindBy(how = How.NAME, using = "Submit")
	WebElement LoginButton;

	@FindBy(how = How.XPATH, using = "//a[@class='login header-right-label']")
	WebElement Login;

	@FindBy(how = How.XPATH, using = "//option[@value='manage_boat']")
	WebElement ClickBoat;

	@FindBy(how = How.ID, using = "zip")
	WebElement ZipCode;

	@FindBy(how = How.ID, using = "submitButton")
	WebElement StartQuote;

	@FindBy(how = How.NAME, using = "FirstName")
	WebElement FirstName;

	@FindBy(how = How.NAME, using = "LastName")
	WebElement LastName;

	@FindBy(how = How.ID, using = "NextButton")
	WebElement NameNextButton;

	@FindBy(how = How.NAME, using = "datePickerDatePicker")
	WebElement DOB;

	@FindBy(how = How.ID, using = "NextButton")
	WebElement DOBNameNextButton;
	
	@FindBy(how = How.ID, using = "AddressSearch")
	WebElement EnterAddress;

	@FindBy(how = How.ID, using = "UnitNumber")
	WebElement AptNo;
	
	@FindBy(how = How.ID, using = "NextButton")
	WebElement AddressNextButton;
	
	@FindBy(how = How.ID, using = "labelForother")
	WebElement CheckBox;
	
	@FindBy(how = How.ID, using = "NextButton")
	WebElement CheckBoxNext;
	
	@FindBy(how = How.ID, using = "VehicleYear")
	WebElement Vehicleyear;
	
	@FindBy(how = How.ID, using = "option2019")
	WebElement SelectYear;
	
	
	@FindBy(how = How.XPATH, using = "//select[@id='VehicleMake']")
	WebElement Make;
	
	@FindBy(how = How.ID, using = "optionBMW")
	WebElement MakeSelect;
	
	@FindBy(how = How.ID, using = "VehicleModel")
	WebElement Model;
	
	@FindBy(how = How.ID, using = "option230ixDrive")
	WebElement ModelSelection;
	
	@FindBy(how = How.ID, using = "NextButton")
	WebElement VehicleNextButton;
	
	@FindBy(how = How.ID, using = "labelForCoupe 2 Door")
	WebElement RadioButton;
	
	
	@FindBy(how = How.ID, using = "NextButton")
	WebElement RadioNextButton;
	
	@FindBy(how = How.ID, using = "labelForOwned")
	WebElement RadioOwnership;
	
	@FindBy(how = How.ID, using = "NextButton")
	WebElement RadioOwnerNextButton;
	
	
	@FindBy(how = How.ID, using = "labelForPleasure")
	WebElement RadioButtonPleasure;
	
	@FindBy(how = How.ID, using = "NextButton")
	WebElement PleasureNextButton;
	
	
	public void EnterID() throws InterruptedException {

		/*
		 * WebDriverWait wait = new WebDriverWait (driver, 500);
		 * wait.until(ExpectedConditions.visibilityOf(UserId));
		 */

		/*
		 * UserId.click();
		 * 
		 * 
		 * UserId.sendKeys("Argylesupercenter@gmail.com");
		 */

		/* Password.sendKeys("Pakistan1$"); */

		String title = driver.getTitle();

		System.out.println(title);
		WebDriverWait wait = new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.visibilityOf(Login));
		Login.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 9000);
		wait1.until(ExpectedConditions.visibilityOf(ClickList));
		ClickList.click();

		ClickBoat.click();

		ClickAuto.click();

		SubmittLogin.click();

	}

	public void Email() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);

		WebDriverWait wait = new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.visibilityOf(UserID));

		String title2 = driver.getTitle();
		System.out.println("PPPPPOOOOPPPPP" + title2);
		
		WebDriverWait wait3 = new WebDriverWait(driver, 9000);
		wait3.until(ExpectedConditions.visibilityOf(UserID));

		UserID.sendKeys("Alikhansaab");
		WebDriverWait wait4 = new WebDriverWait(driver, 9000);
		wait4.until(ExpectedConditions.visibilityOf(Password));
		Password.sendKeys("Cocojee420");

		WebDriverWait wait2 = new WebDriverWait(driver, 900);
		wait2.until(ExpectedConditions.visibilityOf(Submitt));

		Submitt.click();
		driver.navigate().back();

	};

	public void GetTile() {
		String printTitle = driver.getTitle();
		System.out.println(printTitle);

	};

	public void closewebsite() {

		driver.close();
		driver.quit();
	};

	public void StartQuote() {

		ZipCode.sendKeys("75070");
		StartQuote.click();

	}

	public void EnterName() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOf(FirstName));

		

		FirstName.sendKeys("ali");
		LastName.sendKeys("Khan");
		WebDriverWait wait2 = new WebDriverWait(driver, 9000);
		wait2.until(ExpectedConditions.visibilityOf(NameNextButton));
		Thread.sleep(500);
		NameNextButton.click();

	}

	public void DOB(String date) {

		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOf(DOB));

		DOB.sendKeys(date);
		DOBNameNextButton.click();

	}
	
	
	
	public void Address(String add, String Appt) {
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOf(EnterAddress));
		EnterAddress.sendKeys(add);
		AptNo.sendKeys(Appt);
		AddressNextButton.click();	
		
		
	}
	
	
	public void checkbox() {
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		CheckBox.click();
		CheckBoxNext.click();
		
	}

	
	
	public void Vehicle() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.visibilityOf(Vehicleyear));
		Vehicleyear.click();
		WebDriverWait wait4 = new WebDriverWait(driver, 9000);
		wait4.until(ExpectedConditions.visibilityOf(SelectYear));
		SelectYear.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 9000);
		wait2.until(ExpectedConditions.visibilityOf(Make));
		
		
		Make.click();
		WebDriverWait wait5 = new WebDriverWait(driver, 9000);
		wait5.until(ExpectedConditions.visibilityOf(MakeSelect));
		MakeSelect.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 9000);
		wait3.until(ExpectedConditions.visibilityOf(Model));
		
		Model.click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 9000);
		wait6.until(ExpectedConditions.visibilityOf(ModelSelection));
		ModelSelection.click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 9000);
		wait7.until(ExpectedConditions.visibilityOf(VehicleNextButton));
		VehicleNextButton.click();
		
		
		
		
	}
	
	public void Radio () {
		
		WebDriverWait wait6 = new WebDriverWait(driver, 9000);
		wait6.until(ExpectedConditions.visibilityOf(RadioButton));
		
		RadioButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.visibilityOf(RadioNextButton));
		
		RadioNextButton.click();
		
		
	}
	
	
	public void ownership() {
		
		WebDriverWait wait = new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.visibilityOf(RadioOwnership));
		
		RadioOwnership.click();
		
		
		
		RadioOwnerNextButton.click();
		
	}
	
	
	public void PrimaryUsa () {
		WebDriverWait wait = new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.visibilityOf(RadioButtonPleasure));
		RadioButtonPleasure.click();
		PleasureNextButton.click();
	}
	
	
	
	
	
	
	public void wait(WebElement Ele) {
	
		WebDriverWait wait = new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.visibilityOf(Ele));	
		
		
	}
	
	
	
	
	

}
