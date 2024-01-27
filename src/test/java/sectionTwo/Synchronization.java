package sectionTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {
//	**Waits
//		waits in Selenium are used to handle situations where elements on a web page may not be immediately available or may take some time to load.
//		By using waits, you ensure that your Selenium script synchronizes with the dynamic nature of web pages,
//		allowing it to wait for elements to be ready for interaction before performing actions on them.
	public static void main(String[] args) {
		
//	**Implicit Waits:
//		Set for a certain amount of time throughout the entire execution of the script. If the element is not immediately available,
//		Selenium will wait for the specified time before throwing an exception.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
//	**Explicit Waits:
//		Used for a specific condition to be met before proceeding further in the code.
//		It involves using the WebDriverWait class along with expected conditions from the ExpectedConditions class.
		
		
		driver.get("https://www.facebook.com/");
	       String createAccount = "//a[contains(@id,'u_0_0')]";
	       driver.findElement(By.xpath(createAccount)).click();	
	       
//	       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[(@id='month')]")));
//	       
//	       Select select = new Select(driver.findElement(By.xpath("//select[(@id='month')]")));
//	       
//	       select.selectByValue("3");
	
	      
//	  **Fluent Waits:
//	    	Provide more flexibility compared to implicit and explicit waits.
//	    	They allow you to specify the polling frequency and the maximum amount of time to wait for a condition. 
	       
	       Wait<WebDriver> waitt = new FluentWait<>(driver)
	    		   .withTimeout(Duration.ofSeconds(10))
	    		   .pollingEvery(Duration.ofSeconds(2))
	    		   .ignoring(NoSuchElementException.class);	       
	       waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[(@id='month')]")));	       
	       Select select = new Select(driver.findElement(By.xpath("//select[(@id='month')]")));
	       
	       select.selectByValue("3"); 
	       
	
	
	}

	
}
