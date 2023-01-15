package com.shubham_automaton_V1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {

	WebDriver localdriver;
	
	public LoginPageElement(WebDriver remotedriver){
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	//elements on the login page
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	//action method
	
	public void setUserName(String userName) {
		txtUserName.sendKeys(userName);
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
	
}
