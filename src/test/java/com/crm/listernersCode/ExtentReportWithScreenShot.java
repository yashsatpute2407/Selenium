package com.crm.listernersCode;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.pom.DwsLoginPage;

import Basic.DwsBaseClass;
@Listeners(com.crm.listernersCode.TakeScreenShotWithExtentReport.class)

public class ExtentReportWithScreenShot extends DwsBaseClass{
	@Test
	public void dwsLoginCorrect() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws = new DwsLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		Thread.sleep(2000);
		dws.login_button();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@Test
	public void dwsLoginWrong() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws = new DwsLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin02");
		Thread.sleep(2000);
		dws.login_button();
		Thread.sleep(2000);
		assertEquals("123", "142");
	}
	
	@Test(dependsOnMethods = "dwsLoginWrong")
	public void redBus() {
		driver.get("https://www.redbus.in/");
	}

}
