package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	// global, so all methods can use
		static WebDriver driver;

		public static WebDriver startBrowser() {
			// Set Chrome Driver Properties
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alidf\\git\\GithubPractice\\driver\\chromedriver.exe");
			// Create ChromeDriver object and launch chrome browser
			WebDriver driver = new ChromeDriver();		
			
			// return the driver to the test class
			driver.manage().deleteAllCookies();
			driver.get("https://www.geico.com/");
			driver.manage().window().maximize();
			String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
			return driver;
		}
	
	
	
	
	

}
