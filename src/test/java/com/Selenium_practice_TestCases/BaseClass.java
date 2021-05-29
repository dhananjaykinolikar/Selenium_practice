package com.Selenium_practice_TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Selenium_practice_Utilities.ReadConfig;



public class BaseClass {
	
	WebDriver driver;
	ReadConfig readconfig = new ReadConfig();
	
	public String url= readconfig.geturl();
	public static Logger logger;
	
	@BeforeClass
	public void Setup() {
		
		
		logger=Logger.getLogger("Selenium_practice");
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	
	@AfterClass
	public void teardown() {
		
		
		driver.quit();
		
	}
	
	public void Capturescreen(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/ScreenShots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("ScreenShot taken");
	}

}
