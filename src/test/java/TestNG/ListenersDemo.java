package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;


import io.github.bonigarcia.wdm.WebDriverManager;



@Listeners(ListenersImp.class)
public class ListenersDemo {
	
	//In order to Implement Listeners at class level
	
	@Test
	public void start() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
		
	}
	
	

}
