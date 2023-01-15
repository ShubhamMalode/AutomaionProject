package com.shubham_automaton_V1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserNamePage {

	WebDriver localdriver;
	public UserNamePage(WebDriver remotedriver){
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	//elements on the login page
	@FindBy(name="email")
	WebElement txtUserName;
	
	@FindBy(id="continue")
	WebElement btnContinue;
	
	
	//action method
	
	public void setUserName(String userName) {
		txtUserName.sendKeys(userName);
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
}
