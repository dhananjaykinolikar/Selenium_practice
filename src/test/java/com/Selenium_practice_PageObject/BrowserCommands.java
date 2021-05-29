package com.Selenium_practice_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class BrowserCommands {
	
	WebDriver rdriver;
	
	
	public  BrowserCommands(WebDriver ldriver) {
		
		this.rdriver=ldriver;
		
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(name="firstname")  WebElement first_name;
	
	@FindBy(name="lastname")  WebElement last_name;
	
	@FindBy(name="sex")  WebElement gender;
	
	@FindBy(id="exp-5")  WebElement experience;
	
	@FindBy(id="datepicker")  WebElement date;
	
	@FindBy(id="profession-1")  WebElement profession;
	
	@FindBy(id="tool-2")  WebElement Automation_tools;
	
	@FindBy(id="continents")  WebElement Continents;
	
	@FindBy(name="selenium_commands")  WebElement seleniumcommands;
	
	@FindBy(name="photo")  WebElement upload_image;
	
	@FindBy(name="submit")  WebElement button;
	
	
	
	public void setfirstname(String firstname) {
		
		first_name.sendKeys(firstname);
		
	}
	
	public void setlastname(String lastname) {
		
		last_name.sendKeys(lastname);
		
	}
	
	public void checkgender() {
		
		gender.click();
			
		}
	
	public void checkexpirence() {
		
		experience.click();
			
		}
	
	public void setDate(String Date) {
		
		date.sendKeys(Date);
		
	}
	
	
	public void checkprofession() {
		
		profession.click();
			
		}
	
	public void checkAut_tool() {
		
		Automation_tools.click();
			
		}
	
	public void dropdownContinents(String continent) {
		
	Select dropdownContinents= new Select(Continents);
	
	dropdownContinents.selectByVisibleText(continent);
	
		}
	
	public void dropdownselenium_commands(String selenium_commands) {
		
	Select dropdownselenium_commands= new Select(seleniumcommands);
	
	dropdownselenium_commands.selectByVisibleText(selenium_commands);
	
		}
	
	public void clickupload_image(String uploadimage) {
		
		upload_image.sendKeys(uploadimage);
			
		}
	
	
	//
	public void clickbutton() {
			
		button.click();;
			
		}

}
