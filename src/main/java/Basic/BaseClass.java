package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass 
{
	public WebDriver driver;
	Properties prop;
	String url;
	String username;
	String password;
	
	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Yash\\eclipse-workspace\\com.crm.listernersCode\\src\\test\\resources\\Data\\LoginDws.properties");
		prop.load(file);
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		url = prop.getProperty("url");
		username = prop.getProperty("username");
		password = prop.getProperty("password");
		
	}
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.navigate().to(url);
//		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{	
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("Email")).sendKeys(username);
//		Thread.sleep(2000);
//		driver.findElement(By.id("Password")).sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	
	@AfterMethod
	public void afterMethod()
	{
		//driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Write Post condition for Test Runner");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Logic for db disconnect");
	}
}
