package com.Selenium_practice_TestCases;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Selenium_practice_PageObject.BrowserCommands;
import com.Selenium_practice_Utilities.XLUtils;
import com.mysql.cj.log.Log;

public class TC_BrowserCommands_01 extends BaseClass {
	
	String firstname="Smith";
	String lastname="Enka";
	
	String Date="29/05/2021";
	
	String Continent="Europe";
	String Selenium_commands ="Wait Commands";
	
	
	@Test
	public void BrowserCommands() throws InterruptedException, IOException {
		
		System.out.println("I am opening page");
		
		logger.info("Web page is lunch");
		Thread.sleep(3000);
		
		BrowserCommands bc = new BrowserCommands(driver);
				
		String PageTitle=driver.getTitle();
		
		
		if(PageTitle.equalsIgnoreCase("Selenium Practice Form")) {
			System.out.println("PageTitle Is correct \n"+PageTitle);
		}
		else {
			System.out.println("PageTitle not correct \n"+PageTitle);
		}
		
		bc.setfirstname(firstname);
		Thread.sleep(1000);
		
		bc.setlastname(lastname);
		Thread.sleep(1000);
		
		bc.checkgender();
		Thread.sleep(1000);
		
		bc.checkexpirence();
		Thread.sleep(1000);
		
	
		
		bc.setDate(Date);
		Thread.sleep(1000);
		
		bc.checkprofession();
		Thread.sleep(1000);
		
		bc.checkAut_tool();
		Thread.sleep(1000);
		
		bc.dropdownContinents(Continent);
		Thread.sleep(1000);
		
		bc.dropdownselenium_commands(Selenium_commands);
		Thread.sleep(3000);
		
		bc.clickupload_image("F:\\movie.txt");
		Thread.sleep(3000);
		
		Capturescreen(driver,"TC_BrowserCommands_01");
		
		bc.clickbutton();
		Thread.sleep(3000);
		
		logger.info("TestCase End");
		
		
		
		
		
		
		
		
		
		
	}
	
	@DataProvider
	public String[][] getdata() throws IOException {
		
		String path =System.getProperty("user.dir")+"/src/test/java/com/Selenium_practice_TestData/LogData.xlsx";
		
		int rownum= XLUtils.getRowCount(path, "Sheet1");
		int colnum=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logdata[][] =new String[rownum][colnum];
		
		for(int i=0;i<rownum;i++) {
			
			for(int j=0;j<colnum;j++) {
				
				logdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1,0
			}
			
	}
		return logdata;
	}
		

}
