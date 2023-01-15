package com.shubham_automaton_V1.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	WebDriver localdriver;

	public ProductDetailsPage(WebDriver remotedriver) {
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}

	// elements on the login page
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;

	@FindBy(xpath = "//span[@id='attach-sidesheet-view-cart-button']")
	WebElement btnCart;

	@FindBy(xpath = "//p[@class='a-spacing-mini']/span/span[@class='currencyINR']")
	WebElement price;

	@FindBy(id = "//a[@id='nav-link-accountList']")
	public
	WebElement accountList;
	

	@FindBy(id = "//span[contains(text(),'Sign Out')]")
	WebElement signOut;
	
	
	// action method

	public void clickAddToCart() {
		addToCart.click();
	}

	public void clickOnCartBtn() {
		btnCart.click();
	}

	public String getProductPrice() {
		return price.getText();
	}
	
	public void clickOnSIgnOut() {
		signOut.click();
	}

}
