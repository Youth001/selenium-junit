package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99Login;

public class TestTestFireLogin {
	
	String driverPath =" D:\\driver\\chromedriver.exe";
	WebDriver driver;
	TestFireLogin objLogin;
	TestFireHomePage objHomePage;
	
	@BeforeTest
	public void setup(){
		driver = new FirechromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("www.testfire.net");
	}

	/**
	 * This test case will login in www.testfire.net
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
	//Create Login Page object
	objLogin = new TestFireLogin(driver);
	// go the next page
	objHomePage = new Guru99HomePage(driver);
	//login to application
	objLogin.loginToGuru99("admin", "admin");
	//Verify home page
	Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("Congratulations!"));
	}
	
}
