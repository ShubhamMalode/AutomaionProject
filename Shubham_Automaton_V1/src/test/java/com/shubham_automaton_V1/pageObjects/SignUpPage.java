package com.shubham_automaton_V1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
WebDriver localdriver;
	
	public SignUpPage(WebDriver remotedriver){
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}

	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement btnLogin;
	
	public void clickOnSignIn() {
		btnLogin.click();
	}
}
