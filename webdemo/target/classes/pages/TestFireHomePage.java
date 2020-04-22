package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFireHomePage {

	WebDriver driver;
	By homePageUserName = By.xpath("//*[@id='LoginLink']/font");
	
	public TestFireHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//Get the User name from Home Page
		public String getHomePageDashboardUserName(){
		 return	driver.findElement(homePageUserName).getText();
		}
}
