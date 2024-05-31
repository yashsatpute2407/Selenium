package com.crm.listernersCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Basic.BaseClass;
@Listeners(Basic.DwsListeners.class)

	public class TestClass2 extends BaseClass{
	
	@Test
	public void giftCart() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')[1]")).click();
		
		Thread.sleep(2000);
		List <WebElement> addCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (WebElement web : addCart) 
		{
			web.click();
			Thread.sleep(2000);
		}
		
	}
	

}