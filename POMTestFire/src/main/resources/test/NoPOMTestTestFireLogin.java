package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NoPOMTestTestFireLogin {

	/**
	 * This test case will login in www.testfire.net
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		WebDriver driver = new FirechromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("www.testfire.net");
	    String homeText = driver.findElement(By.xpath("//*[@id='LoginLink']/font']")).click();
		//Find user name and fill user name
	    driver.findElement(By.name("uid")).sendKeys("admin");
	    //find password and fill it
	    driver.findElement(By.name("passw")).sendKeys("admin");
	    //click login button
	    driver.findElement(By.name("btnSubmit")).click(); 
	    //verify login success
		Assert.assertTrue(homeText.toLowerCase().contains("Congratulations!"));
	}
	
}
