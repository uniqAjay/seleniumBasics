package sectionOne;

import org.apache.tools.ant.taskdefs.Replace;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
//**WebDriverManager
//	  Whenever we need to perform script on different browser we need downlaod those exe file and store into somewhere in machine
//	  and everytime we have to download newer version and older version will have Replace.
//	  so get rid of this kind  of situations we have webDriver API manager which will help us to call any browser without any conflicts
		
		
		
		
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().setSize(new Dimension(800, 600));
		driver.get("https://www.facebook.com/");
		System.out.println("page Title " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
		
	}

}
