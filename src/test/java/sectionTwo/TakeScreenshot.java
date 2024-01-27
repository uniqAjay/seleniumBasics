package sectionTwo;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class TakeScreenshot {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://www.facebook.com/");


        // Take a screenshot and save it to a file
        try {
            // Convert WebDriver object to TakesScreenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;
           

            // Capture the screenshot as a file
            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

            // Define the destination file path
            File destinationFile = new File("Selenium-Concepts/target/screenshot.png");

            // Copy the screenshot file to the destination file
            FileUtils.copyFile(sourceFile, destinationFile);

            System.out.println("Screenshot taken and saved at: " + destinationFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("Error while taking screenshot: " + e.getMessage());
        } finally {
            // Close the WebDriver instance
            driver.quit();
        }
    }
}
