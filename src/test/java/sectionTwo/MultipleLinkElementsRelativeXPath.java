package sectionTwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sectionOne.webElementMethods;

public class MultipleLinkElementsRelativeXPath {
	
//	If you want to locate multiple elements using relative XPath in Selenium with Java,
//	you can use the findElements method, which returns a list of all matching elements.
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("links size is "+links.size());
		
		for (WebElement link : links) {
			
			System.out.println("Link text "+link.getText());
			
		}
		
		
		
		
		
		
	}
	
	
	
	

}
