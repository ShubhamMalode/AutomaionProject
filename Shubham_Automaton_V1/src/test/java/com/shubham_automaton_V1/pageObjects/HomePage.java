package com.shubham_automaton_V1.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver localdriver;

	public HomePage(WebDriver remotedriver){
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	//elements on the login page
		@FindBy(name = "field-keywords")
		WebElement txtProductName;

		@FindBy(id = "nav-search-submit-button")
		WebElement btnSearch;

	//action method

		public void searchProduct(String productName) {
			txtProductName.sendKeys(productName);
		}

		public void clickSearchbtn() {
			btnSearch.click();
		}
}
