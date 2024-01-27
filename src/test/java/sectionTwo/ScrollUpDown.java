package sectionTwo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.bidi.log.JavascriptLogEntry;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpDown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		
		
		exe.executeScript("window.scrollBy(0,1000)");
		
//		exe.executeScript("window.scrollBy(0,-800)");
		
	
		
		
	}
	
	
	

}
