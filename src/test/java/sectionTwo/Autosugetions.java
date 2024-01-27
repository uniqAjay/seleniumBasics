package sectionTwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugetions {
	
//	In Selenium, autosuggestions or dropdown lists are commonly encountered elements, especially when dealing with web forms.
//	You can interact with autosuggestions using the sendKeys() method to type into the input field and then handle the suggestions that appear.
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		
		String expectedResul = "Apple iphone 15";
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@type='search']"));
		searchBox.click();
		searchBox.sendKeys("Apple iphone");
	    List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	    
	    for (WebElement result : options) {
	    	String actualResult = result.getText();
	    	
	    if (actualResult.equalsIgnoreCase(expectedResul)) {
	    	result.click();
	    	
		}
	    	
	    		
	    	
	    	
	    	
			
		}
		
		
		
	}
}
