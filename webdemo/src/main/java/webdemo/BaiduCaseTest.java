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
	
	//����������ĸ
	@Test
	public void testLetter() throws Exception {
		WebElement element=driver.findElement(By.id(inputId));
		element.sendKeys("selenium");
		driver.findElement(By.xpath(submitId)).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		assertEquals("selenium_�ٶ�����", driver.getTitle());
	}
	
	//��������Ϊ��
	@Test
	public void testNull() throws Exception {
		WebElement element=driver.findElement(By.id(inputId));
		element.sendKeys("");
		driver.findElement(By.xpath(submitId)).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		assertEquals("�ٶ�һ�£����֪��", driver.getTitle());
	}
	
	//�������뺺��
		@Test
		public void testChineseCharacter() throws Exception {
			WebElement element=driver.findElement(By.id(inputId));
			element.sendKeys("�����������ʦ");
			driver.findElement(By.xpath(submitId)).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			assertEquals("�����������ʦ_�ٶ�����", driver.getTitle());
		}

	@After
	public void tearDown() throws Exception {
//		driver.quit();
		driver.close();	}
}
