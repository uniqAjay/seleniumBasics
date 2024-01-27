package PageObjectModuleWithPageFactory;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test(groups = "enabled")
public class TestClass {

	 private WebDriver driver;
	    private PageObjectModuleWithPageFactory loginPage;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");

	        // Initialize LoginPage using PageFactory
	        loginPage = new PageObjectModuleWithPageFactory(driver);
	    }

	    @Test
	    public void loginTest() {
	        // Perform login actions using methods from the LoginPage
	        loginPage.enterUsername("your_username");
	        loginPage.enterPassword("your_password");
	        loginPage.clickLoginButton();

	        // Add assertions or further test steps based on the login result
	        // ...
	    }
       @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	
	
}
