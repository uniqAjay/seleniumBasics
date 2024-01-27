package sectionTwo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		int rowSize  = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		
//		outer for loop rows
		for (int i=0; i <= rowSize; i++) {
			
			int colsize;
			if(i == 1) {
				colsize = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th")).size();
				System.out.println("size of col "+ colsize);
			}
			
			else
			{
				colsize = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td")).size();
			}
//			inner for loop col.
			 String Text;
			 for(int j = 1; j <= colsize; j++) {
				 
				 if(i == 1) {
				 Text = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/th["+j+"]")).getText();
				 }
				 
				 else {
					 Text = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText();	
				 }
				 System.out.println("Web Table " + Text);
			  }
			 System.out.println();
			}
		driver.quit();
	 }
}
