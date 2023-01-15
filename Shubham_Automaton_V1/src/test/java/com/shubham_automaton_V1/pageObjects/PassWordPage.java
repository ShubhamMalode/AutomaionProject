package com.shubham_automaton_V1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassWordPage {

	WebDriver localdriver;

public PassWordPage(WebDriver remotedriver){
	localdriver=remotedriver;
	PageFactory.initElements(remotedriver, this);
}

//elements on the login page
	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(id = "signInSubmit")
	WebElement btnSignIn;

//action method

	public void setPass(String password) {
		txtPassword.sendKeys(password);
	}

	public void SignIn() {
		btnSignIn.click();
	}
}
