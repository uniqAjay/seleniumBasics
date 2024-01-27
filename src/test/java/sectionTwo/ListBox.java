package sectionTwo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox {
//	In Selenium, a ListBox is a web element that represents a list of options, often displayed as a drop-down menu
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://www.facebook.com/");
       
       Properties props = new Properties();
       FileInputStream input = new FileInputStream("config.properties");
       props.load(input);
      
       
      String createAccount =  props.getProperty("fbcreateAccount");
      driver.findElement(By.xpath(createAccount)).click();		
//    String monthId ="//select[@id='month']";
       
       Thread.sleep(3000);
       String realWorld = "May";
       
       Select select = new Select(driver.findElement(By.xpath("//select[(@id='month')]")));
       
       List<WebElement> Options = select.getOptions();
       
       for(WebElement option: Options) {
    	   
    	   String Matrix = option.getText();
    	   	if(Matrix.contains(realWorld)) {
    		   
    		   System.out.println("welcome to realWorld");
    		    
    	   }
    	   
    	  
    	   
       }
       
       driver.quit();
      
		
		
		
		
		
	}

	
	
		

}
