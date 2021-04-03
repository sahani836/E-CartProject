package com.activetime.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.activetime.PageObject.LoginPage;
import com.activetime.PageObject.Purchage_BlousePage;
import com.activetime.PageObject.Purchage_ItemPage;

public class Purchase_Blouse_TC04 extends BaseClass {
	@Test
	public void Purchase_Blouse_TC04() throws InterruptedException {
		driver.get(baseUrl);
		logger.info("URL is launched");
		LoginPage lp = new LoginPage(driver);
		lp.Signin();
		lp.setUserName(Username);
		logger.info("User name Entered");
		lp.setPassword(Password);
		logger.info("Password is entered");
		lp.clikSubmit();
		Purchase_Blouse_TC04 PurchItemblse = new Purchase_Blouse_TC04();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Women' and @class='sf-with-ul']"))).build()
				.perform();
		Thread.sleep(3000);
		logger.info("click on click on blouse1");
		Purchage_BlousePage blp = new Purchage_BlousePage(driver);
		blp.CLickblouse();
		logger.info("click on click on blouse2");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)", "");
		logger.info("click on click on blouse3");
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Blouses']"))).build().perform();

		logger.info("click on click on blouse4");
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Blouse' and @class='product_img_link']"))).build()
				.perform();

		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Add to cart']/span[1]"))).build().perform();
		logger.info("Proceed to checkout2");
		driver.findElement(By.xpath("//a[@title='Add to cart']/span[1]")).click();

		Thread.sleep(3000);

		logger.info("Item successfully added in the card");
		System.out.println("===============================================================");
		System.out.println("================Product info and Details=======================");
		blp.Catogories();
		System.out.println("===============================================================");

		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//a[@class='btn btn-default button button-medium' and @title='Proceed to checkout']"))
				.click();
		logger.info("Proceed to checkout1");

		jse.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]")).click();
		logger.info("Proceed to checkout2");

		jse.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]")).click();
		logger.info("Proceed to checkout3");

		jse.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]")).click();
		logger.info("Proceed to checkout4");

		//WebElement element = driver.findElement(By.xpath("//input[@id='cgv']"));
		WebElement element = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]"));
		
		act.moveToElement(element).click().build().perform();
		logger.info("Radio button checked");
		jse.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		logger.info("Proceed to checkout5");

		driver.findElement(By.xpath("//a[@class='bankwire' and @title='Pay by bank wire']")).click(); 
		
//		if(element.isEnabled()==true);
//		{
//			System.out.println("hello");
//		}
//
//		jse.executeScript("window.scrollBy(0,700)", "");
//		WebElement checkout5 = driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]"));
//		act.moveToElement(checkout5).click().build().perform();
//     	logger.info("Proceed to checkout5");
////		
//		System.out.println(driver.getCurrentUrl());
//		jse.executeScript("window.scrollBy(0,700)", "");
//		WebDriverWait wait = new WebDriverWait(driver, 10); 
//		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='cheque' and @title='Pay by check.']/span")));
//		element1.click();
//		logger.info("Clicked on Pay by bank wire");
		
		
		// driver.findElement(By.xpath("//input[@id='cgv']")).click();
		// logger.info("Radio button checked");
		
  

		
		
//		
//		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
//		logger.info("click on I confirm my order");
//
//		String order_page = driver.getTitle();
//		WebElement order_confirmed = driver
//				.findElement(By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]"));
//		System.out.println(order_confirmed.getText());
//		if (order_page.equals("Order confirmation - My Store")) {
//			System.out.println("Ordrer completed succssfully");
//			Assert.assertTrue(true);
//			logger.info("Test Case is Passed");
//		} else if (order_confirmed.equals("Your order on My Store is complete")) {
//			System.out.println("Your order on My Store is complete");
//			Assert.assertTrue(true);
//			logger.info("Test Case is Passed");
//		} else {
//			System.out.println("Your order on My Store is Not completed");
//			Assert.assertTrue(false);
//			logger.info("Test Case is Failed");
//		}

	}
}
