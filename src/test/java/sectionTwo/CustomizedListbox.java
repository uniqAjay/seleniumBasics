package sectionTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizedListbox {
	
//	listbox which is created without using select tag name those we usally called customized listbox
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		    driver.get("https://www.facebook.com/");
	       
	       String createAccount = "//a[contains(@id,'u_0_0')]";
	       
	       driver.findElement(By.xpath(createAccount)).click();		
	       
	       Thread.sleep(3000);
	       
	       WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	       
	  
	      Actions act = new Actions(driver);
	      act.click(month).perform();
	      

	      
	      for(int i = 1; i <= 12; i++) {
	    	  
	    	  act.sendKeys(Keys.ARROW_DOWN).perform();
	      }
	      
	      for(int i =1; i <=2; i++) {
	    	  
	    	  act.sendKeys(Keys.ARROW_UP).perform();

	      }
	      
	      
	      
	      
	}

}
