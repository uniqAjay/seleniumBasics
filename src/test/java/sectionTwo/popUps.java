package sectionTwo;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popUps {
	
//	popups are small or seprate window which will be displayed when we perfrom action in any componants which is present in a webpage
//	This popups can be handle somtimes directly but sometimes we may need to use third party tools to handle this poups
	
//   types of popups 
	
//	 1 Hidden-division popup
//	 2 Alert Popup
//	 3 child browser popup
//	 4 Authentication popup 
//	 5 file uplod popup
//	 6 file downlaod popup
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		1 Hidden-division popup
//		Example: FlipKart colorful log
		
//		2 Alert Popup
//	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
//	   driver.switchTo().frame("iframeResult");
//	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
//	   Alert alt = driver.switchTo().alert();
//	   alt.accept();
		
		
//	   3 child browser popup
//	   driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		
//	   // Store the handle of the main window
//       String mainWindowHandle = driver.getWindowHandle();
//       driver.manage().window().maximize();
//       
//       Thread.sleep(3000);
//
//       // Click on a link or button that opens a new window
//       driver.findElement(By.xpath("//button[@class='whButtons']")).click();
//       
//
//       // Get the handles of all open windows
//       Set<String> windowHandles = driver.getWindowHandles();
//
//       // Iterate through window handles to switch to the child window
//       for (String windowhandle : windowHandles) {
//    	   
//    	   driver.switchTo().window(windowhandle);
//    	   System.out.println("realWorld " + driver.getTitle() );
//		
//	}
//
//       // Switch back to the main window
//       driver.switchTo().window(mainWindowHandle);
//
//       // Continue with actions in the main window
//
//       // Close the browser
//       Thread.sleep(3000);
//       driver.quit();
//     
       
//     4 Authentication popUp
       
		String login = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get(login);
        System.out.println("welcomeToRealWorld  " + driver.getTitle());
        
        driver.quit();
   } 
	

	   
	}
	
 
	

