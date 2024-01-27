package PageObjectModuleWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModuleWithPageFactory {
	
//      Page Object Module:
//		POM is java design pattern used to design classes of testScript that organizes code for interacting with web pages
//		Where web pages represented as class, the verious webelement defined as variables in the class
	
//      PageFactory 
//		page factory is utility class in selenium with enitelements static method which is used to initialize web elements
//		which is annotated by FindBy in page object  
	
	       private WebDriver driver;

		    @FindBy(xpath = "//input[@name='email']")
		    private WebElement usernameInput;

		    @FindBy(xpath = "//input[@name='pass']")
		    private WebElement passwordInput;

		    @FindBy(xpath = "//button[contains(@id,'u_0_5_')]")
		    private WebElement loginButton;

		    public PageObjectModuleWithPageFactory(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }

		    public void enterUsername(String username) {
		        usernameInput.sendKeys(username);
		    }

		    public void enterPassword(String password) {
		        passwordInput.sendKeys(password);
		    }

		    public void clickLoginButton() {
		        loginButton.click();
		    }
		}	
	

