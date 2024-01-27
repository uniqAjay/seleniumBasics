package sectionTwo;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
//	The Action class is used for performing complex user interaction such as mouse and keybord Actions
	
//	1 Mouse actions:
//		Clicking
//		Double-clicking
//		Right-clicking
//		Moving to an element
//		Drag-and-drop
	
//	2	Keyboard actions:
//		Sending keys (typing)
//		Key combinations (e.g., Ctrl + C, Ctrl + V)
	 
//	** Clicking an element
//	Actions actions = new Actions(driver);
//	WebElement element = driver.findElement(By.cssSelector("your-css-selector"));
//	actions.click(element).perform();
//
//	** Double-clicking an element
//	Actions actions = new Actions(driver);
//	WebElement element = driver.findElement(By.cssSelector("your-css-selector"));
//	actions.doubleClick(element).perform();
//
//	** Right-clicking an element (Context Click)
//	Actions actions = new Actions(driver);
//	WebElement element = driver.findElement(By.cssSelector("your-css-selector"));
//	actions.contextClick(element).perform();
//
//	** Moving to an element
//	Actions actions = new Actions(driver);
//	WebElement element = driver.findElement(By.cssSelector("your-css-selector"));
//	actions.moveToElement(element).perform();
//
//	** Typing (Sending Keys) into an element
//	Actions actions = new Actions(driver);
//	WebElement element = driver.findElement(By.cssSelector("your-css-selector"));
//	actions.sendKeys(element, "Hello").perform();
//
//	** Key combination (e.g., Ctrl + A)
//	Actions actions = new Actions(driver);
//	WebElement element = driver.findElement(By.cssSelector("your-css-selector"));
//	actions.keyDown(element, "Ctrl").sendKeys("a").keyUp("Ctrl").perform();
//
//	** Drag-and-drop
//	Actions actions = new Actions(driver);
//	WebElement sourceElement = driver.findElement(By.cssSelector("source-css-selector"));
//	WebElement targetElement = driver.findElement(By.cssSelector("target-css-selector"));
//	actions.dragAndDrop(sourceElement, targetElement).perform();
//
//  ** Example of using build() with mouse and keyboard actions
//	Actions actions = new Actions(driver);
//
//	   Perform multiple actions (e.g., click, move to element, and type)
//	        actions.click(element)
//	       .moveToElement(anotherElement)
//	       .sendKeys("Hello")
//	       .build()
//	       .perform();
	
	
//	** Click-Hold and Release
//	Actions actions = new Actions(driver);
//	WebElement sourceElement = driver.findElement(By.cssSelector("source-css-selector"));
//	WebElement targetElement = driver.findElement(By.cssSelector("target-css-selector"));
//
//	actions.moveToElement(sourceElement)
//	       .clickAndHold()
//	       .moveToElement(targetElement)
//	       .release()
//	       .build()
//	       .perform();


	
	
	
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
	      
	      Thread.sleep(3000);
	      
	      for(int i = 1; i <= 12; i++) {
	    	  
	    	  act.sendKeys(Keys.ARROW_DOWN).perform();
	      }
	      
	      for(int i =1; i <=2; i++) {
	    	  
	    	  act.sendKeys(Keys.ARROW_UP).perform();

	      }
	      
	      
	      
	      
	}

}
