package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginpage;

	// to make it global so don't need to create object in each method

	
	  @Before public void beforeRun() { driver = BrowserFactory.startBrowser();
	  loginpage = PageFactory.initElements(driver, LoginPage.class);
	  
	  }
	  
	  
	/*
	 * @After public void afterrun() {
	 * 
	 * driver.quit(); driver.close(); }
	 */
	 
	
	
	
	
	@Given("^User Enter Id and Password$")
	public void user_Enter_Id_and_Password() throws InterruptedException  {
		
		loginpage.EnterID();
	}

	@Then("^User is able to login$")
	public void user_is_able_to_login() throws InterruptedException  {
		
		loginpage.Email();
	}

	@Then("^user is on Online Banking console$")
	public void user_is_on_Online_Banking_console()  {
		
		loginpage.GetTile();
		
	    
	}

	@Given("^User is no geico\\.com$")
	public void user_is_no_geico_com()  {
		
		
		loginpage.GetTile();
	   
	}

	@When("^Enter zip and start quote$")
	public void enter_zip_and_start_quote()  {
		
		
		loginpage.StartQuote();
	    
	}

	@Then("^Customer enter name and dob and address$")
	public void customer_enter_name_and_dob_and_address() throws InterruptedException  {
		
		
		String expectedtitle = "GEICO SCAI";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, Actualtitle);
		
		loginpage.EnterName();
		loginpage.DOB("01171980");
		loginpage.Address("5621 hampshire dr", "");
		loginpage.checkbox();
		
	    
	}

	@Then("^user can add car info and ownwership$")
	public void user_can_add_car_info_and_ownwership() throws InterruptedException  {
		
		loginpage.Vehicle();
		loginpage.Radio();
		loginpage.ownership();

		
	    
	}

	@Then("^user enters driving habits$")
	public void user_enters_driving_habits()  {
		
		loginpage.PrimaryUsa();
		
		
	    
	}

	@Then("^user slects days of driving and miles$")
	public void user_slects_days_of_driving_and_miles() {
	   
	}

	@Then("^user verfies Annual Milleage and go next$")
	public void user_verfies_Annual_Milleage_and_go_next()  {
	    
	}

	@Then("^verify personal info$")
	public void verify_personal_info()  {
	    
	}

	
	
	

}
