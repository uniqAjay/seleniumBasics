package sectionTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceptions {
	
//  	Diffrent types of exception in selenium
//	
//	   1 webdriver exception
//	     URL is not specified in  proper way
	
//	    2 Unreachable browser exception:
//		  When we interrupt the browser while running test script. we will get this exception
//
//		3 Unhandled exception:
//		   Alert pop is displayed and instead of handling alert pop up we perform another action 
//
//		4 No Alert pop exception:
//		  without an alert pop up we perform action on the alert popup 
//
//		5 unexpected tag name exception:
//		  When the tag name doesn't match the expected tag name 
//
//		6 not connected exceptions:
//		  version of selenium is not compatible with the browser
//		  
//		8 No Such Element Exception:
//		  when attempt is made to access an element that does not exist in DOM
		

	
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		
		    driver.get("https://www.fuckkkbook.com/");
	}
	

	  
	  
	  
	
	
	

}
