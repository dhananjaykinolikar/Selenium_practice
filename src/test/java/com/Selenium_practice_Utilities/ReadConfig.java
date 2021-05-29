package com.Selenium_practice_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File fs= new File(System.getProperty("user.dir")+"/Configuration/config.properties");
		
		try {
			FileInputStream fi= new FileInputStream(fs);
			pro = new Properties();
			pro.load(fi);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public String geturl() {
		String baseurl=pro.getProperty("Baseurl");
		return baseurl;
	}

}
