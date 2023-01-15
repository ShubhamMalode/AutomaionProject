package com.shubham_automaton_V1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	WebDriver localdriver;

	public ProductsPage(WebDriver remotedriver) {
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}

	// elements on the login page
	@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal' and contains(text(),'Poco M3 Pro 5G (Cool Blue, 4GB RAM, 64GB Storage)')]")
	WebElement productNAme;

	// action method

	public void clickProductName() {
		productNAme.click();
	}
}
