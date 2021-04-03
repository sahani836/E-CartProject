package com.activetime.Testcases;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.activetime.PageObject.LoginPage;
import com.activetime.PageObject.Purchage_ItemPage;

public class Purchage_Item_TC03 extends BaseClass {

	@Test
	public void Purchage_Item_TC03() throws InterruptedException {
		driver.get(baseUrl);
		logger.info("URL is launched");
		LoginPage lp = new LoginPage(driver);
		lp.Signin();
		lp.setUserName(Username);
		logger.info("User name Entered");
		lp.setPassword(Password);
		logger.info("Password is entered");
		lp.clikSubmit();
		Purchage_ItemPage PurchItem = new Purchage_ItemPage(driver);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Women' and @class='sf-with-ul']"))).build()
				.perform();
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//ul//a[contains(text(),'T-shirts')]"))
				.click();
		logger.info("click on woman");
		act.moveToElement(
				driver.findElement(By.xpath("//a[@class='product-name'][contains(.,'Faded Short Sleeve T-shirts')]")))
				.build().perform();
		logger.info("clicked on T-shirts");
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		logger.info("clicked on add to cart");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).click();
		logger.info("Proceed to checkout1");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]")).click();
		logger.info("Proceed to checkout2");

		jse.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]")).click();
		logger.info("Proceed to checkout3");
		//driver.findElement(By.xpath("//input[contains(@id,'cgv')]")).click();
 
		
		
		 driver.findElement(By.xpath("//input[@id='cgv']")).click();
		 logger.info("Radio button checked");
		

		 
		jse.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]")).click();
		logger.info("Proceed to checkout4");

		driver.findElement(By.xpath("//a[@class='bankwire' and @title='Pay by bank wire']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		logger.info("click on I confirm my order");
		
		
		String order_page = driver.getTitle();  
		WebElement order_confirmed = driver.findElement(By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]"));
		System.out.println(order_confirmed.getText()); 
		if (order_page.equals("Order confirmation - My Store"))
		{
			System.out.println("Ordrer completed succssfully");
			Assert.assertTrue(true);
			logger.info("Test Case is Passed");
		}
		else if(order_confirmed.equals("Your order on My Store is complete"))
		{
			System.out.println("Your order on My Store is complete");
			Assert.assertTrue(true);
			logger.info("Test Case is Passed");
		}
		else {
			System.out.println("Your order on My Store is Not completed");
			Assert.assertTrue(false);
			logger.info("Test Case is Failed");
			}
	}

	
	
}