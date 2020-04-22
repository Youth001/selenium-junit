/**
 * 
 */
package webdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaiduCaseTest {
	
	private final String url="https://www.baidu.com";
	private final String inputId="kw";
	private final String submitId=" //*[@id='su'] ";
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);	
	}
	
	//测试输入字母
	@Test
	public void testLetter() throws Exception {
		WebElement element=driver.findElement(By.id(inputId));
		element.sendKeys("selenium");
		driver.findElement(By.xpath(submitId)).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		assertEquals("selenium_百度搜索", driver.getTitle());
	}
	
	//测试输入为空
	@Test
	public void testNull() throws Exception {
		WebElement element=driver.findElement(By.id(inputId));
		element.sendKeys("");
		driver.findElement(By.xpath(submitId)).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		assertEquals("百度一下，你就知道", driver.getTitle());
	}
	
	//测试输入汉字
		@Test
		public void testChineseCharacter() throws Exception {
			WebElement element=driver.findElement(By.id(inputId));
			element.sendKeys("软件开发工程师");
			driver.findElement(By.xpath(submitId)).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			assertEquals("软件开发工程师_百度搜索", driver.getTitle());
		}

	@After
	public void tearDown() throws Exception {
//		driver.quit();
		driver.close();	}
}
