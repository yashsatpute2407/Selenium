package PageObjectModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLoginPage;	

public class LoginDws{
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		DwsLoginPage dws = new DwsLoginPage(driver);
		Thread.sleep(2000);
		dws.username.sendKeys("admin01@gmail.com");
		Thread.sleep(2000);
		dws.password.sendKeys("admin01");
		Thread.sleep(2000);
		dws.login_button.click();
		Thread.sleep(2000);
	}
}
