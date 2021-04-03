package com.activetime.Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.activetime.PageObject.LoginPage;

public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseUrl);
		logger.info("URL is launched");
		LoginPage lp = new LoginPage(driver);
		lp.Signin();
		Thread.sleep(1000);
		lp.setUserName(Username);
		logger.info("User name Entered");
		lp.setPassword(Password);
		logger.info("Password is entered");
		lp.clikSubmit();
		String web = driver.getTitle();

		if (web.equals("My account - My Store")) {
			
			Assert.assertTrue(true);
			logger.info("Test Case is Passed");
			
//			 logger.info("-------All message type------");
//			 logger.info("-----------------------------------");
//			  logger.trace("Trace Message!");
//		      logger.debug("Debug Message!");
//		      logger.info("Info Message!");
//		      logger.warn("Warn Message!");
//		      logger.error("Error Message!");
//		      logger.fatal("Fatal Message!");
//		      
//		      logger.info("-----------------------------------");

		} else {
			Assert.assertTrue(false);

		}
		
	}

}
