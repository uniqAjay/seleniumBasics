package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class ParallelBrowserTest {
	
	private WebDriver driver;
	
	  @Parameters("browserName")
	  @BeforeTest
	    public void setUp(String browserName) {
	       
			// Initialize the WebDriver based on the browser parameter
	        switch (browserName.toLowerCase()) {
	            case "chrome":
	            WebDriverManager.chromedriver().setup();
	                driver = new ChromeDriver();
	                break;
	            case "firefox":
	            	WebDriverManager.firefoxdriver().setup();
	                driver = new FirefoxDriver();
	                break;
	            default:
	                throw new IllegalArgumentException("Invalid browser specified: " + browserName);
	        }
	    }

	@Test
	public void testExample() {
	        // Your test code goes here
	        driver.get("https://www.facebook.com/");
	        // Add your test steps
	    }

	
		
	    public void tearDown() {
	        // Close the browser after the test
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
