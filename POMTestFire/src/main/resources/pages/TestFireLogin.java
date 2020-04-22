package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestFireLogin {

	WebDriver driver;
	By userTestFireName = By.name("uid");
	By passwordTestFire = By.name("passw");
	By login = By.name("btnSubmit");
	
	public TestFireLogin(WebDriver driver){
		this.driver = driver;
	}
	//Set user name in textbox
	public void setUserName(String strUserName){
		driver.findElement(userTestfireName).sendKeys(strUserName);;
	}
	
	//Set password in password textbox
	public void setPassword(String strPassword){
		 driver.findElement(passwordTestfire).sendKeys(strPassword);
	}
	
	//Click on login button
	public void clickLogin(){
			driver.findElement(login).click();
	}
	
	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param strUserName
	 * @param strPasword
	 * @return
	 */
	public void loginToTestFire(String strUserName,String strPasword){
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPasword);
		//Click Login button
		this.clickLogin();		
		
	}
}
