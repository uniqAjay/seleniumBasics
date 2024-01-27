package sectionTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {
	
//		Dislpaying webpage as part of another webpage is know as iframe 


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://www.rediff.com/");
       
//       for handling i frame we need to switch selenium focus from main page to iframe: given below
//       	
		driver.switchTo().frame("moneyiframe");

        // Perform actions inside the iframe
		System.out.println( "nse value is " + driver.findElement(By.id("nseindex")).getText());

        // Switch back to the main content
        driver.switchTo().defaultContent();

        // Continue with actions on the main content
        driver.findElement(By.xpath("//a[@class='mailicon']")).click();
        Thread.sleep(3000);

        // Close the browser
        driver.quit();
	}
}
