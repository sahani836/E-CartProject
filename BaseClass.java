package com.activetime.Testcases;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass  {
           // Readconfig readconfig =new Readconfig();
	        public String baseUrl="http://automationpractice.com/index.php";
	        		//readconfig.getApplicationUrl();
			public String Username="asahani836@gmail.com";
			public String Password="August2019!";
			public String Username1="asahani836@gmail.com";
			public String Passd="August2019";
			public static WebDriver driver;
			public static Logger logger;
			
			@BeforeClass
			public void setUp()
			{
				//String browserName = GenericLib.getValue("browser");
				  
				
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Reporter.log("Chrome launched",true);
			   logger=Logger.getLogger("Active_Time_Maven");
				PropertyConfigurator.configure("Log4j.properties");
			}
			
			@AfterClass
			public void tearDown()
			{
				driver.quit();
			}
				
			}
