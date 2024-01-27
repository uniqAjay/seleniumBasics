package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@Test(groups = "disabled")
public class Annotations {
	
	@BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod(enabled = false)
    public void beforeMethod( ) {
        System.out.println("Before Method");
    }

    @Test(priority = 1, description = "Test Method 1", invocationCount = 2, enabled = true, timeOut = 5000)
    public void testMethod1() {
        System.out.println("Test Method 1");
        Assert.assertTrue(true, "Assertion Message for Test Method 1");
    }

    @Test(priority = 2, description = "Test Method 2", enabled = false)
    public void testMethod2() {
        System.out.println("Test Method 2");
        Assert.assertEquals("Hello", "Hello", "Assertion Message for Test Method 2");
    }

    @AfterMethod(enabled = false)
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
	
	

}
